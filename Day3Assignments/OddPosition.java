package Day3Assignments;

public class OddPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("Elements resent on odd position");
        //Loop through the array by incrementing value of i by 2
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}
