package arrayelements;

import java.util.Scanner;

public class ArrayElements {

    public static void main(String[] args) {

        int arrayNumber[];
        arrayNumber = assignArray();
        backwardArray(arrayNumber);

    }

    public static int[] assignArray() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the legnth of your array ...");
        int index = input.nextInt();
        int[] inputArray = new int[index];
        System.out.println("Now it's time to enter your array elements ...");

        for (int i = 0; i < index; i++) {

            inputArray[i] = input.nextInt();
        }

        return inputArray;
    }

    public static void backwardArray(int[] inputArray) {

        int legnth = inputArray.length;
        for (int i = legnth; --i >= 0;) {

            System.out.println(inputArray[i]);

        }

    }

}
