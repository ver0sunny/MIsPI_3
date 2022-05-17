import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard(Type type, int pow, int acc) {
    }

    @Override
    protected String describe() {
        return "фризит противника";
    }

    protected void applyOppEffects(Pokemon poki) {
        Effect e = new Effect().chance(0.3).condition(Status.FREEZE);
        poki.addEffect(e);
    }
}