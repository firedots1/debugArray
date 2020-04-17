import java.lang.reflect.Array;
import java.util.Arrays;

public class debugArrays {
    public static void main(String[] args) {
        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        int i;
        numList = new int[10];
        // This is where the array holds the total number between 1-10 //
        numList[0] = 1;
        numList[1] = 2;
        numList[2] = 3;
        numList[3] = 4;
        numList[4] = 5;
        numList[5] = 6;
        numList[6] = 7;
        numList[7] = 8;
        numList[8] = 9;
        numList[9] = 10;
        // This is where the array adds the sum of the number together //
        for (i = 0; i < 10; i++)
            total = total + numList[i];
        System.out.println("The total of the numbers is " + total);
        // This is where the array prints the total where the sum is added //
    }
}
