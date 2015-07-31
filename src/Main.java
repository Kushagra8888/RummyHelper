import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by test on 7/30/2015.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<int[]> tripletsList = new ArrayList<int[]>();

        for (int i = 1; i <= 13; i++) {
            int[] tripleSetCombos = new int[4];
            tripleSetCombos[0] = 0 * 13 + i;
            tripleSetCombos[1] = 1 * 13 + i;
            tripleSetCombos[2] = 2 * 13 + i;
            tripleSetCombos[3] = 3 * 13 + i;

            int[] tripleset = new int[3];

            tripleset[0] = tripleSetCombos[0];
            tripleset[1] = tripleSetCombos[1];
            tripleset[2] = tripleSetCombos[2];

            tripletsList.add(tripleset);

            tripleset[0] = tripleSetCombos[0];
            tripleset[1] = tripleSetCombos[1];
            tripleset[2] = tripleSetCombos[3];

            tripletsList.add(tripleset);

            tripleset[0] = tripleSetCombos[0];
            tripleset[1] = tripleSetCombos[2];
            tripleset[2] = tripleSetCombos[3];

            tripletsList.add(tripleset);

            tripleset[0] = tripleSetCombos[1];
            tripleset[1] = tripleSetCombos[2];
            tripleset[2] = tripleSetCombos[3];

            tripletsList.add(tripleset);
        }
        /*int[] i = new int[3];
        i[0] = 1;
        i[1] = 14;
        i[2] = 28;
        tripletsList.add(i); */
        for (int[] temp : tripletsList) {
            for(int i = 0; i < temp.length; i++)
                System.out.println(temp[i]);
        }

        ArrayList<int[]> quardsList = new ArrayList<int[]>();

        for (int i = 1; i <= 13; i++) {

            int[] quardsSet = new int[4];

            quardsSet[0] = 0 * 13 + i;
            quardsSet[1] = 1 * 13 + i;
            quardsSet[2] = 2 * 13 + i;
            quardsSet[3] = 3 * 13 + i;

            quardsList.add(quardsSet);
        }

        for (int[] temp : quardsList) {
            for (int i = 0; i < temp.length; i++)
                System.out.println(temp[i]);
        }

        ArrayList<int[]> tenalisList = new ArrayList<int[]>();

        for (int i = 1; i <= 52; i++) {

            int[] tenalisSet = new int[3];

            tenalisSet[0] = tenalisSet[1] = tenalisSet[2] = i;

            tenalisList.add(tenalisSet);
        }

        for (int[] temp : tenalisList) {
            for (int i = 0; i < temp.length; i++)
                System.out.println(temp[i]);
        }
        
        int[] cardsList = new int[13];
        cardsList[0] = cardsList[1] = cardsList[2] = cardsList[12] = 1;
        cardsList[3] = cardsList[4] = cardsList[5] = 2;
        cardsList[6] = cardsList[7] = cardsList[8] = 3;
        cardsList[9] = cardsList[10] = cardsList[11] = 4;
      //  cardsList[12] = 5;
        boolean isCountValid = isCardsCountValid(cardsList);
        System.out.print(isCountValid);

    }

    static boolean isCardsCountValid(int[] combination) {

        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 0; i < combination.length; i++) {
            if (count.containsKey((combination[i])))
            {
                int value = count.get(combination[i]);
                if (value == 3)
                    return false;
                count.put(combination[i], ++value);
            }
            else
                count.put(combination[i], 1);
        }
        return true;
    }

    static int compareWithHand(int[] combination, int[] cardsInHand) {

        int diff = 0;
        int combinationIndex = 0;
        int cardsInHandIndex = 0;

        Arrays.sort(cardsInHand);
        Arrays.sort(combination);

        while (combinationIndex < 13 || cardsInHandIndex < 13)
        {
            if (cardsInHand[cardsInHandIndex] < combination[combinationIndex]) {
                cardsInHandIndex++;
            }
            else
                if (cardsInHand[cardsInHandIndex] == combination[combinationIndex]) {
                    cardsInHandIndex++;
                    combinationIndex++;
                }
            else
                    if (combination[combinationIndex] < cardsInHand[cardsInHandIndex]) {
                        cardsInHandIndex++;
                        diff++;
                    }
        }
        return diff;
    }
}
