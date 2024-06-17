public class NumNotDivBy4And6 {
    public static void main(String[] args) {
        int n=1;
      for(int i=1;i<=100;i++){
            if(((n %4 )==0) || ((n%6) ==0)){
                n++;
                continue;

            }
            
                    System.out.println("rest of the number is " + n);
                            n++;



        }
        
        
    }
    
}
