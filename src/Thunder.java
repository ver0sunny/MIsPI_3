import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(Type type, int pow, int acc) {
    }

    @Override
    protected String describe() { return "!бах!1*!бух!"; }

    protected void applyOppEffects(Pokemon poki) {
        Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
        poki.addEffect(e);
    }
}
