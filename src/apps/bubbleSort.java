public class BubbleSort {
    public static void main(String[] args){
        int[] array = {33, 232, 11, 77, 2, 45, 3, 90, 21, 312, 444, 2};

        System.out.println("Unsorted Array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted Array:");
        printArray(array);

    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] array){
        int n = array.length;
        int temp;

        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
