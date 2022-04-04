package Seven;

public class Troll {
    public static void main(String[] args) {
        System.out.println("Hey");
    }

    public static String disemvowel(String str) {
        String[] strArray = str.split("");
        String[] strArrayCaps = str.toUpperCase().split("");

        int i;
        for (i = 0; i < strArray.length; i++) {
            if (strArrayCaps[i].equals("A") || strArrayCaps[i].equals("E") ||
                    strArrayCaps[i].equals("I") ||
                    strArrayCaps[i].equals("O") || strArrayCaps[i].equals("U")) {
                strArray[i] = "";
            }
        }
        return String.join("", strArray);
    }
}
