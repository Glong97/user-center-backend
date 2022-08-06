package cc.glong.usercenter.service.impl;

import cc.glong.usercenter.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServletRequest;


@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private HttpServletRequest request;

    @Test
    public void testUserService(){
        User user = new User();
        user.setId(1L);
        user.setUserName("test666");
        user.setUserAccount("test");
        user.setAvatarUrl("test");
        user.setGender(0);
        user.setUserPassword("test");
        user.setPhone("test");
        user.setEmail("test");
        boolean save = userServiceImpl.updateById(user);
        Assertions.assertTrue(save);
    }

    /**
     * 测试用户注册
     */
    @Test
    void userRegister() {
        String userAccount = "glong";
        String userPassword = "85760016";
        String checkPassword = "85760016";
        long userId = userServiceImpl.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertNotEquals(-1, userId);
    }

    /**
     * 测试用户登录功能
     */
    @Test
    void userLogin() {
        String userAccount = "glong";
        String userPassword = "85760016";
        User user = userServiceImpl.userLogin(userAccount, userPassword, request);
        System.out.println(user);
    }
}