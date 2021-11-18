package sort;

/**
 * @author chenrd
 * @date 2021/9/2
 **/
public class GlobalClass {
    public static int[] numbers10 = { 11, 79, 38, 74, 58, 4, 33, 86, 93, 52 };
    public static int[] numbers100 = { 41, 73, 40, 23, 90, 52, 11, 23, 23, 2, 75, 35, 10, 96, 83, 8, 18, 65, 84, 82, 4,
            29, 54, 71, 44, 91, 14, 71, 6, 38, 74, 13, 1, 1, 14, 33, 74, 83, 86, 70, 8, 6, 83, 100, 33, 16, 33, 29, 92,
            94, 10, 92, 61, 98, 47, 42, 80, 55, 68, 34, 39, 75, 87, 21, 72, 79, 47, 90, 98, 30, 38, 43, 98, 54, 65, 64,
            79, 78, 89, 57, 18, 43, 22, 19, 50, 86, 93, 28, 70, 78, 45, 89, 90, 95, 77, 57, 7, 28, 44 };

    public static void show10() {
        for (int i = 0; i < numbers10.length; i++) {
            System.out.print(numbers10[i]);
            if (i != numbers10.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("===============");
    }

    public static void show100() {
        for (int i = 0; i < numbers100.length; i++) {
            System.out.print(numbers100[i]);
            if (i % 20 == 0 && i != 0) {
                System.out.println();
            }
            if (i != numbers100.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("===============");
    }
}
