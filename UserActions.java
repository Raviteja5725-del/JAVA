class User {
    String username;
    int followers;

    void follow(String person) {
        System.out.println(username + " followed " + person);
    }

    void post(String caption) {
        System.out.println(username + " posted: " + caption);
    }
}

public class UserActions {
    public static void main(String[] args) {
        User u = new User();
        u.username = "Arun";
        u.followers = 150;

        u.follow("Megha");
        u.post("Exploring Java OOP!");
    }
}
