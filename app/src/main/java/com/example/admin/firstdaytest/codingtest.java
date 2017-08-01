package com.example.admin.firstdaytest;

import java.util.ArrayList;

/* Robert Price*/

public class codingtest{

    public static void main(String[] args){

        //problem 1
        //if number divisible by 3 then print fizz
        //if number divisible by 5 print buzz
        //if number divisible by both print fizzbuzz
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

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


    }

    public void printFizzBuzz(ArrayList<Integer> numbers){
        int i = 0;
        while(i <= numbers.size()){
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

    public void printDuplicates(ArrayList<String> letters){
        int i = 0;
        ArrayList<String> duplicates = new ArrayList<>();
        while(i <= letters.size()){

        }
        //string compare here
    }
}