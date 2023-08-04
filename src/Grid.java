import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.*;

class Grid {
    int gridSize; // the size of the grid before subtracting the margins
    int cellSize; // the size of each cell.
    int margin; // the amount to take off the sides of the grid
    Color bgColour; // the background colour of the grid.
    Cell[][] cells; // the amount of cells to make, by row.

    Grid(int w, int c, int m, Color rgb) {
        gridSize = w;
        cellSize = c;
        margin = m;
        bgColour = rgb;
        cells = new Cell[gridSize/cellSize][gridSize/cellSize];
    }

    public void createCells() {
        int row = 0; // first []
        int col = 0; // second []
        Color cellFill = new Color(255, 255, 255); // for testing
        Color cellOut = new Color(0, 0, 0); // for testing
        for(int i = margin; i < gridSize - margin; i += cellSize) {

            for(int j = margin; j < gridSize - margin; j += cellSize) {
                Cell c = new Cell(cellSize, i, j, cellFill, cellOut);
                cells[row][col] = c;
                col++;
            }
            row++;
            col = 0;
        }
    }

    public void drawGrid(Graphics g, Point p) {
        for(int i = 0; i < cells.length; i++) {
            for(int j = 0; j < cells[i].length; j++) {
                cells[i][j].drawCell(g, p);
            }
        }
    }
}
