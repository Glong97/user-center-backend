package cc.glong.usercenter.service;


import cc.glong.usercenter.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author Glong
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2022-08-04 16:48:09
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request HttpServletRequest
     * @return User对象
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


}
