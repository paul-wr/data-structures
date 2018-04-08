public class BubbleSort {
    public static void main(String[] args){
        // create array to sort
        int[] array = {33, 232, 11, 77, 2, 45, 3, 90, 21, 312, 444, 2};


        // print unsorted array
        System.out.println("Array Length: "+array.length);

        // print unsorted array
        System.out.println("Unsorted Array:");
        printArray(array);

        // call bubbleSort method with array parameter
        bubbleSort(array);

        // print sorted array
        System.out.println("Sorted Array:");
        printArray(array);

    }

    // method to traverse array and print each element
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    // method to sort array with int array parameter
    public static void bubbleSort(int[] array){
        int bigO = 0;
        // store array length
        int n = array.length;

        // int variable to allow swapping of elements
        int temp;

        // for loop traverses array
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++) {
                bigO++;
                // compare each element value with the next element value in the array
                if (array[j - 1] > array[j]) {
                    // if left position value is greater, assign the value to temp
                    temp = array[j - 1];
                    // assign the position the smaller value
                    array[j-1] = array[j];
                    // set the larger value to the right side element
                    array[j] = temp;
                }
            }
        }
        System.out.println("\nO(n^2) for this array = "+bigO+"\n");
    }
}
