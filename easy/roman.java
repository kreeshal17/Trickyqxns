import java.util.*;

public class roman{
    public static void main(String args[])
    {

    String s="III";
    System.out.println(solution(s));





    }
    public static int solution(String s)
    {
       
          //I V X L C 
          HashMap <Character,Integer> hm=new HashMap<>();
          
          hm.put('I',1);
          hm.put('V',5);
        //   hm.put("",);
        //   hm.put("",);
          hm.put('X',10);
          hm.put('D',500);
          hm.put('M',1000);
          hm.put('L',50);
          hm.put('C',100);

             int n= s.length();
             int result=hm.get(s.charAt(n-1));
             for(int i=n-2;i>=0;i--)
             {
                if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1)))
                {
                     result=result-hm.get(s.charAt(i));

                }
                else{
                    result=result+hm.get(s.charAt(i));
                }
             }






        return result;
    }
}