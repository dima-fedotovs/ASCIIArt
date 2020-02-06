package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = scan.nextInt();
        System.out.println("Enter height: ");
        int height = scan.nextInt();
        System.out.println("How many rows: ");
        int rows = scan.nextInt();


        for (int r = 0; r < rows; r++) {
            for (int h = 0; h < height; h++) {
                for (int w = 0; w < width; w++) {
                    System.out.print((w == 0 || w == width - 1 || h == 0 || h == height - 1) ? "*" : "-");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
