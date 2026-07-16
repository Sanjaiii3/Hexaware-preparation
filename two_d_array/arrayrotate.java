package two_d_array;
import java.util.*;
public class arrayrotate {
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++){
        for(int j=i+1;j<c;j++){
            int t=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=t;
        }
    }
    for(int [] row:arr){
        reverse(row);
    }
    for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}


}
public static int [] reverse(int []arr){
    int l=0;
    int r=arr.length-1;
    while(l<r){
        int t=arr[l];
        arr[l]=arr[r];
        arr[r]=t;
        l++;
        r--;
    }
    return arr;
}
}
