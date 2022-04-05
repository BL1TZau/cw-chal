package Seven;

// Switch A & T, C & G in given strings

public class DnaStrand {
    public static void main(String[] args) {
        String t1 = "ATTGC";
        String t2 = "CATA";
        System.out.println(makeComplement(t1));
        System.out.println(makeComplement(t2));
    }

    public static String makeComplement(String dna) {
        // splitting string into array
        String[] dnaArray = dna.split("");

        // going through array with method
        int i;
        for (i = 0; i < dnaArray.length; i++) {
            dnaArray[i] = getComplement(dnaArray[i]);
        }

        // building string ans by going through array
        String ans = "";
        for (i = 0; i < dnaArray.length; i++) {
            ans += dnaArray[i];
        }

        return ans;
    }

    // method that returns string
    public static String getComplement(String s) {
        switch (s) {
            case "A" : return "T";
            case "T" : return "A";
            case "G" : return "C";
            case "C" : return "G";
        }
        return s; // will never get here
    }

}


