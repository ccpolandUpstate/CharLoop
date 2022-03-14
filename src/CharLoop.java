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
    // THE METHOD FOR DETECTING THE MAX COUNT OF VOWEL
    public static int maxVowelCount(String vCount) {
        int vowelCount = 0;
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
        char vChar;
        for (int i = 0; i < vCount.length(); i++) {
            vChar = vCount.charAt(i);
            if (vChar == 'a' || vChar =='e' || vChar == 'i' || vChar == 'o' || vChar == 'u') {
                if (vChar == 'a') {
                    countA++;
                }
                else if (vChar == 'e') {
                    countE++;
                }
                else if (vChar == 'i') {
                    countI++;
                }
                else if (vChar == 'o') {
                    countO++;
                }
                else if (vChar == 'u') {
                    countU++;
                } 
                vowelCount = Math.max(countA, Math.max(countE, Math.max(countI, Math.max(countO, countU))));
            }
        }
        //System.out.println("vowel " + maxChar + " occurs " + vowelCount + " times.");
        return vowelCount;
    }
    // METHOD FOR DETERMING WHICH VOWEL SHOWS UP MOST
    public static char whichVowel(String whatVowel) {
        char max_alpha=' '; int max_freq=0, count=0;
        char c;
        for (int i=0; i<whatVowel.length(); i++){
            c = whatVowel.charAt(i);
            if (c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u') {
                for (int j=0; j<whatVowel.length(); j++){
                    if (whatVowel.charAt(j) == c)
                    count++;
                } //for j
            }
            if (count > max_freq){
                max_freq=count;
                max_alpha=c;
            }
            count=0;
            whatVowel=whatVowel.replace(c,'*');
        }
        return max_alpha;
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
    public static void main(String[] args)
    {
        try (// Scanner Class & Initalization
        Scanner scan = new Scanner(System.in)) {
            String _userInput_ = scan.nextLine();

             // Vowel Count: Pulled from Line: 6: Method: Vowel
            String vowels = _userInput_.toLowerCase();
            System.out.println("vowels = " + vowels(vowels));

            // Uppercase Count: Pulled from Line: 16: Method: upperCase
            System.out.println("upper = " + upperCase(_userInput_));

            // Digits Counter: Pulled from Line: 27: Method: digitCount
            System.out.println("digits = " + digitCount(_userInput_));

            // Whitespace Counter: Pulled from Line: 38: Method: whiteSpace
            System.out.println("whitespace = " + whiteSpace(_userInput_));

            // Vowel Counter: Pulled from Line: 17 & 46: Method: maxVowelCount & whichVowel
            if (maxVowelCount(vowels) > 0)
            System.out.println("vowel " + whichVowel(vowels) + " occurs the most = " + maxVowelCount(vowels));
            else
            System.out.println("no vowels");
        }
    }
 }
