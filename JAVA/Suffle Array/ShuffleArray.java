import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter How many element do yo want in your Array:");
        int n=sc.nextInt();
        
        int[] array = new int[n];
        
        System.out.print("Enter Array Values: ");

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        shuffleArray(array);

        // Print the shuffled array
        System.out.println("Shuffled array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
