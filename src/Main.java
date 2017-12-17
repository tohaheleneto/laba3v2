import java.io.*;

public class Main
{    public static void main(String[] args)
    {   strings a = new strings();
        try
        {
            FileInputStream fstream = new FileInputStream("C:/string/a.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null)
            {
                a.read1(strLine);



            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка");
        }
        System.out.println("Maxword:"+a.MaxWord);
        System.out.println("Maxphrase:"+a.MaxPhrase);
    }
}
