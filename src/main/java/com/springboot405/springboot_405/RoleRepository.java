package com.springboot405.springboot_405;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
