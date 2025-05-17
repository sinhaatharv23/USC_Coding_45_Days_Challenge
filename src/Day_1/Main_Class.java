package Day_1;

import java.util.*;
class shot{
    public int good_Shot(int n,int arr[]){
        int count_good_shot =0;
        for(int i=0;i<n;i++){
            if(arr[i]>=7){
                count_good_shot++;
            }
        }
        return count_good_shot;
    }
    public int bad_Shot(int n,int arr[]){
        int count_bad_shot=0;
        for(int i=0;i<n;i++){
            if(arr[i]<7){
                count_bad_shot++;
            }
        }
        return count_bad_shot;
    }
}
public class Main_Class{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shots between 1-100:- ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the score (0-10) in shot "+(i+1)+":- ");
            arr[i]=sc.nextInt();
        }
        shot s = new shot();
        System.out.println("The number of good shots are:- "+s.good_Shot(n,arr));
        System.out.println("The number of bad shots are:- "+s.bad_Shot(n,arr));
    }
}