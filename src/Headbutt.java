import ru.ifmo.se.pokemon.*;

class Headbutt extends PhysicalMove {
    public Headbutt(Type type, int pow, int acc) {
    }

    @Override
    protected String describe() {
        return "кидает попку в лицо";
    }

    protected void applyOppEffects(Pokemon poki) {
        if (Math.random() <= 0.3) Effect.flinch(poki);
    }
}
