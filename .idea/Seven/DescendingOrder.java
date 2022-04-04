package Seven;

public class DescendingOrder {
    public static void main(String[] args) {
        int a = sortDesc(831541);
        int b = sortDesc(123);
        int c = sortDesc(87419);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("");
    }

    public static int sortDesc(final int num) {
        String numString = String.valueOf(num);
        String[] numStringArray = numString.split("");
        int[] intArray = new int[numStringArray.length];

        int i;
        for (i = 0; i < numStringArray.length; i++) {
            intArray[i] = Integer.valueOf(numStringArray[i]);
        }

        int highest = 0;
        int j;
        int helper;
        for (i = 0; i < intArray.length; i++) {
            for (j = i + 1; j < intArray.length; j++) {
                if (intArray[j] > intArray[i]) {
                    helper = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = helper;
                }
            }
        }

        int result = 0;
        for (i = 0; i < intArray.length; i++) {
            result = result * 10 + intArray[i];
        }
        return result;
}}
