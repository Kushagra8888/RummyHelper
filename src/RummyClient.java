import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by test on 7/30/2015.
 */
public class RummyClient {

    public static void main(String[] args) {
        int length = 13;
        RummyHelper rummyHelper = new RummyHelper();
        int[] cardsInHand = Dealer.randomCardsGenerator(length);
        int minReplacements = rummyHelper.getMinimumReplacementsForWin(cardsInHand);
        System.out.print("Minimum Replacements Required = " + minReplacements);
    }
}
