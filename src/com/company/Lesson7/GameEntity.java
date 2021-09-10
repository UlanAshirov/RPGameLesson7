package com.company.Lesson7;

public abstract class GameEntity {
    protected int health;
    protected int damage;

    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;

    }

    public int putDamage(int damage) {
        this.health = this.health - damage;
        return this.health;

    }

    public int getAttack() {
        return this.damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
