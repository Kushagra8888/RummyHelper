
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by test on 7/30/2015.
 */
public class RummyHelper {
    ArrayList<int[]> allVaidComnbinations = new ArrayList<>();

        public static boolean isNaturalSeqPresent (int[] cards) {
            Arrays.sort(cards);
            for (int i = 0; i < cards.length -1; i++) {
                if (cards[i+1] == 53) {
                    return false;
                }
                if (cards[i+1] < cards[i]) {
                    return false;
                }
            }
            return true;
        }

        public static ArrayList<int[]> generateTriplets() {

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
            return tripletsList;
        }

        public static ArrayList<int[]> generateQuards(){

            ArrayList<int[]> quardsList = new ArrayList<int[]>();

            for (int i = 1; i <= 13; i++) {

                int[] quardsSet = new int[4];

                quardsSet[0] = 0 * 13 + i;
                quardsSet[1] = 1 * 13 + i;
                quardsSet[2] = 2 * 13 + i;
                quardsSet[3] = 3 * 13 + i;

                quardsList.add(quardsSet);
            }

            return quardsList;
        }

        public static ArrayList<int[]> generateTenalis() {

            ArrayList<int[]> tenalisList = new ArrayList<int[]>();

            for (int i = 1; i <= 52; i++) {

                int[] tenalisSet = new int[3];

                tenalisSet[0] = tenalisSet[1] = tenalisSet[2] = i;

                tenalisList.add(tenalisSet);
            }
            return tenalisList;
        }

        public boolean isCardsCountValid(int[] combination) {

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

    public int[] mergeCombinations(int[] combination1, int[] combination2, int[] combination3){
        int[] aThirteenCombination = new int[13];
        int thirteenIdx = 0;
        for (int idx = 0; idx < combination1.length; idx++){
            aThirteenCombination[thirteenIdx] = combination1[idx];
            thirteenIdx += 1;
        }
        for (int idx = 0; idx < combination2.length; idx++){
            aThirteenCombination[thirteenIdx] = combination2[idx];
            thirteenIdx += 1;
        }
        for (int idx = 0; idx < combination3.length; idx++){
            aThirteenCombination[thirteenIdx] = combination3[idx];
            thirteenIdx += 1;
        }
        return aThirteenCombination;
    }

    public int[] mergeCombinations(int[] combination1, int[] combination2, int[] combination3, int[] combination4){
        int[] aThirteenCombination = new int[13];
        int thirteenIdx = 0;
        for (int idx = 0; idx < combination1.length; idx++){
            aThirteenCombination[thirteenIdx] = combination1[idx];
            thirteenIdx += 1;
        }
        for (int idx = 0; idx < combination2.length; idx++){
            aThirteenCombination[thirteenIdx] = combination2[idx];
            thirteenIdx += 1;
        }
        for (int idx = 0; idx < combination3.length; idx++){
            aThirteenCombination[thirteenIdx] = combination3[idx];
            thirteenIdx += 1;
        }
        for (int idx = 0; idx < combination4.length; idx++){
            aThirteenCombination[thirteenIdx] = combination4[idx];
            thirteenIdx += 1;
        }
        return aThirteenCombination;
    }

    public ArrayList<int[]> generateValidCombinations(){
        ArrayList<int[]> allValidCombinations = new ArrayList<>();
        ArrayList<int[]> triplets = generateTriplets();
        ArrayList<int[]> quards = generateQuards();
        ArrayList<int[]> tenalis = generateTenalis();
        ArrayList<int[]> sequencesOfLengthThree = generateSequencesOfLength3();
        ArrayList<int[]> sequencesOfLengthFour = generateSequencesOfLength4();
        ArrayList<int[]> sequencesOfLengthFive = generateSequencesOfLength5();
        ArrayList<int[]> groupsOfThree = new ArrayList<>();
        ArrayList<int[]> groupsOfFour = new ArrayList<>();
        ArrayList<int[]> groupsOfFive = new ArrayList<>();
        groupsOfThree.addAll(triplets);
        groupsOfThree.addAll(sequencesOfLengthThree);
        groupsOfThree.addAll(tenalis);
        groupsOfFour.addAll(quards);
        groupsOfFour.addAll(sequencesOfLengthFour);
        groupsOfFive = sequencesOfLengthFive;

        //Combinations of type {5,5,3}
        for (int fiveGroupIdx1 = 0; fiveGroupIdx1 < groupsOfFive.size(); fiveGroupIdx1++) {
            for(int fiveGroupIdx2 = fiveGroupIdx1 + 1; fiveGroupIdx2 < groupsOfFive.size(); fiveGroupIdx2++){
                for (int threeGroupIdx = 0; threeGroupIdx < groupsOfThree.size(); threeGroupIdx++){
                    int sequnces = 0;
                    if (isNaturalSeqPresent(groupsOfFive.get(fiveGroupIdx1))) sequnces += 1;
                    if (isNaturalSeqPresent(groupsOfFive.get(fiveGroupIdx2))) sequnces += 1;
                    if (isNaturalSeqPresent(groupsOfThree.get(threeGroupIdx))) sequnces += 1;
                    if (sequnces >1){
                        int[] aThirteenGroup = mergeCombinations(groupsOfFive.get(fiveGroupIdx1), groupsOfFive.get(fiveGroupIdx2), groupsOfThree.get(threeGroupIdx));
                        if (isCardsCountValid(aThirteenGroup)){
                            allValidCombinations.add(aThirteenGroup);
                        }
                    }
                }
            }
        }

        //Combinations of type {5,4,3}
        for (int fiveGroupIdx = 0; fiveGroupIdx < groupsOfFive.size(); fiveGroupIdx++) {
            for(int fourGroupIdx = 0; fourGroupIdx < groupsOfFour.size(); fourGroupIdx++){
                for (int threeGroupIdx = 0; threeGroupIdx < groupsOfThree.size(); threeGroupIdx++){
                    int sequnces = 0;
                    if (isNaturalSeqPresent(groupsOfFive.get(fiveGroupIdx))) sequnces += 1;
                    if (isNaturalSeqPresent(groupsOfFour.get(fourGroupIdx))) sequnces += 1;
                    if (isNaturalSeqPresent(groupsOfThree.get(threeGroupIdx))) sequnces += 1;
                    if (sequnces >1){
                        int[] aThirteenGroup = mergeCombinations(groupsOfFive.get(fiveGroupIdx), groupsOfFour.get(fourGroupIdx), groupsOfThree.get(threeGroupIdx));
                        if (isCardsCountValid(aThirteenGroup)){
                            allValidCombinations.add(aThirteenGroup);
                        }
                    }
                }
            }
        }

        //Combinations of type {4,3,3,3}
        for (int threeGroupIdx1 = 0; threeGroupIdx1 < groupsOfThree.size(); threeGroupIdx1++) {
            for(int threeGroupIdx2 = threeGroupIdx1 + 1; threeGroupIdx2 < groupsOfThree.size(); threeGroupIdx2++){
                for (int threeGroupIdx3 = threeGroupIdx2 + 1; threeGroupIdx3 < groupsOfThree.size(); threeGroupIdx3++){
                    for(int fourGroupIdx = 0; fourGroupIdx < groupsOfFour.size(); fourGroupIdx++){
                        int sequnces = 0;
                        if (isNaturalSequence(groupsOfThree.get(threeGroupIdx1))) sequnces += 1;
                        if (isNaturalSequence(groupsOfThree.get(threeGroupIdx2))) sequnces += 1;
                        if (isNaturalSequence(groupsOfThree.get(threeGroupIdx3))) sequnces += 1;
                        if (isNaturalSequence(groupsOfFour.get(fourGroupIdx))) sequnces += 1;
                        if (sequnces >1){
                            int[] aThirteenGroup = mergeCombinations(groupsOfThree.get(threeGroupIdx1), groupsOfThree.get(threeGroupIdx2), groupsOfThree.get(threeGroupIdx3), groupsOfFour.get(fourGroupIdx));
                            if (isCardsCountValid(aThirteenGroup)){
                                allValidCombinations.add(aThirteenGroup);
                            }
                        }
                    }
                }
            }
        }
        return allValidCombinations;
    }

}
