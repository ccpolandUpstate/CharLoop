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
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0, count = 0, maxCount =0, max = 0;
        char vChar;
        char maxChar = ' ';
        for (int i = 0; i < vCount.length(); i++) {
            vChar = vCount.charAt(i);
            if (vChar == 'a' || vChar =='e' || vChar == 'i' || vChar == 'o' || vChar == 'u') {
                if (vChar == 'a') {
                    countA++;
                    count++; 
                }
                else if (vChar == 'e') {
                    countE++;
                    count++;
                }
                else if (vChar == 'i') {
                    countI++;
                    count++;
                }
                else if (vChar == 'o') {
                    countO++;
                    count++;
                }
                else if (vChar == 'u') {
                    countU++;
                    count++;
                } 
                vowelCount = Math.max(countA, Math.max(countE, Math.max(countI, Math.max(countO, countU))));
            }
        }
        //System.out.println("vowel " + maxChar + " occurs " + vowelCount + " times.");
        return vowelCount;
    }
    // METHOD FOR DETERMING WHICH FOLLOW SHOWS UP MOST
    public static char whichVowel(String whatVowel) {
        char max_alpha=' '; int max_freq=0, ct=0;
        char ch;
        for(int i=0;i<whatVowel.length();i++){
            ch=whatVowel.charAt(i);
            if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u') {
                for (int j=0; j<whatVowel.length(); j++) {
                    if (whatVowel.charAt(j)==ch)
                    ct++;
                }
            }
            if(ct>max_freq){
                max_alpha=ch;
            }
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
        // Scanner Class & Initalization
        Scanner scan = new Scanner(System.in);
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

        // Vowel Counter: Pulled from Line: ##: Method: maxVowelCount
        if (maxVowelCount(vowels) > 0)
        System.out.println("vowel " + whichVowel(vowels) + " occurs the most = " + maxVowelCount(vowels));
        else
        System.out.println("no vowels");
    }
 }
