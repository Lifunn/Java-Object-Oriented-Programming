package id.its.pbo.keyboardevent;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class KeyboardPanel extends JPanel implements KeyListener {

    private List<Key> keys;

    public KeyboardPanel(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
        this.keys = new ArrayList<Key>();
        this.keys.add(new Key(20, 20, 'q'));
        this.keys.add(new Key(160, 20, 'w'));
        this.keys.add(new Key(300, 20, 'e'));
        this.keys.add(new Key(440, 20, 'r'));
        this.keys.add(new Key(580, 20, 't'));
        this.keys.add(new Key(720, 20, 'y'));
        this.keys.add(new Key(860, 20, 'u'));
        this.keys.add(new Key(1000, 20, 'i'));
        this.keys.add(new Key(1140, 20, 'o'));
        this.keys.add(new Key(1280, 20, 'p'));

        this.keys.add(new Key(100 - 20, 140, 'a'));
        this.keys.add(new Key(240 - 20, 140, 's'));
        this.keys.add(new Key(380 - 20, 140, 'd'));
        this.keys.add(new Key(520 - 20, 140, 'f'));
        this.keys.add(new Key(660 - 20, 140, 'g'));
        this.keys.add(new Key(800 - 20, 140, 'h'));
        this.keys.add(new Key(940 - 20, 140, 'j'));
        this.keys.add(new Key(1080 - 20, 140, 'k'));
        this.keys.add(new Key(1220 - 20, 140, 'l'));

        this.keys.add(new Key(100 + 80, 260, 'z'));
        this.keys.add(new Key(240 + 80, 260, 'x'));
        this.keys.add(new Key(380 + 80, 260, 'c'));
        this.keys.add(new Key(520 + 80, 260, 'v'));
        this.keys.add(new Key(660 + 80, 260, 'b'));
        this.keys.add(new Key(800 + 80, 260, 'n'));
        this.keys.add(new Key(940 + 80, 260, 'm'));


        this.addKeyListener(this);
        this.setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Render seluruh keys
        for (Key key : this.keys) {
            key.render(g);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Kosongkan metode ini
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        for (Key k : this.keys) {
            if (k.isSymbolMatch(key)) {
                k.setPressed();
                repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char key = e.getKeyChar();
        for (Key k : this.keys) {
            if (k.isSymbolMatch(key)) {
                k.setReleased();
                repaint();
            }
        }
    }
}
