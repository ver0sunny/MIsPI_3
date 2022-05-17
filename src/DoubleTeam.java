import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;

class DoubleTeam extends StatusMove {
    public DoubleTeam(Type type, int pow, int acc) {
    }

    @Override
    protected void applySelfEffects(Pokemon poki) {
        poki.setMod(Stat.EVASION,+1);
    }
}
