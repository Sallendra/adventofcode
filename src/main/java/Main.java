import java.io.BufferedReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = readInput();
        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }

        System.out.println("done");
    }

    private static List<Integer> readInput() {
        InputStream input = Main.class.getResourceAsStream("/Input");
        Scanner scanner = new Scanner(input).useDelimiter("\n");

        List<Integer> result = new ArrayList<>();
        while (scanner.hasNext()) {
            result.add(Integer.parseInt(scanner.next()));
        }

        return result;
    }
}
