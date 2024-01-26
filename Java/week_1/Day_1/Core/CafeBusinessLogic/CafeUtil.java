import java.util.ArrayList;
public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <= 10; i++){
            sum = sum + i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for (int i = 0; i < prices.length; i++){
            total = total + prices[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.printf(i  +  menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.printf("Hello " + username + " There are "+ customers.size() + " people in front of you");
        System.out.println(customers);
        customers.add(username);
    }
}