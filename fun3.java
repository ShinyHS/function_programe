import java.util.*;
class fun3{
    static Scanner s=new Scanner(System.in); 
    public static void add()
    {
        System.out.println("welcome to add");
        System.out.println("enter two number to add");
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println("-----------------");
        System.out.println("add "+x+y);
    }
    public static void sub()
    {
        System.out.println("welcome to sub");
        System.out.println("enter two number to sub");
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println("-----------------");
        System.out.println("sub "+ (x-y));
        
    }
    public static void mul()
    {
        System.out.println("welcome to mul");
        System.out.println("enter two number to mul");
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println("-----------------");
        System.out.println("mul "+x*y);
        
    }public static void div()
    {
        System.out.println("welcome to div");
        System.out.println("enter two number to div");
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println("-----------------");
        System.out.println("div "+x/y);
        
    }
    public static void main(String[] args) {
         while(true)
         {
            System.out.println("1. add\n2. sub\n3. mul\n4. div\n5. exit");
            System.out.println("enter your selection");
            int x=s.nextInt();
            switch (x) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("wrong selection");
                    break;
            }
         }
    }
}