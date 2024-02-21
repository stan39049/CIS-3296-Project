package main.java.game;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Player {
    Inventory inventory;
    Stats stats;
    Equipment equipment;
    public Player(){
        inventory = new Inventory();
        stats = new Stats();
        equipment = new Equipment();
    }

    public void use(){
        System.out.println("Player");
        inventory.use();
        stats.use();
        equipment.use();
    }
}
