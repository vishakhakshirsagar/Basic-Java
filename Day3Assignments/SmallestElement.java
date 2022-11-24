package Day3Assignments;

public class SmallestElement {
    public static void main(String[] args) {
        //initialize array
        int [] arr= new int[] {11,50,75,10,5,25,100};
//Initialize min with first element of array.
        int Min = arr[0];
        //Loop through the array
        for (int v : arr) {
            //Compare elements of array with max
            if (v < Min)
                Min = v;
        }
        System.out.println("Smallest element present in given array: " + Min);
    }
}