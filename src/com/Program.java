public class Program {
    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(sum(2.3,2.6));
        System.out.println(dif(5,1));

    }
    public static int sum(int a, int b){
        return a+b;
    }
    public  static  double sum(double a, double b){
        return a+b;
    }
    public static int dif(int a, int b){
        return a-b;
    }
}
