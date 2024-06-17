import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        int givennumber;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        givennumber=sc.nextInt();


        int reversednumber=0;

        while(givennumber!=0){
            reversednumber=reversednumber*10;
            reversednumber=reversednumber+givennumber%10;
            givennumber=givennumber/10; 
        }
        System.out.println(reversednumber);
        }
    
}
