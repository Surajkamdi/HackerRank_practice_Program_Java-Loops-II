import java.util.*;
import java.io.*;

class Java_loop_II{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            //program written by Er. Suraj Kamdi
            int sum =a; //initialize the value sum=a;
            int k=1;// initialize the value of k=1
            for(int j=1;j<=n;j++){ // for upto n calculate the sum
                sum=sum+(k*b);
                System.out.print(sum+" ");
                k=k*2;//multiple of k
            }
            System.out.println();
        }
        in.close();
    }
}
