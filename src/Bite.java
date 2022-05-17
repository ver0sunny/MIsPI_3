import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Bite extends PhysicalMove {
    public Bite(Type type, int pow, int acc) {
    }
    
    @Override
    protected String describe() {
        return "делает кусь";
    }
    @Override
    protected void applyOppEffects(Pokemon poki) {
        if (Math.random() <= 0.3) Effect.flinch(poki);
    }
}
