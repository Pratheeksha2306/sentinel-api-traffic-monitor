
import java.util.HashMap;
import java.util.Map;

public class RequestCounter {
    public static void main(String[] args) {

        Map<String, Integer> requests = new HashMap<>();

        String user = "user1";

        requests.put(user, requests.getOrDefault(user, 0) + 1);
        requests.put(user, requests.getOrDefault(user, 0) + 1);
        requests.put(user, requests.getOrDefault(user, 0) + 1);

        System.out.println("User: " + user);
        System.out.println("Total requests: " + requests.get(user));
    }
}
