import java.util.*;

public class No2_Indexes_of_subarray_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target:");
        int tar=sc.nextInt();
        sc.close();
        ArrayList <Integer> res=subarr(arr, tar);
        for(int yo:res){
        System.out.print(yo+"  ");
    }
    }
    static ArrayList<Integer> subarr(int[]arr,int tar){
        int left=0,sum=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>tar && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==tar){
               return new ArrayList<>(Arrays.asList(left+1,right+1)); 
            
            }
            
        }
        return new ArrayList<>(-1);
    }
    
}
