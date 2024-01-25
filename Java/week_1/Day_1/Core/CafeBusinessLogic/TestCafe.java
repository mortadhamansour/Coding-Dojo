import java.util.ArrayList;
public class TestCafe {
    public static void main(String[] args){
        CafeUtil myCafe = new CafeUtil();

        int testGetStreakGoal = myCafe.getStreakGoal();
        System.out.println(testGetStreakGoal);

        double[] prices = new double[] {1.5, 2.5, 4.0, 4.5};
        double testGetOrderTotal = myCafe.getOrderTotal(prices);
        System.out.println(testGetOrderTotal);

        ArrayList<String> menuItems = new ArrayList<String>(); 
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        myCafe.displayMenu(menuItems);

        ArrayList<String> customers = new ArrayList<String>(); 
        for (int i = 0; i < 4; i++){
            myCafe.addCustomer(customers);
            System.out.println(customers);
        }
    }
}