package com.hankzimmer;

public class Main {

    public static void main(String[] args) {
        numberToWords(1320);
    }

    //Takes in an integer number and print is as words
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int processedNumber = reverseNumber(number);
        int digitsLeftToPrint = getDigitCount(number);

        int lastDigit;

        while (digitsLeftToPrint > 0) {
            if (processedNumber >= 10) {
                lastDigit = processedNumber % 10;
            } else {
                lastDigit = processedNumber;
            }
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }
            processedNumber /= 10;
            digitsLeftToPrint--;
        }
    }

    // Reverse the number so that it will print out correctly, as it will be processed from right to left by the numberToWords method
    public static int reverseNumber(int number) {
        int reverse = 0;
        int nextDigit;
        int processedNumber = number;
        while (processedNumber >= 1) {
            nextDigit = processedNumber % 10;
            reverse = reverse * 10 + nextDigit;
            processedNumber /= 10;
        }
        return reverse;
    }

    // Get the digit count for the number, so that any trailing zeros will not be lost when it is reversed
    public static int getDigitCount(int number) {
        int digitCount = 0;
        int processedNumber = number;
        while (processedNumber >= 1) {
            digitCount++;
            processedNumber /= 10;
        }
        return digitCount;
    }
}
