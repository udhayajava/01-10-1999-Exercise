package com.newjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        InputOFString operation=new InputOFString();
        {operation.NoOfCharter();
            operation.NumberOfDuplicateChar();
            operation.MaximumDuplicateChar();
    }}
}
