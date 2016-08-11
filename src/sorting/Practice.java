package sorting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 * Created by kayabegum on 8/7/2016.
 */
public class Practice {
    public static void main(String[] args) throws IOException {
//        int[][] a2d= new int [][]{{2,5,0},{8,9,7,},{3,8,1}};
//       boolean isRectangular=true;
//        int total=0;
//        for(int i=0;i<a2d.length;i++) {
//            for(int j=0;j<a2d[i].length;j++) {
//                if (a2d[i][j] > 0 ) {
//                    total++;
//
//                }
//                System.out.println(total);
//            }


//            if (a2d[i].length != a2d[0].length) {
//                isRectangular = false;
//            }
//
//            System.out.println(a2d[i].length);
//        }
//        boolean isSquare=true;
//        for(int i=0;i<a2d.length;i++){
//            if(a2d.length!=a2d[i].length){isSquare=false;}}
//            System.out.println(a2d.length);
//        }
//
//         }
//
//            int num1=10;
//            int num2=20;
//            int temp;
//            int num3=30;
//           int temp2;
//          int num4=40;
//        System.out.println(num1);

//
//        temp=num1;
//        num1=num2;
//        num2=temp;
//
//        temp2=num3;
//        num3=num4;
//        num4=temp2;
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(num4);


//        String path="C:\\Users\\kayabegum\\Desktop\\demo\\city.txt";
//        FileReader fr=null;
//        BufferedReader br=null;
//        try{
//         fr=new FileReader(path);
//         br=new BufferedReader(fr);
//        String text;
//
//        while((text=br.readLine())!=null) {
//            System.out.println(text);
//        }
//        }
//        catch(Exception pnt){
//            System.out.println("error wrong path");
//            }
//         finally {
//        br.close();
//            fr.close();
//        }
//        Scanner scan=new Scanner(System.in);
//
//        String path="C:\\Users\\kayabegum\\Desktop\\demo\\";
//
//
//        FileReader fr=null;
//        BufferedReader br= null;
//        String text;
//
//            String fileName=scan.next();
//
//
//        try{
//            fr=new FileReader(path+fileName+".txt");
//            br=new BufferedReader(fr);
//
//            }
//            catch(Exception fnnf) {
//                System.out.println("file name not found");
//            }
//         try {
//             while ((text = br.readLine()) != null) {
//                 System.out.println(text);
//
//             }
//         }
//         catch(Exception ex){
//             System.out.println("file path not found");
//         }
//        for(int i=1;i<20;i++) {
//            boolean isPrime = true;
//
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {isPrime=false;break;
//                }
//
//                }
//            if(isPrime){
//                System.out.println(i);
//            }
//
//        }
//        for(int i=3;i<=20;i++){
//            boolean isPrime=true;
//            for(int j=2;j<i;j++){
//                if(i%j==0){isPrime=false;break;}
//            }
//            if(isPrime){System.out.println(i);}
//        }


//       List<Object> names = new ArrayList<Object>();
//        names.add("kaya");
//        names.add("mysha");
//        names.add("anisha");
//        names.add("lamisa");
//
//        for(Object name:names){
//            System.out.println(name);
//        }

//        int [] num=new int[3];
//        num[0]=50;
//        num[1]=70;
//        num[2]=80;
//        for(int i=0;i<num.length;i++){
//            System.out.println(num[i]);
//        }


//        int prev=0;
//        int next=1;
//        int x=0;
//        while(x<=5) {
//            x++;
//            prev=next-prev;
//            next=prev+next;
//
//            System.out.println(next);
//}

//        int [][] square=new int[][]{{9,8,7},{6,3,2},{1,5,9}};
//        for(int i=0;i<square.length;i++){
//            for(int j=0;j<square[i].length;j++){
//                System.out.print(square[i][j]);
//                System.out.print(" ");
//
//
//            }
//            System.out.println();}
//
//        int column = 30;
//        int row = 30;
//        int[][] array = new int[row][column];
//
//        Random ran = new Random();
//        for (int i = 0; i < column; i++) {
//            for (int j = 0; j < row; j++) {
//                array[i][j] = ran.nextInt(100);
//                System.out.print(array[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }

//        int column=3;
//        int rows=3;
//        int [][] array2=new int [column][rows];
//        Scanner input=new Scanner(System.in);
//
//        for(int i=0;i<column;i++){
//            for(int j=0;j<rows;j++){
//                array2[i][j]=input.nextInt();
//                System.out.print(array2[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();

//        }
//        int rows = 3;
//        int column = 3;
//        Random rand = new Random();
//
//        int[][] prime = new int[rows][column];
//
//
//        for (int i = 0; i < prime.length; i++) {
//            for (int j = 0; j < prime[i].length; j++) {
//                prime[i][j] = rand.nextInt(10)*2+3;
//                System.out.print(prime[i][j]);
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }
//        System.out.println("separate");
//        for (int k = 2; k < 10; k++) {
//            for (int i = 0; i < column; i++) {
//                boolean p = true;
//                for (int j = 0; j <prime[i].length; j++) {
//                    if (prime[i][j]%k == 0) {
//                        p = false;
//                        break;
//                    }
//                   if(p){
//                       System.out.print(prime[i][j]+" ");
//                   System.out.print(" ");}
//                }
//                System.out.println();
//            }
//
//
//        }
//        Random rand = new Random();
//        int[] array = new int[10];
//        for (int j = 3; j < 10; j++) {
//            boolean prime = true;
//            for (int i = 0; i < 10; i++) {
//                array[i] = rand.nextInt(10)*2+3;
//                if (array[i] % j == 0) {
//                    prime = false;
//                    break;
//                }
//                if(prime){
//                    System.out.println(array[i]);
//
//                }
//
//            }
//        }

//        Map<String,Integer> map=new HashMap<String,Integer>();
//          map.put("USA",5);
//          map.put("Bangladesh",1);
//          map.put("UKA",10);
//          map.put("Australia",4);
//        map.put("US",1);
//        map.put("BD",7);
//        map.put("UK",11);
//
//        for(Map.Entry<String,Integer> entry :map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//        List<String> citysInUSA = new ArrayList<String>();
//        citysInUSA.add("NY");
//        citysInUSA.add("MI");
//        citysInUSA.add("LA");
//
//        List<String> citysInBangladesh = new ArrayList<String>();
//        citysInBangladesh.add("Sylhet");
//        citysInBangladesh.add("Dhaka");
//        citysInBangladesh.add("Comilla");
//
//        Map<String, List> map = new HashMap<>();
//        map.put("USA",citysInUSA);
//        map.put("Bangladesh",citysInBangladesh );
//
//        for(Map.Entry<String,List> entry:map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//
//
//        }
//        List<Object> citysInUSA = new ArrayList<Object>();
//        citysInUSA.add("NY");
//        citysInUSA.add("MI");
//        citysInUSA.add("LA");
//
//        List<Object> citysInBangladesh = new ArrayList<Object>();
//        citysInBangladesh.add("Sylhet");
//        citysInBangladesh.add("Dhaka");
//        citysInBangladesh.add("Comilla");
//
//        for (Object city : citysInBangladesh) {
//            System.out.println(city);
//        }
//        System.out.println("separation");
//        System.out.println();
//        for (Object city : citysInUSA) {
//            System.out.println(city);
//
//
//
//        }
//        System.out.println();
//        List<Object> temp=new ArrayList<>();
//        temp=citysInUSA;
//        citysInUSA=citysInBangladesh;
//        citysInBangladesh=temp;
//
//        for (Object city : citysInBangladesh) {
//            System.out.println(city);
//        }
//        System.out.println("separation");
//        System.out.println();
//        for (Object city : citysInUSA) {
//            System.out.println(city);
//
//
//        }

//          Stack<Object> pen=new Stack<>();
//        pen.add("mysha's pen");
//        pen.add("anisha's pen");
//        pen.add("sofia's pen");
//        pen.add("lamisa's pen");
//        pen.add("fattah's pen");
//
//        System.out.println(pen.peek());
//        System.out.println(pen.pop());
//        System.out.println(pen.peek());
//        Queue<Object> pen=new LinkedList<>();
//        pen.add("mysha's pen");
//        pen.add("anisha's pen");
//        pen.add("sofia's pen");
//        pen.add("lamisa's pen");
//        pen.add("fattah's pen");
//        Queue<Object> pen2=new LinkedList<>();
//        pen.add("mysha's");
//        pen.add("anisha'");
//        pen.add("sofia'");
//        pen.add("djfsdj");
//        pen.add("fattah's ");
//
////
////        System.out.println(pen.peek());
////        System.out.println(pen.poll());
////        System.out.println(pen.peek());
//        pen.offer("mysha's pen");
//
//        pen.addAll(pen2) ;
//        for(Object p:pen){
//            System.out.println(p);}

//        Random rand=new Random();
//
//        int [] array=new int [10];
//       for(int i=0;i<array.length;i++) {
//           array[i] = rand.nextInt(10);
//           System.out.println(array[i]+" "+array[i]i%2);
//       }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            for (int s = 0; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for (int a = 3; a < 3; a++) {
                System.out.print("* ");
            }
            for (int a = 6; a > 3; --a) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("0 ");
            }
//                   for(int k=0;k<=20;k++){
//                          System.out.print(" ");
//
//                  }

            for (int n = 12; n > i; --n) {
                System.out.print("0 ");
            }
//                  for(int k=20;k<=i;k++){
//
//                      System.out.print(" ");
            System.out.println();
        }

        for (int i = 1; i < 4; i++) {


                for (int j = 0; j < i; j++) {
                    System.out.print(" 0");
                }
//                   for(int k=0;k<=20;k++){
               for (int n = 4; n > i; --n) {
                System.out.print(" ");           System.out.print(" ");
//
//                  }


                System.out.println();


            }
        }
    }
}
//        }









