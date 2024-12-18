import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    // code here ...
    // my_array = newArr;

    int[] newArr = new int[10];
    newArr[indexPosition] = newValue;
    for (int i = 0; i < indexPosition; i++){
        newArr[i] = my_array[i];
        if (indexPosition == (my_array.length - 1)) {
        System.out.println("Original Array : " + Arrays.toString(my_array));
        break; 
        }
        }
    for (int j = (indexPosition + 1); j < my_array.length; j++) {
        if (indexPosition != (my_array.length - 1)) {
        newArr[j] = my_array[j-1];
        } else {
          break;
        }
        if (indexPosition != (my_array.length - 1)) {
        System.out.println("New Array : " + Arrays.toString(newArr));}
    }
  }
}