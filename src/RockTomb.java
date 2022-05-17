import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

class RockTomb extends PhysicalMove {
    public RockTomb(Type type, int pow, int acc) {
    }
    @Override
    protected String describe() {
        return "камнем в печень и никто не вечен";
    }
}
