package Day2Assignments;

public class ForLoop {
    //find out sum of natural no using for loop
    public static void main(String[] args) {
        int number = 100 , sum=0;
        for(int i = 1; i <= number; ++i)
        {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}