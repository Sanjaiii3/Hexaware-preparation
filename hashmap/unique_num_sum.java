package hashmap;

import java.util.HashMap;

public class unique_num_sum {
     public static void main(String[] args) {
    int n= 5;
   int m=4;
  int arr1[]={9, -4, 3, 2, -5};
  int arr2[]={2, -5, 7, 9};
  HashMap<Integer,Integer> map1=new HashMap<>();
  
  for(int i=0;i<n;i++){
      map1.put(arr1[i],map1.getOrDefault(arr1[i],0)+1);
  }
   for(int i=0;i<m;i++){
      map1.put(arr2[i],map1.getOrDefault(arr2[i],0)+1);
  }
  int sum=0;
  for(int i:map1.keySet()){
      if(map1.get(i)==1){
          sum+=i;
      }
  }
  System.out.println(sum);
}
}