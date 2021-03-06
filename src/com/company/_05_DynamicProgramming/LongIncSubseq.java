package com.company._05_DynamicProgramming;

import java.util.Arrays;

public class LongIncSubseq {
    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        System.out.println(longIncSubseqDP(nums));
    }

    public static int longIncSubseqDP(int[] nums) {
        int[] mem = new int[nums.length];
        int i, j, max = 0;

        Arrays.fill(mem, 1);
        for (i = 1; i < nums.length; i++) {
            for (j = 0; j < i; j++) {
                if (nums[i] > nums[j] && mem[i] < mem[j] + 1) {
                    mem[i] = mem[j] + 1;
                }
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (max < mem[i]) {
                max = mem[i];
            }
        }
        return max;
    }
}
