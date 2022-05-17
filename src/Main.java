import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {
        Battle battleRoyal = new Battle();

        battleRoyal.addAlly(new Nidoran("ARA-ARA", 1));
        battleRoyal.addAlly(new Nidoqueen("QUEEN", 4));
        battleRoyal.addAlly(new Virizion("VIR", 4));

        battleRoyal.addFoe(new Shroomish("MUSHROOM", 1));
        battleRoyal.addFoe(new Breloom("BROOM", 2));
        battleRoyal.addFoe(new Nidorina("NINA-NINA", 3));
        battleRoyal.go();
    }
}
