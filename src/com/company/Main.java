package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cost 1, 2 and 3");
        float c1 = scanner.nextFloat();
        float c2 = scanner.nextFloat();
        float c3 = scanner.nextFloat();
        System.out.println("Enter time 1, 2 and 3");
        float t1 = scanner.nextFloat();
        float t2 = scanner.nextFloat();
        float t3 = scanner.nextFloat();
        float v1, v2, v3, vall;
        v1=c1*t1;
        v2=c2*t2;
        v3=c3*t3;
        vall=v1+v2+v3;
        System.out.println("call 1: " + v1 + ", call 2: " + v2 +  ", call 3: " + v3 + ", all: " + vall);
    }
}
