public class ForLoops {
    public static void main(String args[]) {
        // basic for loop
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        // iterating through an array
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 1 2 3 4 5
        }

        // enhanced for loop
        for (int num : arr) {
            System.out.print(num + " "); // 1 2 3 4 5
        }

        // using break statement - exits the loop when i is 3
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.print(i + " "); // 0 1 2
        }

        // using continue statement - skips the iteration when i is 3
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " "); // 0 1 2 4
        }

        // nested for loop breaks when i is 2 and j is 3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 3) {
                    break;
                }
                System.out.print("(" + i + "," + j + ") "); // (0,0) (0,1) (0,2) (0,3) (0,4) (1,0) (1,1) (1,2) (1,3)
                                                            // (1,4) (2,0) (2,1) (2,2) (3,0) (3,1) (3,2) (3,3) (3,4)
                                                            // (4,0) (4,1) (4,2) (4,3) (4,4)
            }
        }

        // nested for loop with continue statement - skips the iteration when i is 2 and
        // j is 3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 3) {
                    continue;
                }
                System.out.print("(" + i + "," + j + ") "); // (0,0) (0,1) (0,2) (0,3) (0,4) (1,0) (1,1) (1,2) (1,3)
                                                            // (1,4) (2,0) (2,1) (2,2)
                                                            // (2,4) (3,0) (3,1) (3,2) (3,3) (3,4) (4,0) (4,1)
                                                            // (4,2) (4,3) (4,4)
            }
        }

        // nested for loop with labeled break statement - exits the outer loop when i is
        // 2
        outerLoop: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 3) {
                    break outerLoop;
                }
                System.out.print("(" + i + "," + j + ") "); // (0,0) (0,1) (0,2) (0,3) (0,4) (1,0) (1,1) (1,2) (1,3)
                                                            // (1,4) (2,0) (2,1) (2,2)
            }
        }

        // nested for loop with labeled continue statement - skips the iteration of the
        // outer loop when i is 2 and j is 3
        outerLoop: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 3) {
                    continue outerLoop;
                } 
                System.out.print("(" + i + "," + j + ") "); // (0,0) (0,1) (0,2) (0,3) (0,4) (1,0) (1,1) (1,2) (1,3)
                                                                // (1,4) (2,0) (2,1) (2,2)
                                                                // (3,0) (3,1) (3,2) (3,3) (3,4) (4,0) (4,1)
                                                                // (4,2) (4,3) (4,4)
            }
        }
    }
}
