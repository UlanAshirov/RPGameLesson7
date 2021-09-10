package com.company.Lesson7.players;

import com.company.Lesson7.AbilityType;
import com.company.Lesson7.boss.Boss;

import java.util.Random;

public class Magical extends Hero {
    public Magical(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            int random = new Random().nextInt(50);
            hero.setDamage(hero.getDamage() + random);
        }
    }
}
