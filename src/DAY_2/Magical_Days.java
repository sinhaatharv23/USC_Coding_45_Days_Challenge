package DAY_2;
import java.util.*;
public class Magical_Days{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n = sc.nextInt();
        if(n<3||n>100){
            System.out.println("Invalid number of days. Must be between 3 and 100");
            return;
        }
        int[]arr=new int[n];
        for(int i =0;i<n;i++){
            while(true){
                arr[i]=sc.nextInt();
                if(arr[i]>=0){
                    break;
                }
                System.out.println("Invalid Score. Please enter a non-negative value.");
            }
        }
        int magical = 0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                magical++;
            }
        }
        System.out.println("Number of magical days:- "+magical);
    }
}
