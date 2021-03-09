import java.util.Scanner;
/**
 * Program for translating English to Pirate and Elmer Fudd speak.
 *
 * @author Summer Sneed
 * @version 1.0
 */
public class PirateFudd {
/**
 *
 * @param args Command line arguments.
 */
    public static void main(String[] args) {
        PirateSpeak ps1 = new PirateSpeak();
        FuddSpeak fs1 = new FuddSpeak();
        History h1 = new History();
        Scanner scan = new Scanner(System.in);
        char pAnswer;
        char fAnswer;
        char answer;
        while (true) {
            //Prints pirate translation if input is Y for Yes and doesn't if N for No.
            System.out.print("Input English Sentence. ");
            String sentence = "";
            sentence = scan.nextLine();
            System.out.print("Pirate (Y/N): ");
            pAnswer = scan.nextLine().charAt(0);
            if (pAnswer == 'Y') {
                System.out.println(ps1.pTranslator(sentence));
            } else if (pAnswer == 'N') {
                boolean b = false;
            } else {
                while (true) {
                    //Checks if user inputted anything other than Y or N.
                    System.out.print("Pirate (Y/N): ");
                    pAnswer = scan.nextLine().charAt(0);
                    if (pAnswer == 'Y') {
                        System.out.println(ps1.pTranslator(sentence));
                        break;
                    } else if (pAnswer == 'N') {
                        break;
                    }
                }
            }
            //Prints pirate translation if input is Y for Yes and doesn't if N for No.
            System.out.print("Elmer Fudd (Y/N): ");
            fAnswer = scan.nextLine().charAt(0);
            if (fAnswer == 'Y' && pAnswer == 'N') {
                System.out.println(fs1.fTranslator(sentence));
            } else if (pAnswer == 'Y' && fAnswer == 'Y') {
                System.out.println(fs1.fTranslator(ps1.getPSentence()));
            } else if (fAnswer == 'N') {
                boolean b = false;
            } else {
                while (true) {
                    //Checks if user inputted anything other than Y or N.
                    System.out.print("Elmer Fudd (Y/N): ");
                    fAnswer = scan.nextLine().charAt(0);
                    if (fAnswer == 'Y' && pAnswer == 'N') {
                        System.out.println(fs1.fTranslator(sentence));
                        break;
                    } else if (pAnswer == 'Y' && fAnswer == 'Y') {
                        System.out.println(fs1.fTranslator(ps1.getPSentence()));
                        break;
                    } else if (fAnswer == 'N') {
                        break;
                    }
                }
            }
            //Adds translation to history record depending on answer Y or N.
            if (pAnswer == 'Y' && fAnswer == 'Y') {
                h1.transHistory();
                h1.addHistory(sentence + " -> "  + fs1.fTranslator(ps1.getPSentence()));
            } else if (pAnswer == 'Y' && fAnswer == 'N') {
                h1.transHistory();
                h1.addHistory(sentence + " -> "  + ps1.getPSentence());
            } else if (pAnswer == 'N' && fAnswer == 'Y') {
                h1.transHistory();
                h1.addHistory(sentence + " -> "  + fs1.getFSentence());
            } else if (pAnswer == 'N' && fAnswer == 'N') {
                h1.transHistory();
            }
            //Asks user if they would like to translate again.
            System.out.print("\nWould you like to translate again (Y/N)? ");
            answer = scan.nextLine().charAt(0);
            if (answer == 'Y') {
                continue;
            } else if (answer == 'N') {
                break;
            } else {
                while (true) {
                    //Checks if user inputted anything other than Y or N.
                    System.out.print("Would you like to translate again (Y/N)? ");
                    answer = scan.nextLine().charAt(0);
                    if (answer == 'Y') {
                        break;
                    } else if (answer == 'N') {
                        return;
                    }
                }
            }
        }
    }
}
