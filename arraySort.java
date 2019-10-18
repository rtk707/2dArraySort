import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class question2 {
    static int [][] arr = new int[4][4];
    static void vertBubbleSort(){
        int n = 4;
        for (int c = 0; c < n; c++)
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j][c] > arr[j+1][c])
                    {
                        int temp = arr[j][c];
                        arr[j][c] = arr[j+1][c];
                        arr[j+1][c] = temp;
                    }
    }
    static void horBubbleSort(){
        int n = 4;
        for(int r = 0; r < n; r++)
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[r][j]>arr[r][j+1]) {
                        int temp = arr[r][j];
                        arr[r][j] = arr[r][j + 1];
                        arr[r][j + 1] = temp;
                    }
    }

    static void print2D(){
        for (int[] row: arr){
            System.out.println(Arrays.toString(row));
        }
    }
    static void search(int w){
        for (int i = 0; i < 4;i++) {
            for (int j = 0; j < 4; j++) {
                if (w == arr[i][j]) {
                    System.out.println("True");
                    System.out.println("Element " + w + " is present at " + (i + 1) + "th row and " + (j + 1) + "th column");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        arr[0][0] = 45;
        arr[0][1] = 99;
        arr[0][2] = 54;
        arr[0][3] = 33;
        arr[1][0] = 21;
        arr[1][1] = 19;
        arr[1][2] = 76;
        arr[1][3] = 84;
        arr[2][0] = 11;
        arr[2][1] = 69;
        arr[2][2] = 72;
        arr[2][3] = 44;
        arr[3][0] = 14;
        arr[3][1] = 12;
        arr[3][2] = 10;
        arr[3][3] = 0;
        System.out.println("Given Array is:");
        print2D();
        while (true) {
            System.out.println("1. Sort the Array");
            System.out.println("2. Search in the Array");
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();
            if (q == 1) {
                vertBubbleSort();
                horBubbleSort();
                print2D();
                System.out.println("Array Sorted");
            } else if (q == 2) {
                System.out.println("Enter the element to be searched:");
                int e = sc.nextInt();
                search(e);
            } else
                System.out.println("Wrong Input");
            System.out.println("Enter 1 to continue, anything else to terminate.");
            int e = sc.nextInt();
            if (e !=1) {
                System.out.println("Terminated");
                break;
            }

        }
    }


}
