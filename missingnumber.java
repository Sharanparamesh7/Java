public class missingnumber {
    
         int show() {
        int [] a={0,1,3};
        int  n=a.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        return n*(n+1)/2 - sum;
    }
    public static void main(String[] args) {
       missingnumber  m=new missingnumber();
       //int b=m.show();
       System.out.println(m.show());
    }
         

    
    }

