package com.comment.demo.utils;

import java.util.Scanner;

public class SystemUtils {

    private static String readInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);

        return input.nextLine().trim();
    }

}
