package com.newjava;

import java.util.Scanner;

public class InputOFString implements Duplicate {
    public void NoOfCharter(){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }
    public void NumberOfDuplicateChar(){
        String string1=" ";
        //Converts given string into character array
        char string[] = string1.toCharArray();
        int count;

        System.out.println("Duplicate characters in a given string: ");
        //Counts the character present in the string
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
    public void MaximumDuplicateChar(){
        String string = null;

        final int ASCII_SIZE = 256;
        {
            // Create array to keep the count of individual
            // characters and initialize the array as 0
            int count[] = new int[ASCII_SIZE];

            // Construct character count array from the input
            // string.
            int len = string.length();
            for (int i=0; i<len; i++)
                count[string.charAt(i)]++;

            int max = -1;  // Initialize max count
            char result = ' ';   // Initialize result

            // Traversing through the string and maintaining
            // the count of each character
            for (int i = 0; i < len; i++) {
                if (max < count[string.charAt(i)]) {
                    max = count[string.charAt(i)];
                    result = string.charAt(i);
                }
            }

        }
        
    }
}
