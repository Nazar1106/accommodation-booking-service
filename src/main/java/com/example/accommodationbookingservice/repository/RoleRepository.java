package com.example.accommodationbookingservice.repository;

import com.example.accommodationbookingservice.entity.user.Role;
import com.example.accommodationbookingservice.entity.user.RoleName;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query("SELECT r FROM Role r WHERE r.role = :roleName")
    Role findByRoleName(RoleName roleName);

    @Query("SELECT r FROM User u JOIN u.roles r WHERE u.id = :userId")
    Set<Role> findRolesByUserId(@Param("userId") Long userId);
}
