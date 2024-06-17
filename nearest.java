import java.util.Scanner;

public class nearest {
    public static void main(String[] args) {
        int n;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        while(true){
            if((n%10)==0){
                System.out.println(n);
                
                break;
            }
            n--;

            
        }
}
}
