package com.example.sport.repository;

import com.example.sport.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * user.
 *
 * @author wei
 * @date 2023/3/4 20:03
 */
public interface UserRepository extends JpaRepository<SysUser, Integer> {

    /**
     * 根据邮箱查询用户信息.
     *
     * @param username 用户名
     * @return 用户信息
     */
    Optional<SysUser> findByUsername(String username);
}
