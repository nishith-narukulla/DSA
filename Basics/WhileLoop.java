public class WhileLoop {
    public static void main(String[] args) {
        // basic while loop example
        int count = 0;
        while (count < 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // nested while loop example
        int outerCount = 0;
        while (outerCount < 3) {
            int innerCount = 0;
            while (innerCount < 2) {
                System.out.println("Outer Count: " + outerCount + ", Inner Count: " + innerCount);
                innerCount++;
            }
            outerCount++;
        }

        // using break statement - exits the loop when count is 3
        count = 0;
        while (count < 5) {
            if (count == 3) {
                break;
            }
            System.out.println("Count is: " + count);
            count++;
        }

        // using continue statement - skips the iteration when count is 3
        count = 0;
        while (count < 5) {
            if (count == 3) {
                count++;
                continue;
            }
            System.out.println("Count is: " + count);
            count++;
        }

        // using labeled break statement - exits the outer loop when outerCount is 2 and
        // innerCount is 1
        outerCount = 0;
        outerLoop: while (outerCount < 3) {
            int innerCount = 0;
            while (innerCount < 2) {
                if (outerCount == 2 && innerCount == 1) {
                    break outerLoop;
                }
                System.out.println("Outer Count: " + outerCount + ", Inner Count: " + innerCount);
                innerCount++;
            }
            outerCount++;
        }

        // using labeled continue statement - skips the iteration when outerCount is 2
        // and innerCount is 1
        outerCount = 0;
        outerLoop: while (outerCount < 3) {
            int innerCount = 0;
            while (innerCount < 2) {
                if (outerCount == 2 && innerCount == 1) {
                    innerCount++;
                    continue outerLoop;
                }
                System.out.println("Outer Count: " + outerCount + ", Inner Count: " + innerCount);
                innerCount++;
            }
            outerCount++;
        }

        // do-while loop example - executes the loop body at least once
        count = 0;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 5);
        
    }
}
