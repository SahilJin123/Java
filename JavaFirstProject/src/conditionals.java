import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Income");
        // int income = input.nextInt();
        
        // if(income > 100000)
        // {
        //     System.out.println("Person is rich");
        // }else{
        //     System.out.println("Person is not rich");
        // }
        // input.close();

        // income > 100000 ? System.out.println("Rich"): System.out.println("Poor");

        // The issue in the above line of code is with its syntax. In Java, the
        //  conditional operator (ternary operator) ?: requires an expression that 
        //  evaluates to a value, not a statement. System.out.println() is a statement and 
        //  cannot be used directly within the conditional operator.
        // income > 100000 is the condition.
        // "Rich" is the value returned if the condition is true.
        // "Poor" is the value returned if the condition is false

        // Hence the above statement will not work

        // System.out.println( income > 100000 ? "Rich" : "Poor");


        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter the correct day number");
                break;
        }


        input.close();


    }   
}
