import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoran extends Pokemon {
    public Nidoran(String name, int level) {
        super(name, level);
        setStats(55, 47, 52, 40, 40, 41);
        setType(Type.POISON);
        setMove(new Thunder(Type.ELECTRIC, 110, 70), new Blizzard(Type.ICE, 110, 70));   //special
    }
}
