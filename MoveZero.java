public class MoveZero {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }

        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}