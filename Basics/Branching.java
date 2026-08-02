public class Branching {
    public static void main(String args[]) {
        // branching using If Elseif 
        int n = 0;

        if (n == 1) {
            System.out.println("ON");
        } else if (n == 0) {
            System.out.println("OFF");
        } else {
            System.out.println("Undefined");
        }

        // branching using Switch Case
        int day = 3;
        String dayString = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayString);
    }
}
