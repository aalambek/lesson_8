package kg.geeks.players;

import kg.geeks.logic.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficient = RPG_Game.random.nextInt(4) + 1;
        if (boss.getHealth() > 0) {
            boss.setHealth(boss.getHealth() - coefficient * this.getDamage());
            System.out.println(this.getName()+" hits critically: "
                    + coefficient * this.getDamage());
        }
    }
}