public class sum{


    public static  int sumnumber(int a,int b)
    {
    while(b!=0)
    {
      int   temp=(a&b)<<1;
      a= a^b;
      b=temp;

    }

  return a;


    }
    public static void main (String args[])
    {


int a;
int b;
    System.out.println(sumnumber(5,6));
    System.out.println(sumnumber(-1,6));

    }
}