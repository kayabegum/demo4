import java.util.Random;
import java.util.Scanner;

/**
 * Created by kayabegum on 8/6/2016.
 */
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter any 9 numbers:");
        int rows=3;
        int column=3;
        Random numbers=new Random();

        int[][] multiArray=new int[rows][column];
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < column; j++) {
//                multiArray[i][j] = numbers.nextInt(100);
                multiArray[i][j]=input.nextInt();
            }
        }
            for(int i=0;i<rows;i++){
                for(int j=0;j<column;j++){
                    System.out.print(multiArray[i][j]);
                    System.out.print(" ");

                }
                System.out.println();
            }
        }
    }
