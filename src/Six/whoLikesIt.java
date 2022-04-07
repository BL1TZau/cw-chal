package Six;

public class whoLikesIt {
    public static void main(String[] args) {
        String[] array1 = {};
        String[] array2 = {"Peter"};
        String[] array3 = {"Peter", "Alex"};
        String[] array4 = {"Peter", "Alex", "Ed"};
        String[] array5 = {"Peter", "Alex", "Ed", "hey", "number"};

        System.out.println(whoLikesIt(array1));
        System.out.println(whoLikesIt(array2));
        System.out.println(whoLikesIt(array3));
        System.out.println(whoLikesIt(array4));
        System.out.println(whoLikesIt(array5));

        System.out.println(otherSolution(array1));
        System.out.println(otherSolution(array2));
        System.out.println(otherSolution(array3));
        System.out.println(otherSolution(array4));
        System.out.println(otherSolution(array5));
    }


    public static String whoLikesIt(String[] names) {
        StringBuilder sb = new StringBuilder();

        // array >= 4
        if (names.length >= 4) {
            sb.append(names[0]).append(", ").append(names[1]).append(" and ").append(names.length - 2).append(" others like this");
            return sb.toString();
        }

        // array empty
        if (names.length == 0) {
            sb.append("no one likes this");
            return sb.toString();
            // array = 1
        } else if (names.length == 1) {
            sb.append(names[0]).append(" likes this");
            return sb.toString();
            // array 2/3
        } else {
            sb.append(names[0]);
            int i;
            for (i = 1; i < names.length; i++) {
                if (i == names.length - 1) {
                    sb.append(" and ");
                }
                 else if (i < names.length -1) {
                    sb.append(", ");
                }
                sb.append(names[i]);
            }
        }
        sb.append(" like this");
        return sb.toString();
        }

    public static String otherSolution(String[] names) {
        switch (names.length) { // switch based off index
            case 0 : return "no one likes this"; // case int (index)
            case 1 : return String.format("%s likes this", names[0]); // %s returns string, but don't think it matters since putting into string
            case 2 : return String.format("%s and %s like this", names[0], names[1]);
            case 3 : return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default : return String.format("%s, %s and %d like this", names[0], names[1], names.length - 2); // %d gives int
        }
    }
    }


