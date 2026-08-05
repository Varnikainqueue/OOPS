public class Index3{

    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }

        return temp == sum;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}