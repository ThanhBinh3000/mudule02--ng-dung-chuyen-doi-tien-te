package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double vnd = 23000;
    double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập số tiền");
        usd = sc.nextDouble();
        double quydoi = vnd* usd;
        System.out.println("gái trị quy đổi: "+quydoi);
    }
}
