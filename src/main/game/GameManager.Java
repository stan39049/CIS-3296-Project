package main.game;

public class GameManager {
    private Player player;
    private Enemy enemy;
    public GameManager(){
        player = new Player();
        enemy = new Enemy();
    }
}