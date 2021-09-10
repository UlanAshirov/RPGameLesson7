package com.company.Lessons7.players;

import com.company.Lessons7.AbilityType;
import com.company.Lessons7.boss.Boss;

import java.util.Random;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        int random = new Random().nextInt(150);
        boss.setHealth(boss.getHealth() - random);
    }
}
