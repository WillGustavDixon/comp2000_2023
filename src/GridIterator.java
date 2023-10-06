import java.util.Iterator;

import java.util.Iterator;

public class GridIterator implements Iterator<Cell>{
    Cell[][] cells;
    int cPos = 0;
    int rPos = 0;
    
    public GridIterator(Cell[][] c) {
        cells = c;
    }

    public Cell next() {
        Cell cell = cells[rPos][cPos];
        cPos++;
        if (cPos >= cells[rPos].length) {
            rPos++;
            cPos = 0;
        }
        return cell;
    }

    public boolean hasNext() {
        if (rPos >= cells.length) { // check if out of rows
            return false;
        }
        return true;
    }
}
