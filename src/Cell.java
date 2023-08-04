import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.*;

public class Cell {
    int size; // size of each cell
    int xPos; // x position of this cell
    int yPos; // y position of this cell
    Color cellColour; // colour of this cell
    Color cellOutline; // outline colour of this cell

    Cell(int s, int x, int y, Color f, Color o) {
        size = s;
        xPos = x;
        yPos = y;
        cellColour = f;
        cellOutline = o;
    }

    void drawCell(Graphics g, Point p) {
        g.setColor(cellOutline);
        g.drawRect(xPos, yPos, size, size);
        if((p.x > xPos && p.x < xPos+size) && (p.y > yPos && p.y < yPos+size)) {
            g.setColor(new Color(127, 127, 127));
        }
        else {
            g.setColor(cellColour);
        }
        g.fillRect(xPos+1, yPos+1, size-1, size-1);
    }
}