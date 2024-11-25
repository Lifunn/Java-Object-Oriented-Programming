package id.its.pbo;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Star {
    private JLabel starLabel;

    public Star(int screenWidth, int screenHeight) {
        starLabel = new JLabel();
        starLabel.setBounds(new Random().nextInt(screenWidth - 40), 0, 40, 40);
        starLabel.setIcon(loadIcon("love.png", starLabel.getWidth(), starLabel.getHeight()));
    }

    public JLabel getComponent() {
        return starLabel;
    }

    public void fall() {
        starLabel.setLocation(starLabel.getX(), starLabel.getY() + 5);
    }

    public boolean isOutOfSky(int screenHeight) {
        return starLabel.getY() > screenHeight;
    }

    private ImageIcon loadIcon(String fileName, int width, int height) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/" + fileName));
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }
}