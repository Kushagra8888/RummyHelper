/**
 * Created by test on 7/31/2015.
 */
class RummyHelperTest extends GroovyTestCase {
    void setUp() {

        super.setUp()
        //RummyHelper helper = new RummyHelper()


    }

    void tearDown() {
    }

    void testIsNaturalSeqPresent() {
        def naturalSequences = [[1,2,3], [2,4,3], [3,3,3], [10,11,12], [7,6,5]]
        def notNaturalSequences = [[1,3,4], [9,8,9], [1,1,7], [1,2,53], [1,14,27]]
        assert naturalSequences.every { RummyHelper.isNaturalSeqPresent(it as int[]) }
        assert notNaturalSequences.every { !RummyHelper.isNaturalSeqPresent(it as int[]) }
        //naturalSequences.each { assertTrue(RummyHelper.isNaturalSeqPresent(it as int[]))}
        //notNaturalSequences.each { assertFalse(RummyHelper.isNaturalSeqPresent(it as int[]))}
    }

    void testGenerateTriplets() {

    }

    void testCompareWithHand(){
        def a543combo = [1, 14, 27, 40, 2, 3, 4, 5, 6, 15, 16, 17, 18] as int[]
        assert RummyHelper.compareWithHand(a543combo, a543combo) == 0
        def oneRep = [1, 14, 27, 40, 2, 3, 4, 5, 6, 15, 16, 17, 19] as int[]
        assert RummyHelper.compareWithHand(a543combo, oneRep) == 1
        def oneTo13 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13] as int[]
        def oneTo13withOneRep = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14] as int[]
        def oneTo13withTwoRep = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 14, 15] as int[]
        def oneTo13withThreeRep = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 15, 16] as int[]
        assert RummyHelper.compareWithHand(oneTo13, oneTo13withOneRep) == 1
        assert RummyHelper.compareWithHand(oneTo13, oneTo13withTwoRep) == 2
        assert RummyHelper.compareWithHand(oneTo13, oneTo13withThreeRep) == 3
    }

    void testIsTenaliPresent() {
        def tenali1 = [1,1,1,4,5,6,7,8,9,10,11,12,13] as int[]
        assert (RummyHelper.isTenaliPresent(tenali1)) == true
    }

    void testGenerateQuards() {

    }

    void testGenerateTenalis() {

    }

    void testIsCardsCountValid() {

    }

    void testGenerateSequencesOfLength3() {

    }

    void testGenerateSequencesOfLength4() {

    }

    void testGenerateSequencesOfLength5() {

    }

    void testMergeCombinations() {

    }

    void testMergeCombinations1() {

    }

    void testGenerateValidCombinations() {

    }
}
