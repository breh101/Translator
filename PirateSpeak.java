/**
 * Program for translating English to Pirate and Elmer Fudd speak.
 *
 * @author Summer Sneed
 * @version 1.0
 *
 * Class to translate English to PirateSpeak. */
public class PirateSpeak {
/** The String sentence that ends up being the translated sentence. */
    private String pSentence = "";

/** String method for translating from English to Pirate Speak.
 * @param s English String inputted by user.
 * @return Returns translated sentence in Pirate Speak.
 */
    public String pTranslator(String s) {
        //Translations begin here checking for capitalization, punctuation, and substrings.
        String[] split = s.split(" ");
        String sentence = "";
        for (String word : split) {
            if (word.equals("and")) {
                String replaceStr = word.replaceAll("and", "'n");
                sentence += (replaceStr + " ");
            } else if (word.equals("And")) {
                String replaceStr = word.replaceAll("And", "'N");
                sentence += (replaceStr + " ");
            } else if (word.equals("my")) {
                String replaceStr = word.replaceAll("my", "me");
                sentence += (replaceStr + " ");
            } else if (word.equals("My")) {
                String replaceStr = word.replaceAll("My", "Me");
                sentence += (replaceStr + " ");
            } else if (word.equals("is")) {
                String replaceStr = word.replaceAll("is", "be");
                sentence += (replaceStr + " ");
            } else if (word.equals("Is")) {
                String replaceStr = word.replaceAll("Is", "Be");
                sentence += (replaceStr + " ");
            } else if (word.equals("are")) {
                String replaceStr = word.replaceAll("are", "be");
                sentence += (replaceStr + " ");
            } else if (word.equals("Are")) {
                String replaceStr = word.replaceAll("Are", "Be");
                sentence += (replaceStr + " ");
            } else if (word.equals("am")) {
                String replaceStr = word.replaceAll("am", "be");
                sentence += (replaceStr + " ");
            } else if (word.equals("Am")) {
                String replaceStr = word.replaceAll("Am", "Be");
                sentence += (replaceStr + " ");
            } else if (Character.isLetterOrDigit(word.charAt(word.length() - 1)) && word.contains("ing")) {
                //Checks for punctuation.
                String replaceStr = word.substring(0, word.length() - 4) + "in'" + word.charAt(word.length() - 1);
                sentence += (replaceStr + " ");
            } else if (word.contains("ing") && word.endsWith("ing")) {
                //Checks for substrings.
                String replaceStr = word.substring(0, word.length() - 3) + "in'";
                sentence += (replaceStr + " ");
            } else if ((word.contains("you") && word.substring(0, 3).equals("you"))) {
                //Checks for substrings.
                String replaceStr = "ye" + word.substring(3);
                sentence += (replaceStr + " ");
            } else if (word.contains("You") && word.substring(0, 3).equals("You")) {
                //Checks for substrings.
                String replaceStr = "Ye" + word.substring(3);
                sentence += (replaceStr + " ");
            } else if (word.equals("you")) {
                String replaceStr = word.replaceAll("you", "ye");
                sentence += (replaceStr + " ");
            } else if (word.equals("You")) {
                String replaceStr = word.replaceAll("You", "Ye");
                sentence += (replaceStr + " ");
            } else {
                sentence += (word + " ");
            }
        }
        pSentence = "";
        pSentence += ("Yarr! " + sentence);
        return pSentence;
    }
/** Accessor method to access the translated sentence.
* @return Returns the String Pirate translated sentence.
*/
    public String getPSentence() {
        return pSentence;
    }
}
