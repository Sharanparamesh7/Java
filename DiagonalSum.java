public class DiagonalSum {
    public static void main(String[] args) {
        int mat[][]={{2,2,3},{4,5,6},{7,8,9}};
        int n=mat.length;
        int i=0,j=0;
        int sum=0;

        while(i<n){
            sum+=mat[i][j];
            i++;
            j++;

        }

        i=0;
        j=n-1;
        while(i<n){
            if(i!=j)
            sum+=mat[i][j];
            i++;
            j--;
        }
        System.out.println(sum);

    }
}
    