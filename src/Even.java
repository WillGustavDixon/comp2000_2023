import java.util.List;
import java.util.Random;

public class Even implements ActorBehaviour {

    @Override
    public int setMovement(Cell loc, List<Cell> posMoves) {
        return (new Random()).nextInt(posMoves.size());
    }

}