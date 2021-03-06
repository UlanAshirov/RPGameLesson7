package com.company.Lessons7.players;

import com.company.Lessons7.AbilityType;
import com.company.Lessons7.GameEntity;
import com.company.Lessons7.IAbility;

public abstract class Hero extends GameEntity implements IAbility {

    private AbilityType ability;

    public Hero(int health, int damage, AbilityType ability) {
        super(health, damage);
        this.ability = ability;
    }

    public AbilityType getAbility() {
        return ability;
    }

    public void setAbility(AbilityType ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "health: " + health +
                ", damage: " + damage +
                ", ability: " + ability;
    }
}
