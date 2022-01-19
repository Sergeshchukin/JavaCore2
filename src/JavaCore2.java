/*
*
* @author Sergey Shchukin
* @version 19.01.2022
*
*/

import Exeptions.MyArrayDataException;
import Exeptions.MyArraySizeException;

import java.util.Arrays;




public class JavaCore2 {
    public static void main(String[] args) {
        String[][] stringArray = {    {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"}
        };
        try {
            int result = array(stringArray);
            System.out.println(" Total Result = " + result);
        } catch (MyArraySizeException | MyArrayDataException m) {
            System.out.println(m.getMessage());
        }


    }
}
