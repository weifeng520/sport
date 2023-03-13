package com.example.sport.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * .
 *
 * @author wei
 * @date 2023/3/4 22:00
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    /**
     * 用户名.
     */
    private String username;

    /**
     * 密码.
     */
    private String password;
}
