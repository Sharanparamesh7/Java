import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n;
        int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int temp=n;
        while (n!=0) {
        rev=rev*10+n%10;
        n=n/10;
        }
        
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
      
    }
}
