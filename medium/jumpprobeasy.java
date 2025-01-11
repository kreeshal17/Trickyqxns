
public class jumpprobeasy {
    public static Boolean soln(int arr[])
    {
     //You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
     int reachable=0;
     for(int i=0;i<arr.length;i++)
     {
        if(i>reachable) return false;
       
        
            reachable=Math.max(reachable,arr[i]+i);
        }
        return true;

     


       
    }
public static void main(String args[])
{
    int num[]={1,2,1,0,3};
    System.out.println(soln(num));
}
    
}
