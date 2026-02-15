import java.util.Scanner;

public class Hashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String input = sc.nextLine();
        FrequencyCounter counter = new FrequencyCounter();
        MapPrinter<Character,Integer> printer = new MapPrinter<>();
        printer.PrintTheMap(counter.CountApperence(input));
        sc.close();
    }
}
