public class Program {
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(mul(4,9));
        System.out.println(mul(4.5, 2.3));
        System.out.println(sum(2.3,2.6));
        System.out.println(dif(5,1));
        System.out.println(dif(4.5,3.6));
        System.out.println(abs(-3));

        System.out.println(abs(-4.3));
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
    public  static  double sum(double a, double b){
        return a+b;
    }
    public static int dif(int a, int b){
        return a-b;
    }
    public static double dif(double a, double b){
        return a-b;
    }
    public static int abs (int a){
        return (int)Math.sqrt(a*a);
    }
    public static double abs(double a){
        return Math.sqrt(a*a);
    }

}
