import java.util.List;

record User1(String username, String email) {}

public class Bai2 {
    public static void main(String[] args) {
        List<User1> users = List.of(
                new User1("alice", "alice@gmail.com"),
                new User1("bob", "bob@yahoo.com"),
                new User1("charlie", "charlie@gmail.com")
        );

        users.stream().filter(u -> u.email().endsWith("@gmail.com")).map(User1::username).forEach(System.out::println);
    }
}