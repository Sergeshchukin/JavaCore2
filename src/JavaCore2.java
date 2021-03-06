/*
*
* @author Sergey Shchukin
* @version 19.01.2022
*
*/

import Exception.MyArrayDataException;
import Exception.MyArraySizeException;

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

        
        public static int array(String[][] stringMatrix) throws MyArrayDataException, MyArraySizeException {
        if (stringMatrix.length != 3 && stringMatrix[0].length != 3) {
            throw new MyArraySizeException("Error massive lenght");
        }

        int sum = 0;
          for (int i = 0; i < stringMatrix.length; i++) {
              for (int j = 0; j < stringMatrix.length; j++){
                  try {
                      sum += Integer.parseInt(stringMatrix[i][j]);
                  } catch (NumberFormatException m) {
                      throw new MyArrayDataException(" error " +(i+1) +" on column " +(j+1));
                  }
             }
          }
          return sum;
      }
    }

}
