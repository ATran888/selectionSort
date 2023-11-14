//start with the first position in the array
//search through the rest of the array for a smaller element
//if you find one, exchange places
//move to the next position and repeat from 2.

public class Main {
    public static void selectionSort(int[] numbers) {

        int unsorted = 0;

        while (unsorted<numbers.length) {
            //find smallest
            int minPos = unsorted;
            for (int i = unsorted; i < numbers.length; i++) {
                if (numbers[i] < numbers[minPos]) {
                    minPos = i;
                }
            }
            int temp = numbers[unsorted];
            numbers[unsorted] = numbers[minPos];
            numbers[minPos] = temp;

            unsorted++;
        }

        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i] + ", ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {22, 13, 10, 80, 19, 54, 51, 81, 30, 99, 73, 65, 36, 35, 74, 82, 12, 43, 6};
        selectionSort(numbers);

        //print out the arrays
    }
}