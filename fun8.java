class fun8{
    public static void fun(String x) {
        for(int i=x.length()-1;i>=0;i--)
        System.out.print(x.charAt(i));
        System.out.println();
    }
    public static void main(String[] args) {
        String a="hello world ";
        String x="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                fun(x);
                x="";
            }
            else
            {
                x=x+a.charAt(i);
            }
        }
    }
}