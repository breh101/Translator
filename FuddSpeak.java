/**
 * Program for translating English to Pirate and Elmer Fudd speak.
 *
 * @author Summer Sneed
 * @version 1.0
 *
 * Class to translate English to Elmer Fudd Speak. */
public class FuddSpeak {
/** The String sentence that ends up being the translated sentence. */
    private String fSentence = "";

/** String method for translating from English to Elmer Fudd Speak.
 * @param s English String inputted by user.
 * @return Returns translated sentence in Elmer Fudd Speak.
 */
    public String fTranslator(String s) {
        fSentence = "";
        String[] split = s.split(" ");
        for (String word : split) {
            //Translations begin here checking for substrings and capitalization.
            if (word.contains("th") && word.contains("ith")) {
                String replaceStr = word.replaceAll("ith", "if");
                fSentence += (replaceStr + " ");
            } else if (word.contains("Th") && word.contains("Ith")) {
                String replaceStr = word.replaceAll("Ith", "If");
                fSentence += (replaceStr + " ");
            } else if (!word.contains("ith") && word.contains("th")) {
                String replaceStr = word.replaceAll("th", "d");
                fSentence += (replaceStr + " ");
            } else if (!word.contains("Ith") && word.contains("Th")) {
                String replaceStr = word.replaceAll("Th", "D");
                fSentence += (replaceStr + " ");
            } else if (word.contains("l")) {
                String replaceStr = word.replaceAll("l", "w");
                fSentence += (replaceStr + " ");
            } else if (word.contains("L")) {
                String replaceStr = word.replaceAll("L", "W");
                fSentence += (replaceStr + " ");
            } else if (word.contains("r")) {
                String replaceStr = word.replaceAll("r", "w");
                fSentence += (replaceStr + " ");
            } else if (word.contains("R")) {
                String replaceStr = word.replaceAll("R", "W");
                fSentence += (replaceStr + " ");
            } else {
                fSentence += (word + " ");
            }
        }
        return fSentence;
    }
    /** Accessor method to access the sentence.
     * @return Returns the String Elmer Fudd translated sentence.
    */
    public String getFSentence() {
        return fSentence;
    }
}
