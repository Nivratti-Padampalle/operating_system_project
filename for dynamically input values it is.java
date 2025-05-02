//for dynamically input values it is used to calculate average time for sjfs

import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter no of processes");
        int n = obj.nextInt();
        System.out.println("enter processes");  
        int p[] = new int [n];
        for(int i = 0; i < n; i++){
            p[i] = obj.nextInt();
        }
        int num = n;
        Arrays.sort(p);
        int wait_time = 0;
        int sum = 0;
        for(int i = 0; i < n-1; i++){
           wait_time = wait_time + p[i];
           sum = sum + wait_time;
    
        }   
            float  average = (sum) / num;
            System.out.println(average);
    }
}