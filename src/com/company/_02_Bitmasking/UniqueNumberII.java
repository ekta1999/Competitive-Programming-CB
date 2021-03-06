package com.company._02_Bitmasking;

import java.util.Scanner;

public class UniqueNumberII {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        get2NonRepeatingNos(arr);
    }

    public static void get2NonRepeatingNos(int[] arr) {
        int Xor = arr[0];
        int res, i, x = 0, y = 0;
        for(i = 1; i < arr.length; i++) {
            Xor ^= arr[i];
        }
        res = Xor;
        int pos = 0;
        while ((Xor & 1) != 1){
            pos++;
            Xor = Xor >> 1;
        }
        int mask = (1 << pos);
        for(i = 0; i < arr.length; i++) {
            if ((arr[i] & mask) == 1) {
                x = x ^ arr[i];
            }
        }
        y = res ^ x;
        System.out.println(x + " " + y);
    }
}
