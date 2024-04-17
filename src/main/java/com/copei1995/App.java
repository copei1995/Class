package com.copei1995;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    System.out.println("請輸入數字：");
    Scanner scan = new Scanner(System.in);

    double sum = 0;
    int m = 0;
    double product = 1;

    while (scan.hasNextDouble()) {
      double x = scan.nextDouble();
      m = m + 1;
      sum = sum + x;
      product = product * x;
    }

    System.out.println(m + "加總: " + sum);
    System.out.println(m + "平均: " + (sum / m));

    // 加分題 - 所有數字相乘, 請在這邊寫
    System.out.println(m + "總乘積: " + product);

    scan.close();
  }
}