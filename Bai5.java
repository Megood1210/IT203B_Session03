import java.util.Comparator;
import java.util.List;

public class Bai5 {
    public static void main(String[] args) {

        List<User3> users = List.of(
                new User3("alexander", "a@gmail.com"),
                new User3("charlotte", "c@gmail.com"),
                new User3("Benjamin", "b@gmail.com"),
                new User3("tom", "t@gmail.com"),
                new User3("anna", "a@yahoo.com")
        );

        users.stream().sorted(Comparator.comparingInt((User3 u) -> u.username().length()).reversed()).limit(3).forEach(u -> System.out.println(u.username()));
    }
}