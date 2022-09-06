//Dutch National Flag Algorithm

public class sort012 {
    static void sort1(int arr[], int size) {
        int low = 0;
        int mid = 0;
        int high = size - 1;
        int temp = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }
            }
        }

    }

    static void printarray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 0, 0, 2, 0, 0, 0 };
        int size = arr.length;
        sort1(arr, size);
        printarray(arr, size);
    }
}
