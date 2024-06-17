public class swap2numbers {
    public void withthirdvariable(){
         int mysalary=20;
        int superiorsalary=50;
        int temp;
        System.out.println("before swapping:"+"mine:"+mysalary+ "superior's:"+superiorsalary);
        temp=mysalary;
        mysalary=superiorsalary;
        superiorsalary=temp;
        System.out.println("after swapping:"+"mine:"+mysalary+ "superior's:"+superiorsalary);
    }
    public void  nothirdvariable(){
        int first=20;
        int second=30;
        System.out.println("before swapping"+"first="+first+"second="+second);
        first=first-second;// formula
        second=first+second;
        first=second-first;
        System.out.println("after swapping"+"first="+first+"second="+second);
    }
    public static void main(String[] args) {
        swap2numbers sc=new swap2numbers();
        sc.withthirdvariable();
         sc.nothirdvariable();

       


    }
    
}
