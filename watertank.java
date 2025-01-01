public class watertank{

    public static int optimialsoln(int [] arr )
    {
        int ans=0;
        int l=0;
        int r=arr.length-1;
        int result=0;
        while(l<r)
        {
           int  w=r-l;
           int h=Math.min(arr[l],arr[r]);
         int area=w*h;
         result= Math.max(result,area);

         if(arr[l]<arr[r])
         {
            l++;
         }
         else{
            r--;
         }


        }
        return result;
    }
    
    public static void main(String[] args)
    {
       int arr[]={1,8,6,2,5,4,8,3,7};
      System.out.println("the ans is "+ optimialsoln(arr));
       
    }
}