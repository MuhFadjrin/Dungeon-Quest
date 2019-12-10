/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonquest;

/**
 *
 * @author Hamba Allah
 */
public class Main {

    public static int var[] = {0, 4, 0, 0};//save exist,floor,current floor,ending
    public static int player[] = {1, 100, 18, 1000, 100, 0, 0, 50}; //lvl,health,exp,attack,deffend,weapon,armor,gold
    public static int health[] = {100, 120, 140, 160, 180, 200}; //health level 1-6
    public static int exp[] = {20, 50, 100, 150, 200, 250}; // exp level 1-6
    public static int monster[][] = {{20, 10, 3, 2}, {50, 15, 7, 10}, {70, 20, 14, 13}, {100, 27, 19, 25}, {250, 50, 30, 50}};//HP,ATK,DEF,EXP
    public static int weapon[][] = {{2, 0}, {10, 0}, {20, 0}};//dmg,def
    public static int armor[][] = {{0, 2}, {0, 10,}, {0, 20}};//dmg,def
    public static int iEquipment[][] = {{1, 1, 0}, {1, 0, 1}}; //equipment yang dimiliki [0][x] = weapon,[1][x] = armor
    public static int iInventory[] = {1, 10, 10, 10}; //HP potion, slime gel, Goblin Bone, Wolf Bone
    public static String monsterName[] = {"Slime", "Goblin", "Wolf", "Snake", "Minotaur"}; // nama monster
    public static int indeks[] = {0, 0, 0};
    public static int newGame = 1;
    public static int endGame = 0;

    public static void main(String[] args) {

    }

    public void levelUP() {
        if (player[2] >= exp[player[0] - 1]) {
            if (player[0] < exp.length) {
                player[0] += 1;
                player[2] = 0;
                player[1] = health[player[0] - 1];
                player[3] += 5;
                player[4] += 5;
            } else {
                player[2] = exp[player[0] - 1];
            }

        }
    }

    public void newGame() {
        var[0] = 1;
        var[1] = 0;
        var[2] = 0;
        var[3] = 0;
        player[0] = 1;
        player[1] = 100;
        player[2] = 0;
        player[3] = 5;
        player[4] = 5;
        player[5] = 0;
        player[6] = 0;
        player[7] = 50;
        iEquipment[0][0] = 1;
        iEquipment[0][1] = 0;
        iEquipment[0][2] = 0;//weapon
        iEquipment[1][0] = 1;
        iEquipment[1][1] = 0;
        iEquipment[1][2] = 0;//armor
        iInventory[0] = 5;
        iInventory[1] = 0;
        iInventory[2] = 0;
        iInventory[3] = 0;
        indeks[0] = var[0];
        indeks[1] = player[0];
        indeks[2] = iInventory[0];
        newGame=1;
    }

}
