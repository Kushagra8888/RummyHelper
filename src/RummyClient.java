import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by test on 7/30/2015.
 */
public class RummyClient {

    public static void main(String[] args) {

    }

    static int[] randomCardsGenerator() {
        int[] cards = new int[13];
        ArrayList<Integer> allCards = new ArrayList<Integer>();
        for (int i = 1; i < 160; i++) {
            allCards.add(new Integer(i));
        }
        Collections.shuffle(allCards);
        for (int i = 0; i < 13; i++) {
            cards[i] = allCards.get(i) % 53;
        }

        return cards;
    }

}
