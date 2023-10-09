package Proj14;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reg {
    public static void main(String[] args) {
        System.out.println("НОМЕР 2");
        String regex = "abcdefghijklmnopqrstuv18340";
        String s1 = "abcdefghijklmnopqrstuv18340", s2="abcdefghijklmnopqrst_uv18340";
        System.out.println(Pattern.matches(regex,s1)+"  "+Pattern.matches(regex,s2));


        System.out.println("\nНОМЕР 3");
        String prices = "16 USS, 17 USD, 21024.231 RUB, 60 BUBLS, 35.532 EU";
        regex = "(((\\d+)|((\\d+)\\.((\\d+)))) USD)|(((\\d+)|((\\d+)\\.((\\d+)))) RUB)|(((\\d+)|((\\d+)\\.((\\d+)))) EU)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(prices);
        while (m.find())
        {
            System.out.println(m.group());
        }

        System.out.println("\nНОМЕР 4");
        regex="([0-9]+\\s+\\+)";
        String test1 ="(1 + 8) – 9 / 4", test2="6 / 5 – 2 * 9";
        p = Pattern.compile(regex);
        Matcher m1 = p.matcher(test1);
        Matcher m2= p.matcher(test2);
        while (m1.find())
        {
            System.out.println(m1.group());
        }

        while (m2.find())
        {
            System.out.println(m2.group());
        }

        System.out.println("\nНОМЕР 5");
        regex= "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$";
        p = Pattern.compile(regex);
        String testString = "29/02/200030/04/200301/01/200330-04-20031/1/1899";
        String s;
        for (int i = 0;i<testString.length();i+=10)
        {
            if (i+10>testString.length()) s = testString.substring(testString.length()-8,testString.length());
            else s = testString.substring(i,i+10);
            m = p.matcher(s);
            if (m.find()) System.out.println(m.group());
        }

        System.out.println("\nНОМЕР 9");
        String text = "шзпавпргвпргшщавргщпваргшщпв вап вкап укгп рукпнг8а укгшп ук";
        Map<Character, Integer> letterFrequency = new HashMap<>();
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            char letter = matcher.group().charAt(0);
            letterFrequency.put(letter, letterFrequency.getOrDefault(letter, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
