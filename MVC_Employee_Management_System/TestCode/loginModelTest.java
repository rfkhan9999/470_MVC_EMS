import Model.loginModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loginModelTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isValidUser() {
        try {
            loginModel loginmodel = new loginModel("rafid", "rafid");
            Boolean bool = loginmodel.isValidUser();

            assertTrue(bool);

        } catch (Exception e) {
            fail("Problemo");

        }
    }
}