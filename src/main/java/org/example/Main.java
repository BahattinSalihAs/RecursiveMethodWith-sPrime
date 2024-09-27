package org.example;

import java.util.Scanner;

public class Main {
    static int r(int x){
        if (x == 1){
            return 1;
        }
        return r(x-1) + x;
    }
    //recursive metod with isPrime
    static int isPrime(int n){
        for (int j=2; j<n; j++){
            if (n%j == 0){
                return 0;
            } else {
                return n;
            }
        }
        return isPrime(n);
    }
    public static void main(String[] args) {
        // asal sayı bulma programı...
        System.out.println(isPrime(10));


    }
}