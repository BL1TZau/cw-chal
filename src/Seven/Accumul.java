package Seven;
import java.lang.StringBuilder;

public class Accumul {
    public static void main (String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
        System.out.println(refined("abcd"));
        System.out.println(refined("RqaEzty"));
        System.out.println(refined("cwAt"));
    }

    public static String accum(String s) {
        String[] strings = s.split("");
        StringBuilder sb = new StringBuilder();

        int i;
        for (i = 0; i < strings.length; i++) {
            sb.setLength(0); // resetting sb with length 0
            sb.append(strings[i].toUpperCase()); // setting the first letter to caps

            int counter = 1;
            while (counter < i + 1) { // i + 1, because position of element. Q: Multiply element * position
                sb.append(strings[i].toLowerCase()); // appending sb
                counter++;
            }

            strings[i] = sb.toString();
        }

        return String.join("-", strings);
    }
    public static String refined(String s) {
        StringBuilder sb = new StringBuilder(); // make StringBuilder object

        int i = 0;
        for (char c : s.toCharArray()) {
            sb.append(Character.toUpperCase(c)); // add first capital el
            for (int j = 0; j < i; j++) { // while j < required amount (L44)
                sb.append(Character.toLowerCase(c)); // add lower case el
            }
            sb.append("-"); // appends after done duplicating
            i++; // Q req: index + 1 to be duplicated.
        }
        sb.deleteCharAt(sb.length() - 1); // deletes last char

        return sb.toString();
    }
}
