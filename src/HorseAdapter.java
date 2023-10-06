import java.awt.Graphics;
import java.awt.Color;

public class HorseAdapter extends Actor {
    Horse horse;

    public HorseAdapter(Horse equine) {
        super(equine.inLoc, Color.WHITE, equine.isHuman, 1);
        horse = equine;
    }

    @Override
    public void paint(Graphics g) {
        Motif horseImg = horse.setImg();
        if (animBeat.inPhase() == 'a') {
            horseImg.draw(g, loc.x, loc.y, Color.WHITE);
        }
        else {
            horseImg.draw(g, loc.x, loc.y, Color.PINK);
        }
        
    }

    public void setPoly() {
        // pretend this exists
    }
}
