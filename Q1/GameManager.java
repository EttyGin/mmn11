package Q1;
import java.util.Scanner;

public class GameManager {
    private final String CHARS = "abcdefghijklmnopqrstuvwxyz";
    private final String chosenWord;
    private String remainingChar = CHARS;
    private String knownWord="";
    private int cntr =0;

    public GameManager() {
        chosenWord = Vocabulary.getRandWord();
        int len = chosenWord.length();
        while (len>0) {
            knownWord+="_";
            len--;
        }
    }
    public void play() {
        while (!chosenWord.equals(knownWord)) {
            anotherGuess();
            cntr++;
            System.out.println(knownWord);
        }
        System.out.println("Well done! you won after "+ cntr+ " steps");
    }
    public void anotherGuess() {
        char crtChar = pickALetter();
        updateWords(crtChar);
    }
    public char pickALetter() {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a letter, the remaining letters are: " + remainingChar);
        char input= Character.toLowerCase(s.nextLine().charAt(0));
        while (('a'>input || 'z'<input) || remainingChar.indexOf(input)==-1) {
            if ('a'>input && 'z'<input)
                System.out.println("Invalid input, try again. The remaining letters are: " + remainingChar);
            else 
                System.out.println("You already guessed it!, try again. The remaining letters are: " + remainingChar);
            input= Character.toLowerCase(s.next().charAt(0));
        }
        return input;
    }
    public void updateWords(char crtChar) {
        int ind=remainingChar.indexOf(crtChar);
        remainingChar=remainingChar.substring(0, ind) + remainingChar.substring(ind + 1);
        if(chosenWord.indexOf(crtChar)!=-1)	{
            int len=chosenWord.length()-1;
            while(len>=0) {
                if(chosenWord.charAt(len)==crtChar) {
                    knownWord=knownWord.substring(0, len) +crtChar+ knownWord.substring(len + 1);
                }
                len--;
            }
        }
    }
}