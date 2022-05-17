import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shroomish extends Pokemon {
    public Shroomish(String name, int level) {
        super(name, level);
        setStats(60, 40, 60, 40, 60, 35);
        setType(Type.GRASS);
        setMove(new DoubleTeam(Type.NORMAL, 0, 0));    //status
        setMove(new Tackle(Type.NORMAL, 40, 100), new Headbutt(Type.NORMAL, 70, 100));  //physical
    }
}