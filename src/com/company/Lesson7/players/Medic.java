package com.company.Lesson7.players;

import com.company.Lesson7.AbilityType;
import com.company.Lesson7.boss.Boss;

import java.util.Random;

public class Medic extends Hero {
    public Medic(int health, int damage) {
        super(health, damage, AbilityType.HEALTH);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            int randomHealth = new Random().nextInt(30);
            hero.setHealth(hero.getHealth() + randomHealth);
        }
    }
}
