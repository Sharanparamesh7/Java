import java.util.*;
class firstpro{
    public static void main(String[] args) {
        String name;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the name");
        name=sc.nextLine();
        StringBuffer  sb=new StringBuffer();
        sb.append(name);
        System.out.println("the reverse name is:"+sb.reverse());
        
    }
}
