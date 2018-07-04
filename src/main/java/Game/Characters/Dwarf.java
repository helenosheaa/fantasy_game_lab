package Game.Characters;

import Game.Behaviours.IWeapon;
import Game.Fighter;

public class Dwarf extends Fighter implements IWeapon {

    public Dwarf(int healthPoints) {
        super(healthPoints);
    }

    @Override
    public int Sword() {
        return 10;
    }

    @Override
    public int Axe() {
        return 30;
    }

    @Override
    public int Club() {
        return 20;
    }
}
