package com.techja.smartfinder.number;

public class SmartFinder {
    private int soN;

    public SmartFinder(int soN) {
        this.soN = soN;
    }

    public void findLargeArea() {
        // in ra cac cap a va b sao cho a + b < 50
        int a = 1;

        while (a <= soN) {
            for (int b = a + 1; b < soN; b++) {
                if (a + b < 50) {
                    System.out.println("(" + a + "," + b + ") ");
                }
            }

            a++;
        }
    }
}
