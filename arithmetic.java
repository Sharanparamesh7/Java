public class arithmetic {
    boolean show(int a, int b, int c){
        if((a+b==c) || (a-b==c) || (a*b==c) || (a/b==c) &&(a%b==0)){
            return true;
        }
        else{
            return false;
        }
    
       }
       public static void main(String[] args) {
        arithmetic ar=new arithmetic();
        boolean s=ar.show(4, 2, 2);
        if(s==true){
            System.out.println("can replace #");
        }
        else{
            System.out.println("cannot replace");
        }

               }
     }
// Another way
/*public class ArithmeticExpression {
    public static void main(String[] args) {
        int a = 10; // Replace with your values
        int b = 5;  // Replace with your values
        int c = 15; // Replace with your values

        if (isPossible(a, b, c)) {
            System.out.println("It's possible to replace '#' with an operator.");
        } else {
            System.out.println("It's not possible to replace '#' with an operator.");
        }
    }

    public static boolean isPossible(int a, int b, int c) {
        return a + b == c || a - b == c || a * b == c || (b != 0 && a / b == c);
    }
}
 */

    
        
    
    
