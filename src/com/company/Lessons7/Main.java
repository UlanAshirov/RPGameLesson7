package com.company.Lessons7;

import com.company.Lessons7.players.*;

public class Main {
    public static void main(String[] args) {
        //RpgGame.startGame();
        Hero[] heroes = new Hero[4];
        heroes[0] = new Medic(200, 0);
        heroes[1] = new Warrior(230, 30);
        heroes[2] = new Hunter(215, 20);
        heroes[3] = new Magical(210, 10);
        for (Hero hero : heroes) {
                System.out.println(hero.getClass().getSimpleName() + " применил способность " + hero.getAbility());
            System.out.println(hero.getClass().getSimpleName() + " - " + hero);
            }
        }
    }

