import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by test on 7/30/2015.
 */
public class RummyHelper {

        public static boolean isSeqPresent (int[] cards) {
            Arrays.sort(cards);
            for (int i = 0; i < cards.length -1; i++) {
                if (cards[i+1] < cards[i]) {
                    return false;
                }
            }
            return true;
        }

        public static ArrayList<int[]> generateSequencesOfLength3() {
            ArrayList<int[]> seqLen3List = new ArrayList<int[]>();
            for (int i = 2; i <= 41; i+=13) {
                for (int j=i; j <= i + 9; j++) {
                    seqLen3List.add(new int[] {j, j+1, j+2});
                }
            }
            for (int i=1; i <= 43; i+=13) {
                seqLen3List.add(new int[] {i, i+12, i+11});
            }
            return seqLen3List;
        }

        public static ArrayList<int[]> generateSequencesOfLength4() {
            ArrayList<int[]> seqLen4List = new ArrayList<int[]>();
            for (int i = 2; i <= 41; i+=13) {
                for (int j=i; j <= i + 8; j++) {
                    seqLen4List.add(new int[] {j, j+1, j+2, j+3});
                }
            }
            for (int i=1; i <= 43; i+=13) {
                seqLen4List.add(new int[] {i, i+12, i+11, i+10});
            }
            return seqLen4List;
        }

        public static ArrayList<int[]> generateSequencesOfLength5() {
            ArrayList<int[]> seqLen5List = new ArrayList<int[]>();
            for (int i = 2; i <= 41; i+=13) {
                for (int j=i; j <= i + 7; j++) {
                    seqLen5List.add(new int[] {j, j+1, j+2, j+3, j+4});
                }
            }
            for (int i=1; i <= 43; i+=13) {
                seqLen5List.add(new int[] {i, i+12, i+11, i+10, i+9});
            }
            return seqLen5List;
        }

    public ArrayList<Integer[]> generateTriplets() {

        ArrayList<Integer[]> tripletsList = new ArrayList<Integer[]>();

        for (int i = 1; i <= 13; i++) {

        }
        Integer[] i = new Integer[3];
        i[0] = 1;
        i[1] = 14;
        i[2] = 28;
        tripletsList.add(i);
        return tripletsList;
    }
}
