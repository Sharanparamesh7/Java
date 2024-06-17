import java.util.Scanner;
 class factorial {

    public static void main(String[] args) {
        int i=1;
        int factorial=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first n natural numbers :");
        int n=sc.nextInt(); 
        while(i<=n){
            factorial=factorial*i;
            i++;

        }
        System.out.println(factorial);

  
    }
    
}
