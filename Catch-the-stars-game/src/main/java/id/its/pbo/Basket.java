package id.its.pbo;

import javax.swing.*;
import java.awt.*;

public class Basket {
    private JLabel basketLabel;

    public Basket(int screenWidth, int screenHeight) {
        basketLabel = new JLabel();
        basketLabel.setBounds(screenWidth / 2 - 60, screenHeight - 150, 120, 120);
        basketLabel.setIcon(loadIcon("rajan.png", basketLabel.getWidth(), basketLabel.getHeight()));
    }

    public JLabel getComponent() {
        return basketLabel;
    }

    public void moveLeft() {
        basketLabel.setLocation(basketLabel.getX() - 30, basketLabel.getY());
    }

    public void moveRight(int screenWidth) {
        basketLabel.setLocation(basketLabel.getX() + 30, basketLabel.getY());
    }

    private ImageIcon loadIcon(String fileName, int width, int height) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/" + fileName));
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public boolean isCollidedWith(Star star) {
        return basketLabel.getBounds().intersects(star.getComponent().getBounds());
    }
}