package com.company;

public class Main {


    public static Hero[] heroArray = new Hero[3];

    public static Hero[] getCreateHero(){

        Hero hero1 = new Hero(300,30);
        Hero hero2 = new Hero(400, 25);
        Hero hero3 = new Hero(250,40, "Super Strike");

        heroArray[0] = hero1;
        heroArray[1] = hero2;
        heroArray[2] = hero3;

        return heroArray;
    }

    public static void main(String[] args) {
	// write your code here

        Boss boss = new Boss(700, 50, "Super Shield");

            System.out.println("Boss: " + "Health = " + boss.getHealth() + "/ Damage = " + boss.getDamage()
                    + "/ Defence Type = " + boss.getDefenceType());

            getCreateHero();

        for (int i = 0; i < getCreateHero().length; i++) {

            System.out.println("Health = " + heroArray[i].getHealth() + " /Damage = " + heroArray[i].getDamage()
                    + " /Super Ability = " + heroArray[i].getSuperAbility());

        }


    }



}
