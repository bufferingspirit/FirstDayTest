package com.example.admin.firstdaytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
/* Robert Price*/

public class codingtest{

    public static void main(String[] args){

        //problem 1
        //if number divisible by 3 then print fizz
        //if number divisible by 5 print buzz
        //if number divisible by both print fizzbuzz
        Integer[] numbers = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(numbers));
        System.out.println("Problem 1:");
        printFizzBuzz(A);

        //problem2
        //print out the duplicate strings in a arraylist of strings
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("A");
        stringArrayList.add("E");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("D");

        System.out.println("Problem 2:");
        printDuplicates(stringArrayList);


    }

    public static void printFizzBuzz(ArrayList<Integer> numbers){
        int i = 0;
        while(i < numbers.size()){
            if(((numbers.get(i)%3) == 0) && (numbers.get(i)%5 == 0)){
                System.out.println("fizzbuzz");
            }
            else if((numbers.get(i)%3) == 0){
                System.out.println("fizz");
            }
            else if((numbers.get(i)%5 == 0)) {
                System.out.println("buzz");
            }
            i++;
        }
    }

    public static void printDuplicates(ArrayList<String> letters){
        HashMap<String, Integer> duplicates = new HashMap<String, Integer>();
        for(int i = 0; i < letters.size(); i++){
            String foo = letters.get(i);
            if(!(duplicates.containsKey(foo))){
                duplicates.put(foo, 0);
            }
            else{
                duplicates.put(foo, duplicates.get(foo)+1);
            }
        }
        for(Map.Entry<String, Integer> entry : duplicates.entrySet()){
            if(entry.getValue() > 0){
                System.out.println(entry.getKey());
            }
        }
    }
}