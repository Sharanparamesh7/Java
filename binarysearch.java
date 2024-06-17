public class binarysearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int n=a.length-1;
        boolean flag=false;
        int key=3,l=0,h=n;
        while(l<=h){
            int mid=(l+h)/2;
            if(key==a[mid]){
                System.out.println("Element found");
                flag=true;
                break;
            }
            else if (key>a[mid]) {
                l=mid+1;
            }
            else if (key<a[mid]) {
                h=mid-1;
            }
        }
        if (flag==false) {
            System.out.println("Element not found");
        }
    }
}
