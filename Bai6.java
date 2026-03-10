import java.util.List;

class Post {
    private String title;
    private List<String> tags;

    public Post(String title, List<String> tags) {
        this.title = title;
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }
}

public class Bai6 {
    public static void main(String[] args) {

        List<Post> posts = List.of(
                new Post("Java Post", List.of("java", "backend")),
                new Post("Python Post", List.of("python", "data"))
        );
        //toList thu thập kết quả Stream thành List
        List<String> allTags = posts.stream().flatMap(post -> post.getTags().stream()).toList();

        System.out.println(allTags);
    }
}