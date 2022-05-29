class Array {

    public static void print(int[] feld) {
        System.out.print("{");

        for (int i = 0; i < feld.length; i++) {

            System.out.print(feld[i]);

            if (i == feld.length - 1) {
                System.out.print("");
            } else {
                System.out.print(", ");

            }

        }
        System.out.print("}");

    }

    public static void minUndMax(int[] feld) {

        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i < feld.length; i++) {
            // für Max
            if (max < feld[i]) {
                max = feld[i];

            }
            // für klein
            if (min > feld[i]) {
                min = feld[i];

            }

        }
        System.out.println("Miniumum =" + min + " Maximum=" + max);

    }

    public static int[] invertieren(int[] feld) {

        int[] feldinvertiert = new int[feld.length];

        int j = feld.length - 1;
        for (int i = 0; i < feld.length; i++) {
            feldinvertiert[j] = feld[i];
            j--;

        }

        return feldinvertiert;
    }

    public static int[] schneiden(int[] feld, int laenge) {
        int[] zweitesArray = new int[laenge];
        int g = 0;
        if (feld.length - laenge < 0) {
            g = (feld.length - laenge) * -1;
        }

        for (int i = 0; i <= g; i++) {
            zweitesArray[i] = feld[i];
            System.out.println("hello");

        }
        if (feld.length < laenge) {

            for (int i = feld.length; i < laenge; i++) {
                zweitesArray[i] = 9;

            }

        }

        return zweitesArray;
    }

    public static int[] linearisieren(int[][] feld) {

        //int [][] gd = {{1, 3}, {25}, {7, 4, 6, 9}};
        int zählervariable = 0;
        for (int i = 0; i < feld.length; i++) {
            zählervariable = zählervariable + feld[i].length;

        }
        int[] neuesarray = new int[zählervariable];
        int zaehler = 0;
        for (int i = 0; i < feld.length; i++) {

            for (int j = 0; j < feld[i].length; j++) {

                neuesarray[zaehler] = feld[i][j];
                zaehler++;
            }

        }

        return neuesarray;

    }

    public static int[][] print2D(int[][] feld) {
        int[][] neuesArray = null;
        System.out.print("{");

        for (int i = 0; i < feld.length; i++) {

            for (int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j]);
                if (i == feld.length -1 && j==feld[i].length -1) {
                    System.out.print("");
                } else {
                    System.out.print(", ");
                }

            }

        }
        System.out.print("}");

        return neuesArray;
    }
}
