package com.example.tasklist.web.security.expression;


import com.example.tasklist.domain.entity.user.Role;
import com.example.tasklist.service.UserService;
import com.example.tasklist.web.security.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;


@Component("cse")
@RequiredArgsConstructor
public class CustomSecurityExpression {

    private final UserService userService;

    public boolean canAccessUser(Long id) {
        CustomUserDetails user = getPrincipal();
        Long userId = user.getId();

        return userId.equals(id) || hasAnyRole(Role.ROLE_ADMIN);
    }

    private boolean hasAnyRole(Role... roles) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        for (Role role : roles) {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.name());
            if (authentication.getAuthorities().contains(authority)) {
                return true;
            }
        }
        return false;
    }

    public boolean canAccessTask(Long taskId) {
        CustomUserDetails user = getPrincipal();
        Long userId = user.getId();

        return userService.isTaskOwner(taskId, userId);
    }

    private CustomUserDetails getPrincipal() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return (CustomUserDetails) authentication.getPrincipal();
    }
}
