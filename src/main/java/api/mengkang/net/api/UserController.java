package api.mengkang.net.api;

import api.mengkang.net.ErrorCode;
import api.mengkang.net.Request;
import api.mengkang.net.Response;
import api.mengkang.net.model.UserModel;

public class UserController extends BaseController {

    public UserController(Request request) {
        super(request);
    }

    public Object get() {
        int uid;
        if (!request.getParameters().containsKey("id")) {
            return new Response(ErrorCode.PARAMETER_INVALID);
        }

        try {
            uid = Integer.parseInt(request.getParameters().get("id").get(0));
        } catch (NumberFormatException e) {
            return new Response(ErrorCode.PARAMETER_INVALID);
        }

        return UserModel.getUserInfoById(uid);
    }

    public Object update() {
        int age;
        int sex;
        String gender;
        String username;
        try {
            age = Integer.parseInt(request.getParameters().get("age").get(0));
            gender = request.getParameters().get("gender").get(0);
            if (gender.equals("male")) {
                sex = 0;
            } else {
                sex = 1;
            }
            username = request.getParameters().get("username").get(0);
            if (gender.isEmpty()) {
                username = "";
            }
            return UserModel.insertUser(age, sex, username);
        } catch (Exception e) {
            return new Response(ErrorCode.PARAMETER_INVALID);
        }
    }
}
