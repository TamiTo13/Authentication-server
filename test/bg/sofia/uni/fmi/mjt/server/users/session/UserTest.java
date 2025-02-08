package bg.sofia.uni.fmi.mjt.server.users.session;

import bg.sofia.uni.fmi.mjt.server.executor.parser.password.PasswordManager;
import bg.sofia.uni.fmi.mjt.server.users.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testOfMethod() {
        String userLine = "testUser;hashedPassword;Tami;Rufatov;tami.rufatov@example.com;true";
        User user = User.of(userLine);

        assertEquals("testUser", user.getUsername());
        assertEquals("hashedPassword", user.getPassword());
        assertEquals("Tami", user.getFirstName());
        assertEquals("Rufatov", user.getLastName());
        assertEquals("tami.rufatov@example.com", user.getEmail());
        assertEquals(true, user.isAdmin());
    }

    @Test
    public void testFormatUserMethod() {
        User user = new User("testUser", "password", "Tami", "Rufatov", "tami.rufatov@example.com", true);
        String formattedUser = User.formatUser(user);
        String expectedFormattedUser = "testUser;" + PasswordManager.hashPassword("password") + ";Tami;Rufatov;tami.rufatov@example.com;true";

        assertEquals(expectedFormattedUser, formattedUser);
    }
}

