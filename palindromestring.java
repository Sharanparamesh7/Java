import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        String str; 
        String rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.next();
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
      // System.out.println(rev);
       if(str.equals(rev)){
        System.out.println("The given number is palindrome string");
    }
    else{
        System.out.println("Not palindrome string");
    }
    }
}
