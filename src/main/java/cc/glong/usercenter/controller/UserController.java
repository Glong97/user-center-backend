package cc.glong.usercenter.controller;

import cc.glong.usercenter.model.entity.User;
import cc.glong.usercenter.model.params.LoginParam;
import cc.glong.usercenter.model.params.RegisterParam;
import cc.glong.usercenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * User Controller
 *
 * @author Glong
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public long userRegister(@RequestBody RegisterParam registerParam){
        if(registerParam == null){
            return -1;
        }

        String checkPassword = registerParam.getCheckPassword();
        String userPassword = registerParam.getUserPassword();
        String userAccount = registerParam.getUserAccount();

        return userService.userRegister(userAccount, userPassword, checkPassword);
    }

    @PostMapping("/login")
    public User userLogin(@RequestBody LoginParam loginParam, HttpServletRequest request){
        String userAccount = loginParam.getUserAccount();
        String userPassword = loginParam.getUserPassword();
        return userService.userLogin(userAccount, userPassword, request);
    }

}
