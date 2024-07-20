import java.util.Scanner;

public class inputValue {
    public static void main(String[] args) {
        
        Scanner inputVal = new Scanner(System.in);

        System.out.println("Enter Your age :");

        int age = inputVal.nextInt();

        System.out.println(age);

        inputVal.close();
    }
}
