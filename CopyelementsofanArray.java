import java.util.Scanner;

public class CopyelementsofanArray {
      public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int arr[] = new int[10];
      int arr1[] = new int[10];
      for(int i = 0;i<10;i++){
          arr[i] = scn.nextInt();
      }
      for(int i = 9;i>=0;i--){
          System.out.println(arr[i]);
      }
  }
}
