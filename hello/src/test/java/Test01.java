import com.xs.service.UserService;
import org.junit.Test;

public class Test01 {
    @Test
    public void test01() throws Exception {
        UserService userService = new UserService();
        userService.getUser();
    }
}
