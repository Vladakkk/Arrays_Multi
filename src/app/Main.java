package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int [][] numbers = {{4, 36, 5, 17}, {23, 15, 1, 47},
                           {18, 11, 8, 29}, {9, 76, 22, 12}};

        for ( int[] num1 : numbers){
            for( int num : num1){
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");

        int winNum = sc.nextInt();
        for (int[] num : numbers){
            if (winNum == 12) {
                System.out.println("You win!!!");
            }
            else{
                    System.out.println("Maybe next time :( ");
                    break;
                }
            }
        }
    }
