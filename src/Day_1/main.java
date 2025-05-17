package Day_1;

import java.util.*;
class IceCream{
    public boolean isIceCream(int budget,int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==budget){
                return true;
            }
        }
        return false;
    }
}
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the budget:- ");
        int budget = sc.nextInt();
        System.out.println("Enter the size of the array:- ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element of the array:- ");
            arr[i]=sc.nextInt();
        }
        IceCream icecream = new IceCream();
        System.out.println(icecream.isIceCream(budget,arr));
    }
}