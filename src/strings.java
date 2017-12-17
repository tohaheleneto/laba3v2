import java.util.ArrayList;
public class strings
{   char [] Mass ;
    ArrayList<String> words = new ArrayList<String>();

    int [] countofwords = new int[1024];
    String word;
   public void read1(String a)
    {
        Mass = a.toCharArray();
        StringToWords();
        cut();
    }
    public void StringToWords()
    {  int i=0,j;
       while (i<Mass.length)
       {    j=0;

            while (i<Mass.length && ((Mass[i]!=' ') & (Mass[i]!='.' ) &(Mass[i]!=',')))
            {
                j++;
                i++;

            }

             word="";
            for (int y=i-j;y<i;y++)
            {
            word=word+Mass[y];
            }
            if (words.contains(word))
            {
                countofwords[words.indexOf(word)]++;
            }
            else
            {
            countofwords[words.size()]++;
            words.add(words.size(),word);
            }
            i++;
       }
    }
    public void cut()
    {
        if (Mass.length%2==0)
        {   if (Mass.length>4)
            {
                for (int i = 2; i < Mass.length -2; i++)
                {
                    System.out.print(Mass[i]);
                }
                System.out.println();
            }
        }
        else
        {
            for (int i = 0; i < Mass.length; i++)
            {
                System.out.print(Mass[i]);
            }
            System.out.println();
        }


    }
    public void ShowWordCounts()
    {
        for (int i=0;i<words.size();i++)
        {
            System.out.println(words.get(i) +" : " + countofwords[i]);
        }
    }

}
