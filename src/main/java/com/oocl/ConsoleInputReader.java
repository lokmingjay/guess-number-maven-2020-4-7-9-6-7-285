package com.oocl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ConsoleInputReader implements inputReader {


    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
