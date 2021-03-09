/**
 * Program for translating English to Pirate and Elmer Fudd speak.
 *
 * @author Summer Sneed
 * @version 1.0
 *
 * Class to keep track of record of past translations. */
public class History {
/** The String array where translations are stored. */
    private String[] transArray = new String[3]; // Up to 3 history records will be stored in translation array.
/** The number of records currently stored in the translations array. */
    private int recordNum = 0;
/** Method that adds a history record to the translation array.
 *
 * @param s English to Pirate or Elmer Fudd translation.
*/
    public void addHistory(String s) {
        //Adds history translation records to array.
        if (recordNum < 3) {
            transArray[recordNum] = s;
            recordNum++;
        } else if (recordNum == 3) {
            transArray[0] = transArray[1];
            transArray[1] = transArray[2];
            transArray[2] = s;
        }
    }
/** Method that prints past translations that are stored in translation array.*/
    public void transHistory() {
        //Prints history record array.
        if (recordNum == 3) {
            System.out.println("Past Translations:\n" + transArray[0] + "\n" + transArray[1] + "\n" + transArray[2]);
        } else if (recordNum == 2) {
            System.out.println("Past Translations:\n" + transArray[0] + "\n" + transArray[1]);
        } else if (recordNum == 1) {
            System.out.println("Past Translations:\n" + transArray[0]);
        } else if (recordNum == 0) {
            System.out.println("Past Translations:");
        } else {
            return;
        }
    }
}
