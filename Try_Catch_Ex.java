import java.util.Scanner;

class VowelNotFoundException extends Exception {
    public VowelNotFoundException(String message) {
        super(message);
    }
}

public class Try_Catch_Ex {

    public void vowel_Check(String str) throws VowelNotFoundException {
        boolean containsVowels = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                containsVowels = true;
                break;
            }
        }
        if (!containsVowels) {
            throw new VowelNotFoundException("No vowels found in the given string");
        } else {
            System.out.println("String contains vowels");
        }
    }

    public static void main(String[] args) {
        Try_Catch_Ex obj = new Try_Catch_Ex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        try {
            obj.vowel_Check(str);
        } catch (VowelNotFoundException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
