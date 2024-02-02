package org.Jose;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        return "";
    }
}

    public class GoodVsEvil {
        public static String battle(String goodAmounts, String evilAmounts) {
            int[] good = {1, 2, 3, 3, 4, 10};
            int[] evil = {1, 2, 2, 2, 3, 5, 10};
            int goodTotal = 0;
            int evilTotal = 0;
            String[] goodAmountsArray = goodAmounts.split(" ");
            String[] evilAmountsArray = evilAmounts.split(" ");
            for (int i = 0; i < goodAmountsArray.length; i++) {
                goodTotal += Integer.parseInt(goodAmountsArray[i]) * good[i];
            }
            for (int i = 0; i < evilAmountsArray.length; i++) {
                evilTotal += Integer.