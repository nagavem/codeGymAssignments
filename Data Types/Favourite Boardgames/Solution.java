package en.codegym.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Favorite board games
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Battleship";
        collection[0] = chess;

        //write your code here
        BoardGame b2 = new BoardGame();
        b2.name = "Cards against agility";
        collection[1]= b2;

        BoardGame b3 = new BoardGame();
        b3.name = "DnD";
        collection[2] = b3;

        BoardGame b4 = new BoardGame();
        b4.name = "Wordle";
        collection[3] = b4;

        BoardGame b5 = new BoardGame();
        b5.name = "Wingspan";
        collection[4] = b5;

        System.out.println(Arrays.toString(collection));
    }
}