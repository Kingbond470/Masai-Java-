// https://oj.masaischool.com/contest/1818/problem/1
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++) arr[i]=sc.nextInt();
    //System.out.println(idxFound(arr, k));
    int idx=-1;
    for(int i=0; i<n; i++){
      if(arr[i]==k) idx=i;
    }
    System.out.println(idx);
  }
  //public static int idxFound(int[] arr, int k){
  //  int low=0, high=arr.length-1;
   // int idx=-1;
   // while(low<high){
   //  int mid=low+(high-low)/2;
   //   System.out.print(mid+" ");
   //   if(arr[mid]==k) return idx=mid;
   //   else if(arr[mid]>k) high=mid-1;
   //   else low=mid+1;
   // }
   // return idx;
 // }
}
