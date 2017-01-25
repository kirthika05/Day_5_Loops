package com.person;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        multiplicationTablesOf(n);
    }

    public static void multiplicationTablesOf(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
