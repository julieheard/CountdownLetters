package countdownletters;

import java.util.Arrays;

public class CountdownLetters {

    public static void main(String[] args) {

        char[] vowels = {'u', 'o', 'i', 'e', 'a'};

        char[] consonants = new char[21];

        int newChar = 0;
        boolean found;
        for (char i = 'a'; i <= 'z'; i++) {
            found = false;
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                consonants[newChar] = i;
                newChar++;
            }
        }

        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(consonants));
    }
}



