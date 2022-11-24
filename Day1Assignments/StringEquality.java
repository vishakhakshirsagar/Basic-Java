package Day1Assignments;
import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        String str1 , str2 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        str1 = scanner.nextLine();
        System.out.println("Enter second string");
        str2 = scanner.nextLine();
        if (str1.equals(str2))
            System.out.println("Equal strings");
        else System.out.println("Unequal strings");



    }
}
