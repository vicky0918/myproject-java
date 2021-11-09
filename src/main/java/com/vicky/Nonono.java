package com.vicky;

import java.util.Random;
import java.util.Scanner;

public class Nonono {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(secret);
        int min = 0;
        int num = 0;
        int max = 100;
        while(num!=secret){
            System.out.println("Please enter a number:"+min "~"+max);
            if (num > secret){
                max = num;
            }
            if (num < secret){
                min = num;
            }

        }
        else{
            System.out.println("Bingo!");
        }


    }
}
