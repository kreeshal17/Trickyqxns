public class trapwater{
    public static int solution(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        int sum=0;
        int  left_max=0;
        int right_max=0;
        while(left<right)
        {
if(arr[left]<arr[right])
{
    if(arr[left]<=left_max)
    {
sum+=left_max-arr[left];

    }
    else{
        left_max=arr[left];
    }
    left++;
}
else
{
    if(arr[right]<=right_max)
    {
        sum+=right_max-arr[right];
        
        
    }
    else{
     right_max=arr[right];
    }
    right--;
}







        }





        return sum;
    }
    public static void main(String[]args)
    {
        int arr[]={4, 2, 0, 3, 2, 5};
     System.out.println(" "+ solution(arr));
;
    }
    
}
// //public class Main {
//     public static int solution(int arr[]) {
//         int left = 0;
//         int right = arr.length - 1;
//         int sum = 0;
//         int left_max = 0;
//         int right_max = 0;

//         while (left < right) {
//             if (arr[left] < arr[right]) {
//                 // Update left_max using Math.max
//                 left_max = Math.max(left_max, arr[left]);
//                 // Add water trapped if left_max is greater than the current height
//                 sum += left_max - arr[left];
//                 left++; // Move left pointer
//             } else {
//                 // Update right_max using Math.max
//                 right_max = Math.max(right_max, arr[right]);
//                 // Add water trapped if right_max is greater than the current height
//                 sum += right_max - arr[right];
//                 right--; // Move right pointer
//             }
//         }

//         return sum;
//     }

//     public static void main(String[] args) {
//         int arr[] = {4, 2, 0, 3, 2, 5};
//         System.out.println("Water Trapped: " + solution(arr)); // Expected Output: 9
//     }
// }
