package set;

import java.util.HashSet;

public class unique_nos_sum {
    public static void main(String[] args) {
    int n= 5;
   int m=4;
  int arr1[]={9, -4, 3, 2, -5};
  int arr2[]={2, -5, 7, 9};
  HashSet<Integer> set1=new HashSet<>();
  HashSet<Integer> set2=new HashSet<>();
  for(int i:arr1){
      set1.add(i);
  }
  for(int i:arr2){
      set2.add(i);
  }
  int sum=0;
  for(int i:set1){
      if(!set2.contains(i)){
          sum+=i;
      }
  }
  for(int i:set2){
      if(!set1.contains(i)){
          sum+=i;
      }
  }
  System.out.print(sum);
}
