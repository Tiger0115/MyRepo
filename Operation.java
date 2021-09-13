
public class Operation
{
    private int ax,ai,bx,bi;
    

    Operation(int ax, int ai, int bx,int bi)
    {
       this.ax=ax;
       this.ai=ai;
       this.bx=bx;
       this.bi=bi;
        
    }

    void add()
    {
        int sum1=ax+bx;
        int sum2=ai+bi;
        System.out.println("Add = "+sum1+" +("+sum2+"i)");

    }

    void sub()
    {
        int sub1=ax-bx;
        int sub2=ai-bi;
        System.out.println("Sub = "+sub1+" +("+sub2+"i)");
        
    }
    void multiply()
    {
        double m1=(ax*bx)-(ai*bi);
        double m2=(ax*bi)+(ai*bx);
        System.out.println("Multiply = "+m1+" +("+m2+"i)");
    }

}