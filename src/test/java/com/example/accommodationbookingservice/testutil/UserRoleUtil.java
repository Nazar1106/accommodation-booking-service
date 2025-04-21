package com.example.accommodationbookingservice.testutil;

import com.example.accommodationbookingservice.dto.roletype.RoleTypeDto;
import com.example.accommodationbookingservice.entity.user.Role;
import com.example.accommodationbookingservice.entity.user.RoleName;
import java.util.Set;

public class UserRoleUtil {

    public static Set<Role> getRole() {
        Role role = new Role();
        RoleName roleName = RoleName.ADMIN;
        role.setId(1L);
        role.setRole(roleName);
        return Set.of(role);
    }

    public static Role getRoleAdmin() {
        Role role = new Role();
        RoleName roleName = RoleName.ADMIN;
        role.setId(1L);
        role.setRole(roleName);
        return role;
    }

    public static Set<RoleTypeDto> getRolesTypeDto() {
        RoleTypeDto roleTypeDto = new RoleTypeDto();
        roleTypeDto.setId(1L);
        roleTypeDto.setName("ADMIN");
        return Set.of(roleTypeDto);
    }

}
