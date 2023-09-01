import java.util.List;

public interface ActorBehaviour {
    public int setMovement(Cell loc, List<Cell> posMoves);
}
