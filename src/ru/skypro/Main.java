package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Ex.№1
        int[] numbers = new int[3];

        double[] decimal = {1.57, 7.654, 9.986};

        byte[] infinityStone = new byte[]{1, 2, 3, 4, 5, 6};


        //Ex.№2
        //1
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        //2
        for (int i = 0; i < decimal.length; i++) {
            if (i != decimal.length - 1) {
                System.out.print(decimal[i] + ", ");
            } else {
                System.out.print(decimal[i] + "  ");
            }
        }
        {


            System.out.println();
            //3
            for (byte i = 0; i <= infinityStone.length - 1; i++) {
                if (i != infinityStone.length - 1) {
                    System.out.print(infinityStone[i] + ", ");
                } else {
                    System.out.print(infinityStone[i] + " ");

                    System.out.println();

                }

            }

            //Ex.№3
            //1
            for (int i = numbers.length - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.print(numbers[i] + " ");
                } else {
                    System.out.print(numbers[i] + ", ");
                }
            }
            System.out.println();
            //2
            for (int i = decimal.length - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(decimal[i] + ", ");
                } else {
                    System.out.print(decimal[i] + " ");
                }

                //3
            }
            System.out.println();
            for (int i = infinityStone.length - 1; i >= 0; i--) {
                if (i == 0) {
                    System.out.print(infinityStone[i] + " ");
                } else {
                    System.out.print(infinityStone[i] + ", ");
                }

                //Ex.№4
            }
            System.out.println();
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    numbers[i]++;
                }
                if (i == numbers.length - 1) {
                    System.out.print(numbers[i]);
                } else {
                    System.out.print(numbers[i] + ", ");
                }
            }
            }


        }

        }









