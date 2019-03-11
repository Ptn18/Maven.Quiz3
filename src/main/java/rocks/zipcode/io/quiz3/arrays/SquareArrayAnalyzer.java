package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {

        for(int i = 0; i < input.length;i++){
            for(int j = 0; j < squaredValues.length; j++)
            if(squaredValues[j] == (input[i] * input[i])){
                return true;
            }
        }

        return false;
    }
}
