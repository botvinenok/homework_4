package com.hillel.company;

import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Tasks_Math {

    private static int[] randomArray(){
        int [] arrayRandom = new int[10];
        Random rand = new Random();
        for(int i = 0; i < arrayRandom.length; i++){
            arrayRandom[i] = rand.nextInt(10);
        }
        System.out.println("Random array creating: " + Arrays.toString(arrayRandom));
        return  arrayRandom;
    }

    static int sumElements(){
        int sum = 0;
        int[] array = randomArray();
        for(int element : array ){
            sum += element;
        }
        int sumCorrect = sum - array[0] - array[array.length - 1];
        System.out.println("Sum of elements in array, except first and last is: " + sumCorrect);
        return sumCorrect;
    }

    private static int min(int firstEl, int secondEl) {
        return firstEl < secondEl ? firstEl : secondEl;
    }

    static int minAll(int first, int second, int third, int fourth) {
        System.out.print("\n\nInput elements for finding minimum: " + first + ", " + second + ", " + third + ", " + fourth + ".\n");
        int firstResult = min(first, second);
        int secondResult = min(third, fourth);
        return min(firstResult, secondResult);
    }

    static int getEvenDigitSum(int digit){
        System.out.println("\nDigit for sum even numbers is " + digit);
        int sumOfEven = 0;
        char [] numbers = String.valueOf(digit).toCharArray();
        if (digit >= 0) {
            for (char element : numbers) {
                if (element % 2 == 0) {
                    sumOfEven += Character.getNumericValue(element);
                }
            }
            return sumOfEven;
        }
        return -1;
    }

    static int getGreatestCommonDivisor(int first, int second){
        System.out.println("\nDigits for comparing first - " + first + ", second - " + second);
        if (first >= 10 & second >= 10){
            while (first != second){
                if (first > second){
                    first -= second;
                }else{
                    second -= first;
                }
            }
            return first;
        }
        return -1;
    }




}
