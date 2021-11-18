package sort;

public class Quick {
    private static int getIndex(int[] array, int low, int high) {
        int pivot = array[low];
        int start = low;
        while (low < high) {
            //一定要先右再左
            while (low < high && array[high] >= pivot)
                high--;
            while (low < high && array[low] <= pivot)
                low++;
            if (low < high)
                exch(array, low, high);
        }
        exch(array, start, low);
        return low;
    }

    private static void sort(int[] array, int low, int high) {
        if (low < high) {
            int index = getIndex(array, low, high);
            sort(array, low, index - 1);
            sort(array, index + 1, high);
        }
    }

    private static void exch(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        GlobalClass.show10();
        sort(GlobalClass.numbers10, 0, GlobalClass.numbers10.length - 1);
        GlobalClass.show10();
    }
}
