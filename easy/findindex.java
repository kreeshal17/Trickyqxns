

public class findindex {
    public static void main(String[] args)
    {
    
        String word="krishalkaisrna";
        String find="is";
        System.out.println(word.indexOf(find));
   System.out.println(solution("krishalkarnababitaanadhikari","na"));


    }
    public static int solution(String word,String find)

    {
        int m=word.length();
        int n=find.length();
       for(int i=0;i<m-n;i++)
       {
        int j=0;
        while(j<n && word.charAt(i+j)==find.charAt(j))
        {
            j++;
        }
        if(j==n) return i;
       }
       return -1;

    }
    
}
