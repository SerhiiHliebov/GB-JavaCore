package HomeWork5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AppData {

    public static void main(String args[]) throws IOException {
        String[] header = {"Val1", "Val2", "Val3"};
        int[][] data = {{500, 700, 300}, {700, 100, 100}, {800, 100, 200}, {111, 1111, 111}};
        Val list = new Val(header, data);
        writeFile(list);

        try {
            Val readeCsv = readFile();
            for (String v : readeCsv.getHeader()) {
                System.out.print(v + ";");
            }
            System.out.println();
            int[][] readeCsvData = readeCsv.getData();
            for (int i = 0; i < readeCsvData.length; i++) {
                for (int j = 0; j < readeCsvData[i].length; j++) {
                    System.out.print(readeCsvData[i][j] + ";");
                }
                System.out.print("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(Val list) {
        try (PrintWriter out = new PrintWriter("w_values.csv")) {
            for (String v : list.getHeader()) {
                out.print(v + ";");
            }
            out.println();

            int[][] listData = list.getData();
            for (int i = 0; i < listData.length; i++) {
                for (int j = 0; j < listData[i].length; j++) {
                    out.print(listData[i][j] + ";");
                }
                out.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Val readFile() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("values.csv"));
        List<int[]> dataArr = new ArrayList<>();
        String[] dataHeader = in.readLine().split(";");
        String readLine = null;
        while ((readLine = in.readLine()) != null) {
            List<Integer> lineArr = new ArrayList<>();
            String[] tokens = readLine.split(";");
            for (int i = 0; i < tokens.length; i++) {
                lineArr.add(Integer.parseInt(tokens[i]));
            }
            dataArr.add(lineArr.stream().mapToInt(i -> i).toArray());
        }
        Val list2 = new Val(dataHeader, dataArr.toArray(new int[0][]));
        int[][] tt = list2.getData();
        return list2;
    }
}
