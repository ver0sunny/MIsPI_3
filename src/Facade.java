import ru.ifmo.se.pokemon.*;

class Facade extends PhysicalMove {
    public Facade(Type type, int pow, int acc) {
    }

    @Override
    protected String describe() {
        return "бьёт уверенностью";
    }

    protected void applyOppDamage(Pokemon poki, double damage) {
        if ((poki.getCondition() == Status.BURN) | (poki.getCondition() == Status.POISON) | (poki.getCondition() == Status.PARALYZE))
            poki.setMod(Stat.HP, (int) Math.round(damage)*2);
    }
}