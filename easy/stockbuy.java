public class stockbuy {
    public static int stock(int arr[])
    {
        int maxprofit=0;
        int bestday=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>bestday)
            {
                maxprofit=Math.max(maxprofit,arr[i]-bestday);

            }
            bestday=Math.min(bestday,arr[i]);
        }
        return maxprofit;

    }
    public static void main(String[] args)
    {
        int arr[]= {7,1,5,6,3,4};
       System.out.println(stock(arr));
       
}
}
