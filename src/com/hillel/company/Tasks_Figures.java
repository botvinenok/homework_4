package com.hillel.company;

public class Tasks_Figures {

    static void drawSquare(int height, int width){
        System.out.println("\nDrawing a square: ");
        for (int i = 0; i < height; i++){
            System.out.print("*");
            for (int x = 0; x < width; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void drawPyramid(int size){
        System.out.println("\nDrawing a pyramid: ");
        for (int i = 0; i < size; i++){
            for (int x = 0; x <= i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void drawTank(int size){
        System.out.println("\nDrawing a tank: ");
        for (int i = 0; i < size; i++){
            for (int x = 0; x < size + 1; x++){
                if ( i % 2 != 0 && i != 0 && i!= (size - 1)){
                    System.out.println();
                    break;
                }else if(i == 0 || i == (size - 1)){
                    System.out.print("*");
                }else if(x % 5 == 0 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
    }

    static void drawSmth(int size){
        System.out.println("\nDrawing smth: ");
        for (int i = 1; i < size + 1; i++){
            for (int x = size; x >= i; x--){
                if(x % 2 == 0){
                    System.out.print(" ");
                }
            }
            for (int l = 1; l <= i * 2 - 1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
