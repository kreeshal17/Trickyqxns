public class pow{
    public static double pow(double x,int n){
double ans=1.0;
  long N=n;
  if (x==1) return 1.0;
  if(N<0)
  {
    x=1/x;
    N=-N;
  }
        while(N>0)
        {
            if(N%2==1)
            {
                ans=ans*x;

            }
            x=x*x;
            N=N/2;
        }
        return ans;
    }
    public  static void main(String[] args)
    {
        double x=2;
        int n=5;
        System.out.println(pow(x,n));
    }
}