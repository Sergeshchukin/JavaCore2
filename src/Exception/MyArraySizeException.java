package Exception;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String arraySize){
        super (arraySize);
    }
}
