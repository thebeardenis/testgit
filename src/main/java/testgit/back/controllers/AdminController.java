package testgit.back.controllers;

import com.sun.jdi.IntegerType;
import testgit.back.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AdminController {
    private User user;
    public String calculateStats(String input) {
        int upper = 0;
        int lovest = 0;
        int zero = 0;
        List<String> a = List.of(input.split(" "));
        int[] nums = new int[] {};

        return "выше нуля: " + upper + ", ниже нуля: " + lovest + ", равна нулю: " + zero;
    }
}
