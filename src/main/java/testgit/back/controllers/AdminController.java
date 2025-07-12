package testgit.back.controllers;

import com.sun.jdi.IntegerType;
import testgit.back.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AdminController {
    private User user;
    public String calculateStats(String input) {
        return "";
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int lst = digits.length - 1;
        for (int i=lst; i >= 0; i--) {
            if (digits[i] <= 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                if (i-1 >= 0) {
                    digits[i] = 0;
                    digits[i-1] = digits[i-1] + 1;
                }
            }
        }
        if (digits[0] > 9) {
            int[] res = new int[lst+2];
            res[0] = 1;
            for (int i=1; i <= lst+1; i++) {
                res[i] = digits[i-1]%10;
            }
            return res;
        }
        return digits;
    }
}
