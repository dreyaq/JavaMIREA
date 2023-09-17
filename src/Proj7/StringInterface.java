package Proj7;

public interface StringInterface {
    public static int len(String s)
    {
        int k=0;
        for (int i = 0; i<s.length();i++)
        {
            if (s.charAt(i) != ' ') k++;
        }
        return k;
    }
    public static String oddIndex(String s)
    {
        String result="";
        for (int i=1;i<s.length();i+=2)
        {
            result+=s.charAt(i);
        }
        return result;
    }
    public static String reverse(String s)
    {
        String result="";
        for (int i=s.length()-1;i>=0;i--)
        {
            result+=s.charAt(i);
        }
        return result;
    }
}
