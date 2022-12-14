package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = readInput();
        input.set(1, 12);
        input.set(2, 2);
        List<Integer> output = compute(input);
        System.out.println(output.get(0));
        //tests();
    }

    private static void tests() {
        List<Integer> input = readInput();
        List<Integer> output = compute(input);
        List<Integer> expected = Arrays.asList(30, 1, 1, 4, 2, 5, 6, 0, 99);

        if (!output.equals(expected)) {
            System.out.println("FAIL, wanted [" + output + "] to equal [" + expected + "]");
        } else {
            System.out.println("Tests passed :)");
        }
    }

    private static List<Integer> compute(List<Integer> input) {
        for (int i = 0; i < input.size(); i = i + 4) {
            int first;
            int second;
            int address;

            switch (input.get(i)) {
                case 1:  // addition
                    first = input.get(input.get(i + 1));
                    second = input.get(input.get(i + 2));
                    address = input.get(i + 3);
                    input.set(address, first + second);

                    break;
                case 2:  // multiplication
                    first = input.get(input.get(i + 1));
                    second = input.get(input.get(i + 2));
                    address = input.get(i + 3);
                    input.set(address, first * second);

                    break;
                case 99: // halt
                    break;
            }
        }

        return input;
    }

    public static List<Integer> readInput() {
//        return Arrays.asList(1, 1, 1, 4, 99, 5, 6, 0, 99);
//        return Arrays.asList(2, 0, 0, 3, 99);
        return Arrays.asList(1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,13,1,19,1,6,19,23,2,23,6,27,1,5,27,31,1,10,31,35,2,6,35,39,1,39,13,43,1,43,9,47,2,47,10,51,1,5,51,55,1,55,10,59,2,59,6,63,2,6,63,67,1,5,67,71,2,9,71,75,1,75,6,79,1,6,79,83,2,83,9,87,2,87,13,91,1,10,91,95,1,95,13,99,2,13,99,103,1,103,10,107,2,107,10,111,1,111,9,115,1,115,2,119,1,9,119,0,99,2,0,14,0);
    }
}
