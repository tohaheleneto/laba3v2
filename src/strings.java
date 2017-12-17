public class strings
{   char [] Mass ;
    String MaxWord="";
    String MaxPhrase="";
   public void read1(String a)
    {
        Mass = a.toCharArray();
        findMax();
        cut();
    }
    public void findMax()
    {  int i=0,j,k=0;
       while (i<Mass.length)
       {    j=0;

            while (i<Mass.length && ((Mass[i]!=' ') & (Mass[i]!='.' ) &(Mass[i]!=',')))
            {
                j++;
                i++;
                k++;
            }
            if (j>MaxWord.length())
            {   MaxWord="";
                for (int y=i-j;y<i;y++)
                {
                MaxWord=MaxWord+Mass[y];
                }

            }
            if ((i<Mass.length) && (Mass[i]=='.'))
            {
             if(k>MaxPhrase.length())
             {
                 MaxPhrase="";
                 for (int y=i-k;y<i;y++)
                 {
                     MaxPhrase=MaxPhrase+Mass[y];
                 }
                 k=0;
             }
            }
            i++;
       }
    }
    public void cut()
    {
        int temp=0;
        for (int i=0;i<Mass.length/2;i++)
        {
            System.out.print(Mass[i]);
        }
        if (Mass.length%2!=0)
        {
            temp++;

        }
        for (int i=Mass.length/2;i<Mass.length-temp;i++)
        {
            System.out.print(Mass[i+temp]);
        }
        System.out.println();

    }

}
