import java.util.HashSet;
import java.util.List;
import java.util.Set;

record User3(String username, String email) {}

public class Bai4 {
    public static void main(String[] args) {
        List<User3> users = List.of(
                new User3("alice", "alice@gmail.com"),
                new User3("bob", "bob@yahoo.com"),
                new User3("alice", "alice123@gmail.com"),
                new User3("charlie", "charlie@gmail.com")
        );

        Set<String> seen = new HashSet<>();

        users.stream().filter(u -> seen.add(u.username())).forEach(System.out::println);
    }
}