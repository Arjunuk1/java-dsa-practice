import java.util.Scanner;

public class mergeStudents {
    public static int[] mergeArrays(int a[], int b[]){
        int n = a.length;
        int m = b.length;

        int ans[] = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<n && j<m){
            if(a[i] > b[j]){
                ans[k] = a[i];
                i++;
            }
            else{
                ans[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<n){
            ans[k] = a[i];
            i++;
            k++;
        }

        while(j<m){
            ans[k] =  b[j];
            j++;
            k++;
        }
        return ans;
    }
    

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] b = new int[m];

        for(int i = 0; i < m; i++)
        {
            b[i] = sc.nextInt();
        }

        int[] ans = mergeArrays(a, b);

        for(int x : ans)
        {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
