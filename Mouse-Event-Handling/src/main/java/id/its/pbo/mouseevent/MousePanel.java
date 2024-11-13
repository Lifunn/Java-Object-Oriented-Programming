package id.its.pbo.mouseevent;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousePanel extends JPanel implements MouseListener{

    private int areaWidth;
    private int areaHeight;
    private String text;

    public MousePanel(int width, int height) {
        this.areaWidth = width;
        this.areaHeight = height;
        this.setPreferredSize(new Dimension(areaWidth, areaHeight));
        this.text = "Lakukan sesuatu menggunakan mouse...";

        this.addMouseListener(this);
        this.setFocusable(true);

    }
    public void mouseClicked(MouseEvent e) {
        this.text = "Tombol mouse diklik pada posisi X: " + e.getX() + " Y: " + e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        this.text = "Tombol mouse ditekan pada posisi X: " + e.getX() + " Y: " + e.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        this.text = "Tombol mouse dilepas pada posisi X: " + e.getX() + " Y: " + e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        this.text = "Mouse memasuki area MousePanel";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        this.text = "Mouse meninggalkan area MousePanel";
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(this.text, 0, this.areaHeight / 2);
    }

}