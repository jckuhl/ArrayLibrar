import java.util.Arrays;

public class ArrayLibrary {

    public static <T> T[] push(T[] array, T value) {
        T[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[newArray.length - 1] = value;
		return newArray;
    }

    public static <T> T[] pop(T[] array) {
        return Arrays.copyOf(array, array.length - 1);
    }

    public static <T> T[] slice(T[] array, int start) {
        return slice(array, start, array.length);
    }

    public static <T> T[] slice(T[] array, int start, int stop) {
        T[] newArray = Arrays.copyOf(array, stop - start);
        for(int i = start, index = 0; i < stop; i++, index++) {
            newArray[index] = array[i];
        }
        return newArray;
    }

    public static <T> T[] concat(T[] array1, T[] array2) {
        int arrayLength = array1.length + array2.length;
        T[] newArray = Arrays.copyOf(array1, arrayLength);
        for(int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for(int i = array1.length, j = 0; j < array2.length; i++, j++) {
            newArray[i] = array2[j];
        }
        return newArray;
    }

    public static <T> T[] removeOnce(T[] array, T value) {
        int index = indexOf(array, value);
        if(index != -1) {
            T[] newArray1 = Arrays.copyOf(array, array.length);
            newArray1 = slice(newArray1, 0, index);
            T[] newArray2 = Arrays.copyOf(array, array.length);
            newArray2 = slice(newArray2, index+1);
            return concat(newArray1, newArray2);
        } else {
            return array;
        }
    }
    
    public static <T> boolean includes(T [] array, T value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static <T> int indexOf(T[] array, T value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}