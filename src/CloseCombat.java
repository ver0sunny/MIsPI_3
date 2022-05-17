import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

class CloseCombat extends PhysicalMove {
    public CloseCombat(Type type, int pow, int acc) {
        super();
    }

    @Override
    protected String describe() {
        return "идёт бычить";
    }

    protected void applyOppEffects(Pokemon poki) {
        poki.setMod(Stat.SPECIAL_DEFENSE, -1);
        poki.setMod(Stat.DEFENSE, -1);
    }
}
