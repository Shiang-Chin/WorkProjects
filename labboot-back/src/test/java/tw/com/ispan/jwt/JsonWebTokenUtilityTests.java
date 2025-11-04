package tw.com.ispan.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JsonWebTokenUtilityTests {
    @Autowired
    private JsonWebTokenUtility jwtUtility;

    @Test
    public void testSigned() {
        String token = jwtUtility.createToken("this is test data one.");
        System.out.println("token" + token);
        String data = jwtUtility.validateToken(token);
        System.out.println("data" + data);
        System.out.println("----");

    }

    @Test
    public void testEncrypted() {
        String token = jwtUtility.createEncryptedToken("this is test data two.");
        System.out.println("token" + token);
        String data = jwtUtility.validateEncryptedToken(token);
        System.out.println("data" + data);
        System.out.println("----");

    }
}
