import java.util.Scanner;

public class suminputnumentered {
    public static void main(String[] args) {
        double n,sum=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers.Enter negative number to stop");
        
        while(true){
            n=sc.nextInt();
            if(n<0.0){
                break;
        }
        sum +=n;
        

        }
        System.out.println(sum);



    }
    
}
