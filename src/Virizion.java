import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Virizion extends Pokemon {
    public Virizion(String name, int level) {
        super(name, level);
        setStats(91, 90, 72, 90, 129, 108);
        setType(Type.GRASS, Type.FIGHTING);
        setMove(new FocusBlast(Type.FIGHTING, 120, 70), new GigaDrain(Type.GRASS, 120, 100));   //special
        setMove(new CloseCombat(Type.FIGHTING, 120, 100), new Facade(Type.NORMAL, 70, 100)); //physical
    }
}



