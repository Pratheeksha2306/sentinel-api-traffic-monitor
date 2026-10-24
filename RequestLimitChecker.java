
import java.util.HashMap;
import java.util.Map;

public class RequestLimitChecker {

    public static void main(String[] args) {

        Map<String, Integer> requests = new HashMap<>();

        String user = "user1";
        int limit = 3;

        for (int i = 1; i <= 5; i++) {
            int count = requests.getOrDefault(user, 0) + 1;
            requests.put(user, count);

            if (count <= limit) {
                System.out.println("Request " + i + ": Allowed");
            } else {
                System.out.println("Request " + i + ": Blocked - Limit Exceeded");
            }
        }
    }
}
