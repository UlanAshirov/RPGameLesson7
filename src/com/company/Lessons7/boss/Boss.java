package com.company.Lessons7.boss;

import com.company.Lessons7.GameEntity;

import java.util.Random;

public class Boss extends GameEntity {

    public Boss(int health, int damage) {
        super(health, damage);
    }

    @Override
    public int getAttack() {
        int randomDamage = new Random().nextInt(3) + 1;
        return this.damage + randomDamage;
    }
}
