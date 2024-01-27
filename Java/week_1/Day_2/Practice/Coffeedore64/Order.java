import java.util.ArrayList;

public class Order {

    // MEMBER VARIABLES
    private String name;
    private boolean ready; 
    private ArrayList<Item> items; 

    // CONSTRUCTOR
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS
    public void addItem(Item item){
        items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }
        return "Thank you for waiting, your order will be ready soon.";
    }

    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name: "+this.name);
        for(Item item : items){
            System.out.println(item.getName()+" - $"+item.getPrice());
        }
        System.out.println("Total: $"+getOrderTotal());
    }
    
    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}