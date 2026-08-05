public class Index5{

    static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return temp == rev;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}