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
