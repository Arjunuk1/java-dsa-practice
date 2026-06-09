import java.util.*;

public class merge_sort
{
    public static void merge(int arr[], int s, int mid, int e){
        ArrayList<Integer> ll = new ArrayList<Integer>();
        int l = s;
        int r = mid+1;
        while(l<=mid && r<=e){
            if(arr[l] < arr[r]){
                ll.add(arr[l]);
                l++;
                
            }
            else{
                ll.add(arr[r]);
                r++;
            }
        }
        
        if(l<=mid){
            while(l<=mid){
                ll.add(arr[l]);
                l++;
            }
        }
        else{
            while(r<=e){
                ll.add(arr[r]);
                r++;
            }
        }
        
        for(int i=s;i<=e;i++){
            arr[i] = ll.get(i-s);//s=4, i=4,5,6,7 //ll=> 0 1 2 3
        }
    } 
    public static void mergeSort(int arr[], int s, int e){
        if(s < e){
            int mid = s+(e-s)/2;
            mergeSort(arr, s, mid);//a
            mergeSort(arr, mid+1, e);//b
            merge(arr, s, mid, e);//c
        }
    }
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = obj.nextInt();
		}
		
		mergeSort(arr, 0, n-1);
		
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}


