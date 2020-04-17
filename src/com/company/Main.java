package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()){
            i++;
            System.out.println(i + " " + scanner.nextLine());
        }
        scanner.close();
    }
}
