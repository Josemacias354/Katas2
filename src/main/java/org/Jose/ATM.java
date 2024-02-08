package org.Jose;

public class ATM {
    public int solve(int n) {
        if (n % 10 != 0) {
            return -1;
        }

        int[] Billetes = {500, 200, 100, 50, 20, 10};
        int contador = 0;

        for (int i : Billetes) {
            while (n >= i) {
                n -= i;
                contador += 1;
            }
        }
        return contador;
    }
}