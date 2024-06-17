import java.util.Scanner;
class ex
{
public static void main(String args[])
{
int n,j,k,m;
Scanner sc=new Scanner(System.in);
System.out.println("number of lines");
n=sc.nextInt();
for(j=1;j<=n;j++)
{
for(k=1;k<=n-1;k++)
{
System.out.print(" ");
}
for(m=1;m<=j;m++)
{
System.out.print("*");
}
for(m=1;m<j;m++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}








