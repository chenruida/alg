import sort.GlobalClass;

/**
 * factorial
 */
public class factorial {

    private long facl(int a) {
        if (a == 1)
            return 1;
        else
            return a * facl(a - 1);
    }

    private static int sum(int[] a, int start) {
        if (start == a.length) {
            return 0;
        } else
            return a[start] + sum(a, ++start);
    }

    private static int count(int[] a, int start) {
        if (start == a.length) {
            return start;
        } else
            return count(a, ++start);
    }

    private static int finMax(int[] a, int start) {
        if (start == a.length - 1) {
            return a[start];
        } else
            return Math.max(a[start], finMax(a, ++start));
    }

    public static void main(String[] args) {
        int[] a = { 1, 11, 3, 9, 5 };
        System.out.println(count(a, 0));
        System.out.println(finMax(a, 0));
    }
}