package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of elements you want to have in array");
        int n=s.nextInt();
        double median=0;
        int [] arr= new int[n];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        if(n%2==0){
             median= (arr[(arr.length-1)/2]+arr[(arr.length-1)/2])/2;
        }
        else{
                 median = arr[(arr.length-1)/2];
    }
        System.out.println("Median = "+median);
    }
}
