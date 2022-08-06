package cc.glong.usercenter.model.params;

import lombok.Data;

@Data
public class RegisterParam {
    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
