import java.util.*;
public class reverse {
    public static void main(String[] args) {
    String name;
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the name:");
    name=sc.nextLine();
    char[] array=name.toCharArray();
    String reversed="";
    for(int i=array.length-1;i>=0;i--){
        reversed=reversed+array[i];
    }
    System.out.println(reversed);
         }
   }
