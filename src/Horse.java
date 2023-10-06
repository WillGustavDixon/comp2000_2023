public class Horse {
  String path = "assets/Chess_tile_nl.png";
  Cell inLoc;
  boolean isHuman;

  public Horse(Cell loc, boolean human) {
    inLoc = loc;
    isHuman = human;
  }
  
  public Motif setImg() {
    return new Motif(path);
  }
}
