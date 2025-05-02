//this is code to calculate average shortest job first scheduling for only three process 

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
            int a = wait_time;
            int b= a + p[0];
            int c = b + p[1];
            float average = (a + b + c) / num;
            System.out.println(average);
    }
}