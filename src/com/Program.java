public class Program {
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(mul(4,9));
        System.out.println(mul(4.5, 2.3));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public  static int mul(int a, int b){
        return a*b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
}
