import java.util.Scanner;

public class multiplyReplace {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int a[]= {2, 3, 4, 5, 6};
        int n=a.length;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
              b[i]=a[i]*a[i+1];
            }
            else if(i==n-1){
                b[i]=a[i]*a[i-1];
            }
            else {
                b[i]=a[i-1]*a[i+1];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
