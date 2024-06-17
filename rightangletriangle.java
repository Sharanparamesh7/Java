import java.util.Scanner;

public class rightangletriangle {
    public void usingstar(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int Numberoflines=sc.nextInt();

        int row,column;

        for(row=0;row<=Numberoflines;row++){
            for(column=0;column<row;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void usingnumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int startingNumber=1;
        int limit=sc.nextInt();
        int row,column;
        
        for(row=0;row<=limit;row++){
            for(column=0;column<row;column++){
                System.out.print(startingNumber+" ");
                startingNumber++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        rightangletriangle r1=new rightangletriangle();
        r1.usingnumber();
        r1.usingstar();
        

    }
}
