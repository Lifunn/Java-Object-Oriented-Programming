package Quiz;

public class EnemyPlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("Hero", 100, 40, 10);
        Enemy enemy1 = new Enemy("Villain", 80, 35, 8);

        // Memulai pertarungan antara Hero dan Villain
        player1.attack(enemy1);
    }
}
