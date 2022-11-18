import java.util.*;
class fun6{
    public static int square(int x) {
        return x*x;
    }
    public static int rev(int x) {
        int sum=0;
        while(x!=0)
        {
            int t=x%10;
            sum=sum*10+t;
            x/=10;
        }
        return sum;
    }
    public static void check(int x,int y) {
        if(x==y)
        System.out.println("yes");
        else
        System.out.println("no");
    }
    public static void main(String[] args) {
        int sq=square(4);
        // System.out.println(sq);
        int r=rev(sq);
        // System.out.println(r);
        double roo=Math.sqrt(r);
        int root=(int)roo;
        // System.out.println(root);
        int r1=rev(root);
        // System.out.println(r1);
        check(r1,12);

    }
}