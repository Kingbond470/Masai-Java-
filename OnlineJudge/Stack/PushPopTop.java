// https://oj.masaischool.com/contest/1414/problem/1
import java.util.Scanner;
import java.util.Stack;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    Stack stack=new Stack();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      if(n==2){
        if(stack.size()>0) stack.pop();
      }
      else if(n==1){
        stack.push(sc.nextInt());
      }
      else if(n==3){
        if(stack.size()==0) System.out.println("Empty!");
        else System.out.println(stack.peek());
      }
    }
  }
}
