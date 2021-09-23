package HomeWork2;

public class Main {

    public static final int X_MAX = 4;
    public static final int Y_MAX = 4;

    public static void main(String[] args) {
        String[][] strArray = new String[4][4];
        fillArray(strArray);
        strArray[1][3] = "FFF";
        printArray(strArray);
        workArray(strArray);
    }

    private static void workArray(String[][] array) {
        int x = array[0].length, y = array.length;
        if (x > X_MAX || y > Y_MAX) {
            try {
                throw new MyArraySizeException("Размер должен быть 4x4", x, y);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }


        int sum = 0;
        for (int i = 0; i < Y_MAX; i++) {
            for (int j = 0; j < X_MAX; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка формата переменной в ячейке - " + i + "," + j);
                }
            }
        }
        System.out.println("Сумма значений массива (исключая ошибки) = " + sum);
    }

    private static void fillArray(String[][] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                k++;
                array[i][j] = Integer.toString(k);
            }
        }
    }

    private static void printArray(String[][] array) {
        for (String[] strings : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }
}
