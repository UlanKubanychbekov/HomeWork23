package peaksoft;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /**
         * ArrayList тузунуз
         *     1ден 100го чейинки 50 сан менен толтурунуз
         *         Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
         *         Аларды консольго чыгарыныз
         *         */

        ArrayList<Integer> jupNum = new ArrayList<>();
        ArrayList<Integer> takNum = new ArrayList<>();
        Random random = new Random();
        int counter = 0;
        for (int i = 0; i < 50; i++) {
             counter = random.nextInt(100);
            if (counter % 2 == 0) {
                jupNum.add(counter);
            }
            if (counter % 2 != 0) {
                takNum.add(counter);
            }
            System.out.print(  counter+", ");
        }
        System.out.println();
        System.out.println("jupNum: " + jupNum);
        System.out.println("takNum1: " + takNum);
    }
}

/**
 * takNum1.addAll(jupNum);
 * takNum1.removeIf(t -> t % 2 == 0);
 * System.out.println("tak number: " + takNum1);
 * jupNum.removeIf(j -> j % 2 != 0);
 * System.out.println("jup number: " + jupNum);
 */