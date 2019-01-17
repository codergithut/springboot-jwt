package com.tianjian.config.data;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tianjian on 2019/1/18.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
