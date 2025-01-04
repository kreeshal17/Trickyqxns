public class mergesort{

    public static void soln(int[]num1,int m,int num2[],int n)
    {
        int p1=m-1;
        int p2=n-1;
        int p=m+n-1;
        while(p1>=0&&p2>=0)
        {
            if(num1[p1]<num2[p2])
            {
                num1[p]=num2[p2];
                p2--;
            }
            else{
                num1[p]=num1[p1];
                p1--;
            }
            p--;
        }
        while(p2>=0)
        {
            num1[p]=num2[p2];
            p--;
            p2--;
        }
    }
    public static void main(String[] args)
    {
        int num1[]={1,2,3,0,0,0};
        int m=3;
        int n=3;
        int num2[]={2,5,6};
        printvalue(num1);
        System.out.println(" ");
        soln(num1, m, num2, n);
        printvalue(num1);

    }
    public static void printvalue(int num1[])
    {
        for(int i:num1)
        {
            System.out.print(i+" ");
        }
    }

}