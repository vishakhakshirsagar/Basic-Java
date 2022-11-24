package Day2Assignments;

public class PalindromeNumber {
    public static void main(String[] args) {
            int remainder,sum=0,temp;
            int number= 121;
            //It is the number variable to be checked for palindrome

            temp=number;
            while(number>0){
                remainder=number%10;  //getting remainder
                sum=(sum*10)+remainder;
                number=number/10;
            }
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }
    }
