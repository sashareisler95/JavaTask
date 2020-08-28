package com.company;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    private static double getPositiveAverage(Integer[] values){
        double result = 0.0;
        int positiveCount = 0;
        int positiveSum = 0;
        for (Integer val : values){
            if (val > 0){
                positiveCount++;
                positiveSum += val;
            }
        }
        if(positiveCount != 0) {
            result = ((double) positiveSum) / positiveCount;
        }
        return result;
    }

    private static double getPositiveAverage(Collection<Integer> values){
        Integer[] mass = values.toArray(new Integer[]{});
        return getPositiveAverage(mass);
    }

    public static void main(String[] args) {
        Integer[] first = new Integer[]{3,-2,1,-9,4,23,12,4321};
        Collection<Integer> second = Arrays.asList(3,-2,1,-9,4,23,12,4321);
        System.out.println(getPositiveAverage(first));
        System.out.println(getPositiveAverage(second));

        Human[] workers = new Human[] {
                new Human(),
                new Human("Ivan",23),
                new Human()
        };

        workers[2].setHuman("Maria",34);
        for (Human worker : workers){
            worker.getInfo();
            worker.getCount();
        }
    }
}

