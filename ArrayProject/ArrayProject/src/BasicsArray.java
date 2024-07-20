import java.util.Scanner;
public class BasicsArray {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        // Declaration
        int arr[];

        // Allocation of memory

        arr = new int[5];
        
        // Checking the length of array before and after initialisation
        System.out.println(arr.length);
        
        // Initialisation
        arr = new int[]{10,20,02,30};
        
        // Checking the length of array after initialisation
        System.out.println(arr.length);
        int i=0;
        for(;i<arr.length;){
            int temp = s.nextInt();
            arr[i] = temp;
            i++;
        }

        System.out.println(arr[3]);
        
        s.close();
    }
}
