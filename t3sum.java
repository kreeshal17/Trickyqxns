import java.util.*;
public class t3sum{
    public static  List<List<Integer>>threesum(int arr[])
    {
    List <List<Integer>> ans =new ArrayList();
    Arrays.sort(arr);
       for(int i=0;i<arr.length-2;i++)
       {
           if (i>0&&arr[i]==arr[i-1])
           {
               continue;
           }
        int j=i+1;
        int k= arr.length-1;
        while(j<k)
        {
            int result= arr[i]+arr[j]+arr[k];
        
        if(result<0)
        {
            j++;

        }
        else if(result>0)
        {
            k--;
        }
        else{
            ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
            while(j<k && arr[j]==arr[j+1])
            {
                j++;
            }
            while(j<k && arr[k]==arr[k-1])
            {
                k--;
            }
            j++;
            k--;
  }

    }

       }
    
    return ans;

}


 public static void main(String[]args)
 {

int arr[]={-1,0,1,2,-1,-4};

List<List<Integer>> result= threesum(arr);
for(List<Integer> x:result)
{
    System.out.print(x);
}


 }








}