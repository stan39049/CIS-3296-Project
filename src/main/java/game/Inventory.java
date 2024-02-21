package main.java.game;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

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

