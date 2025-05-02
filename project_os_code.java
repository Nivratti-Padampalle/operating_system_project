
import java.util.Scanner;
class Main {
private static float average(int x, int y, int z ,int num){
    int wait_time = 0;
    int a = wait_time;
    int b = wait_time + x;
    int c = wait_time + x + y;
return (a + b + c) / num;
}
private static float average_sjfs(int x, int y, int z ,int num){
    int wait_time = 0;
    int a = wait_time;
    int b = wait_time + x;
    int c = wait_time + x + y;
return (a + b + c) / num;
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
System.out.println("you brust time for all processes are " + p1 + " " + p2 +" " + p3);
float ans = average(p1,p2,p3,n);
System.out.println("average time for fcfs=" + ans);
float ans2 = average_sjfs(p3,p2,p1,n);
System.out.println("average time for fcfs=" + ans2);
    }
}