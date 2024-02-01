package org.Jose;

import java.util.List;

public class minimumnumber {

    public static int minimumNumber(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        if (esPrimo(sum)) {
            return 0;
        } else {
            int nextPrime = SigPrimo(sum);
            return nextPrime - sum;
        }
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int SigPrimo(int num) {
        num++;
        while (!esPrimo(num)) {
            num++;
        }
        return num;
    }
}