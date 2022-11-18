import java.io.BufferedReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = readInput();
        List<Integer> fuel = calculateFuel(input);
        List<Integer> recursiveFuel = calculateRecursiveFuel(input);
        Integer sum = 0;
        Integer recursiveSum = 0;
        Integer finalSum = 0;
        for (int i = 0; i < fuel.size(); i++) {
            sum = sum + fuel.get(i);
        }
        for (int i = 0; i < recursiveFuel.size(); i++) {
            recursiveSum = recursiveSum + recursiveFuel.get(i);
            System.out.println(recursiveSum);
        }
        finalSum = sum +recursiveSum;
        System.out.println("sum = " + sum);
        System.out.println("recursive sum = " + recursiveSum);
        System.out.println("final sum = " + finalSum);
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

    private static List<Integer> calculateRecursiveFuel(List<Integer> input){
        List<Integer> restOfFuel = new ArrayList<>();
        for (int i= 0; i< input.size(); i++){
            Integer fuel = input.get(i)/3-2;
            restOfFuel.add(fuel);
            while ((fuel/3-2)>0){
                fuel = fuel/3-2;
                restOfFuel.add(fuel);
            }
        }
        return restOfFuel;
    }

}
