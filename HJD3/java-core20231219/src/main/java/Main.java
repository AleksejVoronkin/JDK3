import Tools.*;

import Tools.Animals.*;

public class Main {
    public static void main(String[] args) {

        //1 задание:

        System.out.println("Сумма: " + Calculator.sum(10, 20.5));
        System.out.println("Разность: " + Calculator.subtract(15.5, 5));
        System.out.println("Произведение: " + Calculator.multiply(5, 4.5));
        System.out.println("Частное: " + Calculator.divide(10, 2.5));
        
        //2 задание: *сделал как говорили в конце семенара, о том что сравнить на примере животных*

        Animal[] animals1 = {new Cat("Boris"), new Dog("Ahat"), new Hamster("Ham")};
        //Animal[] animals2 = {new Cat("Boris"), new Dog("Ahat"), new Hamster("Ham")};
        Animal[] animals2 = {new Cat("jack"), new Dog("Bobik"), new Hamster("Taran")};

        Animal[] animals3 = {new Cat("Tom"), new Hamster("Pige"), new Dog("Rex")};
        Animal[] animals4 = {new Cat("jack"), new Dog("Bobik"), new Hamster("Taran")};

        System.out.println("Массивы 1 и 2 одинаковые: " + ArrayUtils.compareArrays(animals1, animals2));
        System.out.println("Массивы 3 и 4 одинаковые: " + ArrayUtils.compareArrays(animals3, animals4));
    
        //3 задание:

        Pair<Integer, String> pair = new Pair<>(1, "один");
        System.out.println("Пара: " + pair);
    }
}
