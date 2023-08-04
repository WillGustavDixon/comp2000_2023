import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;
import org.w3c.dom.events.MouseEvent;
import java.awt.*;

public class Main extends JFrame {
    static int windSize = 720;
    static int cellSize = 35;
    static int margin = 10;
    static Color bg = new Color(255, 255, 255);
    public static void main(String[] args) throws Exception {
        System.out.println("Red vs. Blue");
        Main window = new Main();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(windSize, windSize));
        }

        @Override
        public void paint(Graphics g) {
            Point p = getMousePosition();
            while(p.x > 800 || p.y > 800) {
                Grid grid = new Grid(windSize, cellSize, margin, bg);
                grid.createCells();
                p = getMousePosition();
                grid.drawGrid(g, p);
            }
        }
    }
}

