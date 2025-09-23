

package vu.trialsecondstominutes;

import java.util.Scanner;

public class TrialSecondstoMinutes {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the total seconds: ");
            int totalSeconds = input.nextInt();
            int minutes = totalSeconds / 60;
            
            int remainingSeconds = totalSeconds % 60;
           
            System.out.println("Minutes: " + minutes);
            System.out.println("Remaining seconds: " + remainingSeconds);
        }
    } 
} 
