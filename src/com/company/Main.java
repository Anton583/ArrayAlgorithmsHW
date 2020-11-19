package com.company;
import ibcsutils.ReadViaURL;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int [] nums = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
//        System.out.println(hw1(nums, 15));
//        hw2("Charlie");
        hw5();

    }
    static int hw1(int[] arr, int key) {
        int first = 0;
        int last = arr.length-1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (key > arr[middle]) {
                middle = (first + last) / 2;
                first = middle+1;
            }  else if (key < arr[middle]) {
                last = middle - 1;
            }  else if(arr[middle] == key){
                break;
            }
            System.out.println(middle);
        }
        return middle;
    }
    static void hw2 (String name){
        String[] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] grades = {"B", "D", "B", "A"};
        boolean found = false;
        for (int i = 0; i<=students.length - 1 && !found; i++) {
        if (students[i].equals(name)){
            System.out.println(grades[i]);
            found = true;
        }
        }
    }
    static void hw3_1(){
        int[] data = {-4, 11, 7, -12, 6, 1};
        int lowest, lowestInd;
        for(int i = 0; i<data.length; i++){
        lowest = data[i];
        lowestInd = i;
        for (int k = i; k<data.length; k++){
            if (data[k] < lowest) {
                lowest = data[k];
                lowestInd = k;
            }
        }
            System.out.println(Arrays.toString(data));
        if (i != lowestInd){
            int temp = data[i];
            data[i] = data[lowestInd];
            data[lowestInd] = temp;
        }
        }
    }
    static void hw3_2(){
        int[] data = {-4, 11, 7, -12, 6, 1};
                int temp = 0;
                for(int i=0; i < data.length; i++) {
                    for (int j = 1; j < data.length - i; j++) {
                        if (data[j - 1] > data[j]) {
                            //swap elements
                            temp = data[j - 1];
                            data[j - 1] = data[j];
                            data[j] = temp;
                        }
                    }
                    System.out.println(Arrays.toString(data));
                }
            }
            static void hw4_1(){
        String addr = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(addr);
        String[] localWords = new String[20];
        String key = "abaft";
        int j = 0;
        boolean found = false;
                for (int i = 0; i<localWords.length; i++) {
                    localWords[i] = words[j];
                    j++;
                }
                for (int i = 0; i<localWords.length && !found; i++){
                    if (localWords[i].equals(key)) {
                        found = true;
                        System.out.println(localWords[i]);
                    }
                }
            }
            static void hw4_2(){
                String addr = "http://www-personal.umich.edu/~jlawler/wordlist";
                String[] words = ReadViaURL.readWords(addr);
                String[] localWords = new String[20];
                String key = "abaft";
                int j = 0;
                int start = 0;
                for (int i = 0; i<localWords.length; i++){
                    localWords[i] = words[j];
                    j++;
                }
                int end = localWords.length - 1;
                int middle = (start + end) / 2;
                while(start <= end)
                {
                    if(localWords[middle].compareTo(key) < 0)
                    {
                        start = middle + 1;
                    }
                    else if(localWords[middle].equals(key))
                    {
                        System.out.println(localWords[middle]);
                        break;
                    }
                    else
                    {
                        end = middle - 1;
                    }
                    middle = (start + end) / 2;
                }
                if(start > end)
                {
                    System.out.println("Element not found!");
                }
            }


    static void hw5()
    {
        int[] arrNum = {9, 7, 2, 11};
        int n = arrNum.length;
        for(int i = 1; i < n; i++)
        {
            int val = arrNum[i];
            int j = i - 1;
            while(j >= 0 && arrNum[j] > val)
            {
                arrNum[j + 1] = arrNum[j];
                j = j - 1;
            }
            arrNum[j + 1] = val;
        }
        System.out.println(Arrays.toString(arrNum));
    }

        }
