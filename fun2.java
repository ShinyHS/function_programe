class fun2{
    public static int add(int x,int y)
    {
        int z=x+y;
        return z;
    }
    public static int mul(int x,int y)
    {
        int z=x*y;
        return z;
    }
    public static int div(int x,int y)
    {
        int z=x/y;
        return z;
    }
    public static int sub(int x,int y)
    {
        int z=x-y;
        return z;
    }
    public static int mod(int x,int y)
    {
        int z=x%y;
        return z;
    }
    public static void main(String[] args) {
        int a=10,b=20;
        int c=add(a,b);
        int d=sub(a,b);
        int e=div(a,b);
        int f=mul(a,b);
        int g=mod(a,b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}