class fun5{
    public static void pol(int x) {
        int sum=0;
        int y=x;
        while(x!=0)
        {
            int t=x%10;
            sum=sum*10+t;
            x/=10;
        }
        check(sum,y);
    }
    public static void check(int x,int y) {
        if(x==y)
        System.out.println( y+" polindrome");
        else
        System.out.println(y+" not polindorme");
    }
    public static void main(String[] args) {
        pol(125);
        pol(115);
        pol(121);
        pol(717);
        pol(100);
    }
}