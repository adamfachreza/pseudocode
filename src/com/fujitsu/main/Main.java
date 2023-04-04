package com.fujitsu.main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Kata");
    String kata = input.nextLine();
    System.out.println(cekPalindrom(kata));
  }

  public static boolean cekPalindrom(String cek) {
    String kata = cek.toLowerCase().toString();
    for (int i = 0; i < kata.length() / 2; i++) {
      if (kata.charAt(i) != kata.charAt(kata.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
