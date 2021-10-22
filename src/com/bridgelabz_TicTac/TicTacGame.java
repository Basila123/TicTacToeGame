package com.bridgelabz_TicTac;

public class TicTacGame {
    static char[] board = new char[10];
    static int a=10;

    public static void main(String[] args) {

        createBoard();
    }

    public static void createBoard() {
        for (int i = 1; i < board.length ; i++) {

            board[i] = ' ';
            //System.out.println(i);

        }

    }
}
