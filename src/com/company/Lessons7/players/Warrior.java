package com.company.Lessons7.players;

import com.company.Lessons7.AbilityType;
import com.company.Lessons7.boss.Boss;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        boss.setHealth(boss.getHealth() - boss.getDamage());
    }
}
