package com.company.Lessons7;

import com.company.Lessons7.boss.Boss;
import com.company.Lessons7.players.*;

public class RpgGame {
    public static int roundCounter = 0;

    public static void printStatistics(Hero[] heroes, Boss boss) {
        System.out.println("-----------------------");
        System.out.println("Round " + roundCounter);
        roundCounter++;
        if (boss.getHealth() > 0) {
            System.out.println("Boss health " + boss.getHealth());
        }else {
            boss.setHealth(0);
            System.out.println("Boss health " + boss.getHealth());
        }
        for (Hero hero : heroes) {
            System.out.println("Hero " + hero.getClass().getSimpleName() + " current health: " + hero.getHealth());
            //hero.getClass().getSimpleName() - обращаемся к классам и выводим их названия
        }
        System.out.println("-----------------------");
    }

    private static void heroesHit(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0 && boss.getHealth() > 0) {
                int heroDamage = hero.getDamage();
                boss.putDamage(heroDamage);
                System.out.println("Hero " + hero.getClass().getSimpleName() + " attack Boss " + heroDamage);
            }
        }
    }

    private static void applyAbility(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            hero.useAbility(heroes, boss);
        }
    }

    private static boolean isFinish(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }

        boolean allHeroesDead = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss wom!!!");
        }
        return allHeroesDead;
    }

    public static void startGame() {
        Hero[] heroes = createHeroes();
        Boss boss = new Boss(400, 30);
        printStatistics(heroes, boss);
        while (!isFinish(heroes, boss)) {
            round(heroes, boss);
        }
    }

    private static Hero[] createHeroes() {
        Hero[] heroes = new Hero[4];
        heroes[0] = new Hunter(100, 10);
        heroes[1] = new Magical(100, 10);
        heroes[2] = new Warrior(100, 10);
        heroes[3] = new Medic(100, 10);
        return heroes;
    }

    private static void round(Hero[] heroes, Boss boss) {
        bossHit(heroes, boss);

        if (isFinish(heroes, boss)) {
            printStatistics(heroes, boss);
        }
        //нанесение урона героями
        heroesHit(heroes, boss);

        //применение суперспособности
        applyAbility(heroes, boss);

        //показ статистики
        printStatistics(heroes, boss);
    }

    private static void bossHit(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                if (hero.getHealth() - boss.getDamage() < 0) {
                    hero.setHealth(0);
                } else {
                    int bossDamage = boss.getAttack();
                    hero.putDamage(bossDamage);
                    System.out.println("Boss attack hero " + hero.getClass().getSimpleName());
                }
            }
        }
    }
}
