public class Datatypes {
    public static void main(String args[]) {
        // primitives data types in java
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40L;
        float e = 50.0f;
        double f = 60.0d;
        char g = 'A';
        boolean h = true;

        System.out.println("Byte value: " + a);
        System.out.println("Short value: " + b);
        System.out.println("Integer value: " + c);
        System.out.println("Long value: " + d);
        System.out.println("Float value: " + e);
        System.out.println("Double value: " + f);
        System.out.println("Character value: " + g);
        System.out.println("Boolean value: " + h);

        // non-primitives data types in java
        String str = "Hello, World!";
        System.out.println("String value: " + str);
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.print("Array values: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
