import java.util.Scanner;

public class CountCharacters {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for (char ch : str.toCharArray()) {
            if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }else if(Character.isDigit(ch)){
                digits++;
            }else{
                special++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + special);
    }
}
