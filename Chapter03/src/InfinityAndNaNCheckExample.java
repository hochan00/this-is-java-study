public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        System.out.println(z);
        System.out.println(z + 2);

        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 오류");
        }
    }
}
