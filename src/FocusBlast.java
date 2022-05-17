import ru.ifmo.se.pokemon.*;

class FocusBlast extends SpecialMove {
    public FocusBlast(Type type, int pow, int acc) {
    }

    @Override
    protected String describe() {
        return "делает фокус-покус";
    }

    protected void applyOppEffects(Pokemon poki) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        poki.addEffect(e);
//        if (Math.random() <= 0.1) poki.setMod(Stat.SPECIAL_DEFENSE,-1);
    }
}
