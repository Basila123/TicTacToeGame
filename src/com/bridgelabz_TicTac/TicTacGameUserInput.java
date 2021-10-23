package com.bridgelabz_TicTac;
import java.util.Locale;
import java.util.Scanner;
public class TicTacGameUserInput {

        static char[] board = new char[10];
        static char input;


        public static void main(String[] args) {

            createBoard();
            UserInput();
        }

        public static void createBoard() {
            for (int i = 1; i < board.length ; i++) {

                board[i] = ' ';
                //System.out.println(i);

            }

        }
        public static void UserInput(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input a character:  X or O");

             input = sc.next().toUpperCase(Locale.ROOT).charAt(0);

            System.out.println("You have entered "+input );
            switch (input){
                case 'X':
                    System.out.println("X");
                    break;
                case 'O':
                    System.out.println("O");
                    break;
                case default:
                    System.out.println("Invalid Entry");


            }

        }


}




