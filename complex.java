import java. util.*;
public class complex
{
    public static void main(String args[])
    {
        int ax,ai,bx,bi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imaginary number parts of 1st number");
        ax=sc.nextInt();
        ai=sc.nextInt();
        System.out.println("Enter real and imaginary number parts of 2nd number");
        bx=sc.nextInt();
        bi=sc.nextInt();
        Operation obj=new Operation(ax,ai,bx,bi);
        
        obj.add();
        obj.sub();
        obj.multiply();
    }
}