package sorting;

/**
 * Created by kayabegum on 8/6/2016.
 */
public class SelectionSorting {
    public static void main(String[] args) {


        int[] list = {2, 9, 5, 7, 6};

        //going through the array list
        for (int i = 0; i < list.length;i++){
            //checking if the numbers needed to be sorted.
            for(int j=i+1;j<list.length;j++){
                //matching with the condition to see if it needs to be sorted.
            if(list[j]<list[i]) {
                //swapping and storing them
                int temp=list[j];
                list[j]=list[i];
                list[i]=temp;
                }
            }
        }
        //printing out the value
        for(int n=0;n<list.length;n++){
            System.out.println(list[n]);
        }
    }
}
