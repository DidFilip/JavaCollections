package model;

import controller.BubbleController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBubble {
    public static void main(String[] args) {
        List<Integer> myList =
                new ArrayList<>(Arrays.asList(1,4,3,2,6,556,7,678,12,3,678,32,45));
        BubbleController bc = new BubbleController();
        System.out.println(bc.sortASC(myList));
    }
}
