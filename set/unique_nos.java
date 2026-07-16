package set;
import java.util.*;
public class unique_nos {
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr1[]=new int[n];
    int arr2[]=new int[m];
    for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
        arr2[i]=sc.nextInt();
    }
    System.out.print(ans(arr1,arr2));
    }
    public static int ans(int [] arr1,int []arr2){
        HashSet<Integer>set1=new HashSet<>();
        //HashSet<Integer>set2=new HashSet<>();
        int count=0;
        for(int i:arr1){
            set1.add(i);
            count++;
        }
       
       for(int i:arr2){
        if(!set1.contains(i)){
            set1.add(i);
            count++;
        }
        else{
            count--;
        }
       }
     return count;
    }
}
