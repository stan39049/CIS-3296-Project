package main.java.game;

public class Inventory {
    private Item item;
    public Inventory(){
        item = new Item();
    }

    public void use(){
        System.out.println("Inventory");
        item.use();
    }
}

