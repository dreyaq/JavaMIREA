package Proj13;
public class task_13_1_1
{
    public static void stringMethod(String s)
    {
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replaceAll("a","o"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(7));
    }

    public static void main(String[] args) {
        stringMethod("I like Java!!!");
    }
}
