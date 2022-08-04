package cc.glong.usercenter.service.impl;

import cc.glong.usercenter.mapper.UserMapper;
import cc.glong.usercenter.model.User;
import cc.glong.usercenter.service.UserService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author Glong
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2022-08-04 16:48:09
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




