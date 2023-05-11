import java.util.*;
public class TextBox
{
    public ArrayList<String[]> textList=new ArrayList<String[]>();
    public TextBox(String text)
    {
        String line1=null;
        String line2=null;
        String line3=null;
        int startPoint=0;
        boolean keepGoing=true;
        while(text.length()-startPoint>46)
        {
            for(int i=0;i<46;i++)
            {
                if(text.charAt(startPoint+46-i)==' ')
                {
                    line1=text.substring(startPoint,startPoint+46-i);
                    startPoint=startPoint+47-i;
                    break;
                }
            }
            if(text.length()-startPoint>46)
            {
                for(int i=0;i<46;i++)
                {
                    if(text.charAt(startPoint+46-i)==' ')
                    {
                        line2=text.substring(startPoint,startPoint+46-i);
                        startPoint=startPoint+47-i;
                        break;
                    }
                }
            }
            else
            {
                line2=text.substring(startPoint);
                keepGoing=false;
            }
            if(text.length()-startPoint>46)
            {
                for(int i=0;i<46;i++)
                {
                    if(text.charAt(startPoint+46-i)==' ')
                    {
                        line3=text.substring(startPoint,startPoint+46-i);
                        startPoint=startPoint+47-i;
                        break;
                    }
                }
            }
            else
            {
                if(keepGoing)
                {
                    line3=text.substring(startPoint);
                    keepGoing=false;
                }
            }
            textList.add(new String[] {line1,line2,line3});
            line1=null;
            line2=null;
            line3=null;
        }
        if(text.length()-1!=startPoint&&keepGoing)
        {
            textList.add(new String[] {text.substring(startPoint),null,null});
        }
    }

    public ArrayList<String[]> getList()
    {
        return textList;
    }
}
