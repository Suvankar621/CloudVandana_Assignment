import java.util.Scanner;

class PangramChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter Your Sentence: ");
    
        String input = sc.nextLine(); // Example: The quick brown fox jumps over the lazy dog: True
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {

        boolean[] alphabetPresent = new boolean[26];

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'a' && c <= 'z') {

                alphabetPresent[c - 'a'] = true;
            }
        }

        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false; 
            }
        }

        return true;
    }
}
