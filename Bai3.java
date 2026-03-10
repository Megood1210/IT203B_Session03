import java.util.List;
import java.util.Optional;

record User2(String username, String email) {}

class UserRepository {
    private List<User2> users = List.of(
            new User2("alice", "alice@gmail.com"),
            new User2("bob", "bob@yahoo.com"),
            new User2("charlie", "charlie@gmail.com")
    );

    public Optional<User2> findUserByUsername(String username) {
        return users.stream().filter(u -> u.username().equals(username)).findFirst();
    }
}

public class Bai3 {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        // ifPresentOrElse trả về Welcome alice nếu có còn không thì Guest Login
        repo.findUserByUsername("alice").ifPresentOrElse(u -> System.out.println("Welcome " + u.username()), () -> System.out.println("Guest login"));
    }
}