import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stage {
  Grid grid;
  List<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<>();
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(Actor a: actors) {
      a.paint(g);
    }

    String cDisplay = "";
    Optional<Cell> mouseOverCell = grid.cellAtPoint(mouseLoc);
    if (mouseOverCell.isPresent()) {
      cDisplay = mouseOverCell.get().toString();
    }
    else {
      cDisplay = "Mouse is not over a cell";
    }
    g.setColor(Color.black);
    g.drawString(cDisplay, 740, 50);
  }
}
