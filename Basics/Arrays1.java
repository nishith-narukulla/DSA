import java.util.Arrays;

public class Arrays1 {
    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        String arr2[] = { "Hello", "World" };
        int arr3[] = { 1, 2, 3, 4, 6 };

        System.out.println("Array size: " + arr.length);
        System.out.println("Array size: " + arr2.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.equals(arr, arr3)); // false
        System.out.println(Arrays.mismatch(arr, arr3)); // 4
    }
}
