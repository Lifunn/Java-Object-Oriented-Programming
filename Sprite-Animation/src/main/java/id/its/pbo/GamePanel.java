package id.its.pbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private final int ANIMATION_INTERVAL = 100;
    private Timer animationTimer;
    private Player player;

    public GamePanel() {
        setFocusable(true);
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        try {
            player = new Player("/rpg_sprite_walk.png", new Point(50, 50));
        } catch (IOException e) {
            e.printStackTrace();
        }

        animationTimer = new Timer(ANIMATION_INTERVAL, this);
        animationTimer.start();

        addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (player != null) {
            player.draw(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (player != null) {
            player.animate();
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (player != null) {
            player.walk(e.getKeyCode(), getWidth(), getHeight());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (player != null) {
            player.stopWalking();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}
}
