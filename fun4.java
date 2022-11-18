import java.util.Scanner;
class fun4{
    public static void odd(int x) {
        int y=x%2;
        oddOrEven(y);
    }
    public static void oddOrEven(int x) {
        if(x==1)
        System.out.println("odd");
        else
        System.out.println("even");
    }
    public static void main(String[] args) {
        odd(10);
        odd(13);
        odd(12);
        odd(90);
        odd(3);
        odd(77);
        odd(90);
    }
}