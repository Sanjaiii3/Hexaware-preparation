package stringss;
import java.util.*;
public class zigzag {
        public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int row=sc.nextInt();
    if(s.length()<=row){
        System.out.print(s);
        return;
    }
    StringBuilder sb[]=new StringBuilder[row];
    for(int i=0;i<row;i++){
        sb[i]=new StringBuilder();
    }
    int i=0;
    boolean down=false;
    for(char ch:s.toCharArray()){
        sb[i].append(ch);
        if(i==0||i==row-1){
            down=!down;
        }
        if(down){
            i++;
        }
        else{
            i--;
        }
    }
    StringBuilder ans=new StringBuilder();
    for(StringBuilder  ch:sb){
        ans.append(ch);
    }
    System.out.print(ans.toString());
}


}
