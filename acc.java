import java.util.Scanner;
class acc
{
public static void main(String args[])
{
int seats_available=50;
int num_of_seats;

System.out.println("we currently have"+seats_available);
System.out.println("how many tickets would u like to book ");
Scanner sc=new Scanner(System.in);
num_of_seats=sc.nextInt();

if (num_of_seats <= seats_available) 
{
System.out.println("Booked");
seats_available-=num_of_seats;
}
else{
System.out.println("Sorry!!");
}
}
}









