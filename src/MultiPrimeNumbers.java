import java.util.Random;
import java.util.Scanner;

/**
 * Created by kayabegum on 8/6/2016.
 */
public class MultiPrimeNumbers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("please enter any 9 numbers:");
        int rows = 3;
        int column = 3;
        Random numbers = new Random();

        int[][] multiArray = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                multiArray[i][j] = numbers.nextInt(10)*2+3;
//                multiArray[i][j] = input.nextInt();
                System.out.print(multiArray[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }
        System.out.println("separation");
        for (int k = 2; k <= 10; k++) {
            for (int i = 0; i < rows; i++) {
                boolean p = true;
                for (int j = 0; j < column; j++) {
                    if (multiArray[i][j] % k == 0) {
                        p = false;
                        break;

                    }
                    if (p) {
                        System.out.print(multiArray[i][j]);
                        System.out.print(" ");

                    }


                }
                  System.out.println();
            }
        }
    }}
