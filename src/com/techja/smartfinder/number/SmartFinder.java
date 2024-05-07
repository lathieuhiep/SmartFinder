package com.techja.smartfinder.number;

public class SmartFinder {
    private int soN;

    public SmartFinder(int soN) {
        this.soN = soN;
    }

    // Tim UCLN
    private int timUCLN(int a, int b) {
        if (a < b) {
            int temp = a;

            a = b;
            b = temp;
        }

        while (b != 0 ) {
            int temp = b;

            b = a % b;
            a = temp;
        }

        return a;
    }

    // tim UC 2 so
    private String timUC(int a, int b) {
        int UCLN = timUCLN(a, b);
        String dsUC = "";

        for (int i = 0; i <= Math.sqrt(UCLN) ; i++) {
            if (UCLN % i == 0) {}
        }
        
        return dsUC;
    }


    public void findLargeArea() {
        // in ra cac cap a va b sao cho a + b < 50
        int a = 1;

        while (a <= soN) {
            for (int b = a + 1; b < soN; b++) {
                String UC = timUC(a, b);

                if (a + b < 50) {
                    System.out.println("(" + a + "," + b + ") ");
                }
            }

            a++;
        }
    }
}
