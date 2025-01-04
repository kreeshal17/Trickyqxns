
import java.util.Arrays;


public class removeelemet {
    public static void main(String []args)
    {

        int num[]={1,2,2,3,5,6,3,5,8,2};
        int target=2;
        printval(num);
        System.out.println("");
        solution(num,target);
        Arrays.sort(num);
        printval(num);





    }

    public static void printval(int[] num) {
       for(int  i:num)
       {
        System.out.print(i+" ");
       }
    }

    private static int  solution(int[] num, int target) {
        int k=0;
        for(int i :num)

        {
            if(i==target)
            {
                continue;
            }
            else{
                num[k]=i;
                k++;
            }
            
        }
      
        for(int i=k;i<num.length;i++)
        {
            num[i]=0;
        }
        return k;
      
    }
    
}
