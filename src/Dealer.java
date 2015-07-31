import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by test on 7/31/2015.
 */
public class Dealer {

    static int[] randomCardsGenerator(int length) {
        int[] cards = new int[13];
        ArrayList<Integer> allCards = new ArrayList<Integer>();
        for (int i = 1; i < 160; i++) {
            allCards.add(new Integer(i));
        }
        Collections.shuffle(allCards);
        for (int i = 0; i < length; i++) {
            cards[i] = allCards.get(i) % 53;
        }

        return cards;
    }

}
