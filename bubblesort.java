import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int m=sc.nextInt();
        System.out.println("Enter the array :");
        int a[]=new int[m];
        for(int i=0;i<m;i++){ //getting array input......
            int r=sc.nextInt();
            a[i]=r;
        }
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
