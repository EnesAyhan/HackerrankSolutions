import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Day03.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double price = 0;
        int price1 = 0;
        price = meal_cost + ((meal_cost * tip_percent) / 100) + ((meal_cost * tax_percent) / 100);
        price1 = (int) price;
        if (price > price1 + 0.5) {
            System.out.println(price1 + 1);
        } else System.out.println(price1);

    }
}

