public class TestOrders {
    public static void main(String[] args){


        Item item1 = new Item("drip coffee", 1.60);
        Item item2 = new Item("cappuccino", 2.45);
        Item item3 = new Item("iced coffee", 2.15);
        Item item4 = new Item("mocha", 3.10);


        Order order1 = new Order();
        Order order2 = new Order();


        Order order3 = new Order("Bob");
        Order order4 = new Order("Sammy");
        Order order5 = new Order("Tina");


        order1.addItem(item4);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item3);


        System.out.println(order5.getStatusMessage());
        order5.setReady(true);
        System.out.println(order5.getStatusMessage());
        System.out.println(order5.getOrderTotal());
        order5.display();
    }
}