package id.its.pbo;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private Basket basket;
    private Star star;
    private Timer gameTimer;
    private int score = 0;
    private SoundPlayer coinSound;


    public GamePanel() throws UnsupportedAudioFileException, LineUnavailableException, IOException, IOException {
        setFocusable(true);
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        addKeyListener(this);

        basket = new Basket(800, 600);
        add(basket.getComponent());

        star = new Star(800, 600);
        add(star.getComponent());

        gameTimer = new Timer(1, this);
        gameTimer.start();

        coinSound = new SoundPlayer("suara.wav");

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            basket.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            basket.moveRight(getWidth());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

        private void generateNewStar() {
        remove(star.getComponent());
        star = new Star(800, 600);
        add(star.getComponent());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        star.fall();
        if (star.isOutOfSky(getHeight())) {
            generateNewStar();
            score--;
        }

        if (basket.isCollidedWith(star)) {
            score++;
            coinSound.play();
            generateNewStar();
        }


        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLACK);
        g.drawString("Cintaku Padamu: " + score, 10, 20);
    }
}