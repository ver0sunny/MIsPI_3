import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

class GigaDrain extends SpecialMove {
    public GigaDrain(Type type, int pow, int acc) {
    }
    @Override
    protected String describe() {
        return "засасывает";
    }

    protected void applyOppDamage(Pokemon poki, double damage){
        poki.setMod(Stat.HP, (int) Math.round(damage)*2);
    }
}

