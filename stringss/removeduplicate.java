package stringss;
import java.util.*;
public class removeduplicate {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         HashSet<Character>set=new HashSet<>();
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
             set.add(s.charAt(i));
             sb.append(s.charAt(i));
         }
        }
         System.out.println(sb.toString());
    }
}
