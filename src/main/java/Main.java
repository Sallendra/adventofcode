import java.io.BufferedReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = readInput();
        List<Integer> fuel = calculateFuel(input);
        Integer sum = 0;
        for (int i = 0; i < fuel.size(); i++) {
            sum = sum + fuel.get(i);
        }
        System.out.println(sum);
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

    private static List<Integer> calculateFuel(List<Integer> input){
        List<Integer> result = new ArrayList<>();
        for (int i=0; i < input.size(); i++){
            Integer fuel = ((input.get(i)/3) - 2);
            result.add(fuel);
        }
        return result;
    }
}
