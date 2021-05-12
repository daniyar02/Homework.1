package com.GEECTECH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ваше имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Привет " + name);



        final int NUM;
        NUM = 0;


        String word = " Слов";

        System.out.println(NUM + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }




    }
}
