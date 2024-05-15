package Qualifier;
import java.util.*;

public class DiscountRateCalculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        HashMap<String, String> dor = new LinkedHashMap<>();
        HashMap<String, Integer> amt = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String id = input[0];
            String date = input[1];
            int amount = Integer.parseInt(input[2]);

            dor.put(id, date);
            amt.put(id, amount);
        }

        ArrayList<String> res = UserMainCodes.calculateDiscount(dor, amt);

        for (String x : res) {
            System.out.println(x);
        }
        sc.close();
    }
}
