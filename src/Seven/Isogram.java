package Seven;

public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("aba"));
        System.out.println(isIsogram("moOse"));
        System.out.println(otherAnswer("Dermatoglyphics"));
        System.out.println(otherAnswer("aba"));
        System.out.println(otherAnswer("moOse"));
    }
    public static boolean isIsogram(String str) {
        str = str.toUpperCase();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (ans.contains("" + c)) return false;
            ans += "" + c;
        }
        return true;
    }

    public static boolean otherAnswer(String str) {
        return str.length() ==
                str.toLowerCase()
                        .chars()
                        .distinct()
                        .count();
    }
}

