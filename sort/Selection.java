package sort;

import GlobalClass;

/**
 * 选择排序，找到当前数后面比它小的数，交互位置。
 */
public class Selection {
    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                int temp = array[i];
                array[i] = array[indexMin];
                array[indexMin] = temp;
            }

        }
    }

    public static void main(String[] args) {
        GlobalClass.show10();
        sort(GlobalClass.numbers10);
        GlobalClass.show10();
    }
}
