// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] array1 = new int [3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double [] array2 = {1.57, 7.654, 9.986};

        int[] array3 = new int [4];
        array3[0] = 10;
        array3[1] = 20;
        array3[2] = 30;
        array3[3] = 40;

        //Задача 2
        for (int i = 0; i < 3; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < 3; j++) {
            System.out.print(array2[j] + " ");
        }
        System.out.println();

        for (int k = 0; k < 4; k++) {
            System.out.print(array3[k] + " ");
        }
        System.out.println();

        //Задача 3
        for (int i = 2; i >= 0; i--) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int j = 2; j >= 0; j--) {
            System.out.print(array2[j] + " ");
        }
        System.out.println();

        for (int k = 3; k >= 0; k--) {
            System.out.print(array3[k] + " ");
        }
        System.out.println();

        //Задача 4
        for (int i = 0; i < array1.length; i++) {
            if ((array1[i] % 2) > 0) {
                array1[i] = array1[i] + 1;
            }
            System.out.print(array1[i] + " ");
        }
    }
}