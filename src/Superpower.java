import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Superpower extends PhysicalMove {
    public Superpower(Type type, int pow, int acc) {
    }
    @Override
    protected String describe() {
        return "просто круто бьёт";
    }

    protected void applySelfEffects(Pokemon poki) {
        poki.setMod(Stat.SPECIAL_DEFENSE,-1);
        poki.setMod(Stat.SPECIAL_ATTACK,-1);
    }
}
