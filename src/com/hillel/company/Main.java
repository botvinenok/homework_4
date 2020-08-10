package com.hillel.company;

public class Main {

    public static void main(String[] args) {

        //region Math
        Tasks_Math.sumElements();
        System.out.println("Minimum is: " + Tasks_Math.minAll(4,2,10,5));
        System.out.println("Sum of even numbers is: " + Tasks_Math.getEvenDigitSum(545780864));
        System.out.println("The greatest common divisor is " + Tasks_Math.getGreatestCommonDivisor(56, 2401));
        //endregion

        //region Drawing
        Tasks_Figures.drawSquare(4, 10);
        Tasks_Figures.drawPyramid(7);
        Tasks_Figures.drawTank(9);
        Tasks_Figures.drawSmth(6);
        //endregion

    }
}
