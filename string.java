/*
class string{
    public static void main(String[] args){
        String name = "ABC";
        System.out.println(name);

        String res = name.replace('B', 'X');
        System.out.println(res);
    }
}
*/

/*
class string {
    public static void main(String[] args) {
        String s = "varnika";
        String res = "";

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                res += "@";
            } else {
                res += ch;
            }
        }
        System.out.println(res);
    }
}
*/


class string{
    public static void main(String[] args){
        String str = " Hello world    ";
        String res = str.trim();
        System.out.println(str);
        System.out.println(res);

    }
}