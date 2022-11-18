//-------call by value & call by referance----------
class fun7{
    public static void increment(int x) {
        x++;
    }
    public static void add(String x) {
        x=x+" welcome";
    }
    public static void main(String[] args) {
        int x=10;
        increment(x);
        System.out.println(x);
        String s="welcome";
        add(s);
        System.out.println(s);
    }
}