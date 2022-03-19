//Name: Chase Poland
//Class: CSPC 200
//Date: 03/15/22
//Version: A
//Time: 2 hours
//Status: I think hardest part was trying to figure out the logic for the B version. 
//Status: Especailly at first, because I was trying to do it in one method but was trying to return an int value. Finally just made a void return. 

import java.util.Scanner;
public class CharLoop
{
    // THE METHOD FOR DETECTING THE # OF VOWELS 
    public static int vowels(String str)
    {
        int countVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                countVowels ++;
            }
        }
        return countVowels;
    }
    // THE METHOD FOR DETECTING THE # OF UPPER CASE LETTERS
    public static int upperCase(String str)
    {
        int countUpperCase = 0; 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                countUpperCase++;
            }
        }
        return countUpperCase;
    }
    // THE METHOD FOR DETECTING THE # OF DIGITS 
    public static int digitCount(String str)
    {
        int countDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                countDigits++;
            }
        }
        return countDigits;
    }
    // THE METHOD FOR DETECTING THE # OF WHITESPACES
    public static int whiteSpace(String str) 
    {
        int countWhiteSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                countWhiteSpace++;
            }
        }
        return countWhiteSpace; 
    }
    // METHOD FOR DETERMING WHICH VOWEL SHOWS UP MOST
    public static void whichVowel(String str) {
        char outputCharacter = ' '; 
        int charMax = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == c)
                    count++;
                }
            }
            if (count > charMax) {
                charMax = count;
                outputCharacter = c;
            }
            count = 0;
            str = str.replace(c,' ');
        }
        if (charMax > 0)
        System.out.println("vowel " + outputCharacter + " occurs the most = " + charMax);
        else
        System.out.println("no vowels");
        return;
    }
    // THE METHOD FOR DETECTING REPEATED CHARACTERS
    public static void repeatedC(String str) {
        StringBuilder f = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.charAt(i) == str.charAt(i-1)) {
                f.append(c).append(" ");
            }
        }
        if (f.length() > 0)
        System.out.print("repeated characters: " + f);
        else
        System.out.println("no repeating characters");
        return;
    }
    public static void main(String[] args)
    {
        try (// Scanner Class & Initalization
        Scanner scan = new Scanner(System.in)) {
            String _userInput_ = scan.nextLine();
            String lowerCase = _userInput_.toLowerCase();

            // Vowel Count: Pulled from Line: 12: Method: Vowel
            System.out.println("vowels = " + vowels(lowerCase)); // .toLowerCase so that it accounts for all vowels.

            // Uppercase Count: Pulled from Line: 24: Method: upperCase
            System.out.println("upper = " + upperCase(_userInput_));

            // Digits Counter: Pulled from Line: 35: Method: digitCount
            System.out.println("digits = " + digitCount(_userInput_));

            // Whitespace Counter: Pulled from Line: 46: Method: whiteSpace
            System.out.println("whitespace = " + whiteSpace(_userInput_));

            // Vowel Counter: Pulled from Line: 58 Method: maxVowelCount & whichVowel
            whichVowel(lowerCase);

            // Repeated Characters: Pulled from Line: 82 Method: repeatedC
            repeatedC(_userInput_);
        }
    }
 }