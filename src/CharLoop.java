// 

import java.util.Scanner;
public class CharLoop
{
    // THE METHOD FOR DETECTING THE # OF VOWELS 
    public static int vowels(String vCount)
    {
        int countVowels = 0;
        for (int i = 0; i < vCount.length(); i++) {
            char vChar = vCount.charAt(i);
            if (vChar == 'a' || vChar =='e' || vChar == 'i' || vChar == 'o' || vChar == 'u') {
                countVowels ++;
            }
        }
		return countVowels;
    }

    // METHOD FOR DETERMING WHICH VOWEL SHOWS UP MOST
    public static void whichVowel(String whatVowel) {
        char output_C = ' '; int c_max = 0, count = 0;
        char c;
        for (int i=0; i < whatVowel.length(); i++){
            c = whatVowel.charAt(i);
            if (c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u') {
                for (int j=0; j < whatVowel.length(); j++){
                    if (whatVowel.charAt(j) == c)
                    count++;
                }
            }
            if (count > c_max){
                c_max = count;
                output_C = c;
            }
            count = 0;
            whatVowel = whatVowel.replace(c,' ');
        }
        if (c_max > 0)
        System.out.println("vowel " + output_C + " occurs = " + c_max);
        else
        System.out.println("no vowels");
        return;
    }
    // THE METHOD FOR DETECTING THE # OF UPPER CASE LETTERS
    public static int upperCase(String upperCaseCounter)
    {
        int countUpperCase = 0; 
        for (int i = 0; i < upperCaseCounter.length(); i++) {
            if (upperCaseCounter.charAt(i) >= 'A' && upperCaseCounter.charAt(i) <= 'Z') {
                countUpperCase++;
            }
        }
        return countUpperCase;
    }
    // THE METHOD FOR DETECTING THE # OF DIGITS 
    public static int digitCount(String digitCounter)
    {
        int countDigits = 0;
        for (int i = 0; i < digitCounter.length(); i++) {
            if (digitCounter.charAt(i) >= '0' && digitCounter.charAt(i) <= '9') {
                countDigits++;
            }
        }
        return countDigits;
    }
    // THE METHOD FOR DETECTING THE # OF WHITESPACES
    public static int whiteSpace(String whiteSpaceCounter) 
    {
        int countWhiteSpace = 0;
        for (int i = 0; i < whiteSpaceCounter.length(); i++) {
            if (whiteSpaceCounter.charAt(i) == ' ') {
                countWhiteSpace++;
            }
        }
        return countWhiteSpace; 
    }
    public static void repeatedC(String repeatedCharacters) {
        StringBuilder f = new StringBuilder();
        char c;
        for (int i = 1; i < repeatedCharacters.length(); i++) {
            c = repeatedCharacters.charAt(i);
            if (repeatedCharacters.charAt(i) == repeatedCharacters.charAt(i-1)) {
                f.append(" ").append(c);
            }
        }
        if (f.length() > 1)
        System.out.print(f);
        else
        System.out.println("no repeating characters");
        return;
    }
    public static void main(String[] args)
    {
        try (// Scanner Class & Initalization
        Scanner scan = new Scanner(System.in)) {
            String _userInput_ = scan.nextLine();

             // Vowel Count: Pulled from Line: 4: Method: Vowel
            String vowels = _userInput_.toLowerCase();
            System.out.println("vowels = " + vowels(vowels));

            // Uppercase Count: Pulled from Line: 42: Method: upperCase
            System.out.println("upper = " + upperCase(_userInput_));

            // Digits Counter: Pulled from Line: 53: Method: digitCount
            System.out.println("digits = " + digitCount(_userInput_));

            // Whitespace Counter: Pulled from Line: 64: Method: whiteSpace
            System.out.println("whitespace = " + whiteSpace(_userInput_));

            // Vowel Counter: Pulled from Line: 17 Method: maxVowelCount & whichVowel
            whichVowel(vowels);

            // Repeated Characters: Pulled from Line: 75 Method: repeatedC
            repeatedC(_userInput_);
        }
    }
 }
