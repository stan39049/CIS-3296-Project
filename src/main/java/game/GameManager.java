package main.java.game;

public class GameManager {
    private Player player;
    private Enemy enemy;
    private Shop shop;
    public GameManager(){
        player = new Player();
        enemy = new Enemy();
        shop = new Shop();
    }

    public void use(){
        System.out.println("Manager");
        player.use();
        enemy.use();
        shop.use();
    }
}
