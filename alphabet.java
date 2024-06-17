import java.util.Scanner;
public class alphabet {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the alphabet : ");
        int check=sc.next().charAt(0);
       

        switch(check){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':

                System.out.println("It is vowel");
                break;
            default:
               System.out.println("It is consonant");



            

        }



      }
    
}

