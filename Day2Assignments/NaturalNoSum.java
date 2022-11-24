package Day2Assignments;

public class NaturalNoSum {
    public static void main(String[] args)
    {
        int n = 20, sum = 0, i = 1;

        /* While loop*/

        // Test condition
        while (i <= n) {

            /* Statements to execute */

            // Update the current sum till
            // test condition holds true
            sum = sum + i; i++;
        }
        System.out.println(
                "Sum of natural numbers using while loop is:" + " " + sum);
    }
}