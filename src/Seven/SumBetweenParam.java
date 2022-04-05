package Seven;

public class SumBetweenParam {
    public static void main (String[] args) {
        System.out.println(GetSum(1, 0));
        System.out.println(GetSum(1, 2));
        System.out.println(GetSum(0, 1));
        System.out.println(GetSum(1, 1));
        System.out.println(GetSum(-1, 0));
        System.out.println(GetSum(-1, 2));
    }

    static public int GetSum(int a, int b)
    {
        int ans = 0;
        int helper = b;
        
        if (a > b) {
            b = a;
            a = helper;
        }

        while (a <= b) {
            ans += a;
            a++;
        }

        return ans;
    }
}
