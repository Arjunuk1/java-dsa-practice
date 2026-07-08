import java.util.*;

public class twodarrays {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();
        int cols = scn.nextInt();

        int arr[][] = new int[rows][cols];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        // //output
        // for(int i = 0;i<rows;i++){
        //     for(int j = 0;j<cols;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int x = scn.nextInt();
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(arr[i][j] == x){
                    System.out.print("x found at indices (" + i + "," + j + ")");
                }
            }
        }


    }
}