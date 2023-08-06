package com.security.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.security.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
