package Tools;

import Tools.Animals.Animal;

public class ArrayUtils {

    public static <T extends Animal> boolean compareArrays(T[] arrayOne, T[] arrayTwo) {
        if (arrayOne.length != arrayTwo.length) {
            return false;
        }

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i].getClass() != arrayTwo[i].getClass()) {
                return false;
            }
        }
        return true;
    }
}