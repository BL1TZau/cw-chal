package Six;

public class DetectPangram {
    public static void main(String[] args) {
        /*
        Description:
        A pangram is a sentence that contains every single letter of the alphabet at least once. For example,
        the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at
        least once (case is irrelevant).

        Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers
        and punctuation.
         */

        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
        System.out.println(otherAnswer("The quick brown fox jumps over the lazy dog."));
        System.out.println(otherAnswer("You shall not pass!"));
    }

    public static  boolean check(String s) {
        s = s.toUpperCase(); // same case (case irrelevant)
        s = s.replaceAll("[^A-Z]", ""); // replacing everything NOT (^) A-Z with nothing
        String[] sArr = s.split(""); // making str arr of letters
        String ans = ""; // empty string to start

        int i;
        for(i = 0; i < sArr.length; i++) {
            if (!ans.contains(sArr[i])) { // if str doesn't contain s
                ans += sArr[i]; // add to s
            }
        }

        if (ans.length() == 26) { // ans = how many unique letters
            return true;
        }
        return false;
    }

    public static boolean otherAnswer(String sentence){
        for (char c = 'a'; c<='z'; c++) // iterate through chars
            // if doesn't contain ch....
            if (!sentence.toLowerCase().contains("" + c)) // contains works because "" + ch = string
                return false;
        return true;
    }
}
