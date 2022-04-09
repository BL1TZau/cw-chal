package Seven;

public class StringEndsWith {
    public static void main(String[] args) {
        System.out.println(solution("abc", "bc"));
        System.out.println(solution("abc", "d"));
    }
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
}}

