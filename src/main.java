import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//№1
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] apple = {1.57, 7.654, 9.986};
        long[] fly = {64, 746, 64737};
//№2
        int[] arrayInt = {1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        boolean[] arrayBoolean = {true, false, true};
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]);
            if (i < arrayInt.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i]);
            if (i < arrayDouble.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayBoolean.length; i++) {
            System.out.print(arrayBoolean[i]);
            if (i < arrayBoolean.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
//№3
        int[] ints = {1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, false, true};
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = booleans.length - 1; i >= 0; i--) {
            System.out.print(booleans[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
//№4
        int[] shelves = {1, 2, 3};
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] % 2 != 0) {
                shelves[i] += 1;
                System.out.println(Arrays.toString(shelves));
            }
        }
    }
}

