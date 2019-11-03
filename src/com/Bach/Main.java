package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int arr[];

        do {
            System.out.println("Enter a size:");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element: " + (i + 1) + " : ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.print("Property in list is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        int min = arr[0];
        int index = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j+1;
            }
        }
        System.out.println("The largest property value in the list is " + min + " ,at position " + index);
    }
    }
