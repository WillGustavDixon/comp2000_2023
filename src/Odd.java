import java.util.List;

public class Odd implements ActorBehaviour {

    @Override
    public int setMovement(Cell loc, List<Cell> posMoves) {
        int leftmost = loc.col;
        for(int i = 0; i < posMoves.size(); i++) {
            int temp = posMoves.get(i).col;
            if(temp < leftmost) {
                leftmost = temp;
            }
        }
        return leftmost;
    }

}