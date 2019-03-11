package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

       return str.substring(0,indexToCapitalize)+ str.substring(indexToCapitalize,indexToCapitalize +1).toUpperCase() + str.substring(indexToCapitalize +1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        String base = baseString.toLowerCase();
        Character character = base.charAt(indexOfString);
        character = Character.toLowerCase(character);
        if(character.equals(characterToCheckFor)){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        String sub = "";
        for(int i  = 0 ; i < string.length();i++){
            for(int j = i +1 ; j <= string.length();j++){
                sub = string.substring(i,j);
            }
        }
        String[] subray = sub.split("");

        return subray;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
