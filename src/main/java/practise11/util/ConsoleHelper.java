package practise11.util;

import java.util.Scanner;

public class ConsoleHelper {

    public static String readString() {
        return new Scanner(System.in).nextLine();
    }

    public static int readInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void printString(String line) {
        System.out.println(line);
    }
}
