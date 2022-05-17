import ru.ifmo.se.pokemon.Type;

public class Nidoqueen extends Nidorina {
    public Nidoqueen(String name, int level) {
        super(name, level);
        setStats(90, 92, 87, 75, 85, 76);
        addType(Type.GROUND);
        addMove(new Superpower(Type.FIGHTING, 120, 100));
    }
}
