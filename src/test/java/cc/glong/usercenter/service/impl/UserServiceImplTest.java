package cc.glong.usercenter.service.impl;

import cc.glong.usercenter.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userServiceImpl;

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
}