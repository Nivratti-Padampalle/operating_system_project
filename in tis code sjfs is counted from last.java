//in tis code sjfs is counted from last process to first

import java.util.Scanner;
class Main {
private static float average(int x, int y, int z ,int k,int num){
    int wait_time = 0;
    int a = wait_time;
    int b = wait_time + x;
    int c = wait_time + x + y;
     int d = wait_time + x + y + z;
return (float)(a + b + c + d) / num;
}
private static float average_sjfs(int k ,int x, int y, int z ,int num){
    int wait_time = 0;
    int a = wait_time;
    int b = wait_time + k;
    int c = wait_time + k + x;
    int d = wait_time + k + x+y;
return (float)(a + b + c + d) / num;
}
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("enter number of process ");
int n = obj.nextInt();
System.out.println("enter brust time for first process ");
int p1 = obj.nextInt();
System.out.println("enter brust time for second process ");
int p2 = obj.nextInt();
System.out.println("enter brust time for third process ");
int p3 = obj.nextInt();
System.out.println("enter brust time for fourth process ");
int p4 = obj.nextInt();
System.out.println("you brust time for all processes are " + p1 + " " + p2 +" " + p3 +" " + p4);
float ans = average(p1,p2,p3,p4,n);
System.out.println("average time for fcfs=" + ans);
float ans2 = average_sjfs(p4,p3,p2,p1,n);
System.out.println("average time for sjfs=" + ans2);
    }
}