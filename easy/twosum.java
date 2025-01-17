
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {


public static int[] solution(int arr[],int target)
{
  for(int i=0;i<5;i++)
  {
 for(int j=i+1;j<5;j++)
 {
    if (arr[i]+arr[j]==target)
    {
        return new int[] {i,j}; 
    }
 }
  }



    return new int[]{-1,-1};
}

public static int [] solutionOp(int arr[],int target)
{
int result[]=new int[2];
 Map <Integer,Integer>map=new HashMap<>();

 for(int i=0;i<5;i++)
 {
    if(map.containsKey(target-arr[i]))
    {
        result[1]=i;
        result[0]=map.get(target-arr[i]);
        return result;
    }
    map.put(arr[i],i);

 }


    return result;

}

    public static void main(String args[])
    {
     int arr[]={1,11,25,66,5};
   
int target;

       System.out.println(Arrays.toString(solution(arr, 6)));
        System.out.println(Arrays.toString(solutionOp(arr,6)));
    }
    
}
