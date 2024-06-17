import java.util.*;
interface demo1 {
int s=25;
    
}
interface demo2 {
    int s=25;
        
    }

class demo implements demo1,demo2 {
    public static void main(String[] args) {
        System.out.println(demo2.s);
    }
}
