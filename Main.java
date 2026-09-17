import java.awt.*;

public class Main extends Frame {

    public Main() {
        setTitle("Drawing a Circle");
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(100, 100, 200, 200);
    }

    public static void main(String[] args) {
        new Main();
    }
}
