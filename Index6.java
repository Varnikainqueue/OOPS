public class Index6{

    static int count(String str) {
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u')
                c++;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println(count("Programming"));
    }
}