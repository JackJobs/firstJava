import api.mengkang.net.Request;
import api.mengkang.net.api.UserController;
import org.junit.Test;

public class TestUserInfo {

    @Test
    public void getUserInfo() {
        Request request = null;
        UserController userController = new UserController(request);
        Object res = userController.get();
        System.out.println(res);
    }
}
