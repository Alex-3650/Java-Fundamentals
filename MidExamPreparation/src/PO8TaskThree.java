import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PO8TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thing = 0;
        int thing1 = 0;
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String text = command.split(" ")[0];
            switch (text) {
                case "Shoot" -> {
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int power = Integer.parseInt(command.split(" ")[2]);
                    if (numbers.size() - 1 >= index && index >= 0) {
                        int n = numbers.get(index);
                        n -= power;
                        if (n <= 0) {
                            numbers.remove(index);
                        } else {
                            numbers.set(index, n);
                        }
                    }
                }
                case "Add" -> {
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int value = Integer.parseInt(command.split(" ")[2]);
                    if (numbers.size() - 1 >= index && index >= 0) {
                        numbers.add(index, value);
                    } else {

                        System.out.println("Invalid placement!");
                    }
                }
                case "Strike" -> {
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int radius = Integer.parseInt(command.split(" ")[2]);
                    if (index - radius >= 0 && index + radius <= numbers.size() - 1) {
                        numbers.subList(index - radius, index + radius + 1).clear();
                    } else {

                        System.out.println("Strike missed!");
                    }
                }

            }
            command = scanner.nextLine();
        }

        System.out.println(numbers.toString().
                replace("[","").
                replace("]","").
                replaceAll(", ","|"));

    }
}
