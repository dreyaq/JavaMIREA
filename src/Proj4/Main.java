package Proj4;

public class Main {
    public static void printSeasonDescription(Season season) {
        switch (season) {
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
        }
    }
    public static void main(String[] args) {
        Season mySeason = Season.Лето;
        System.out.println("Мое любимое время года: " + mySeason.getName());
        System.out.println("Средняя температура: " + mySeason.getTemp() + " градусов Цельсия");
        System.out.println("Описание: " + mySeason.getDescription());

        System.out.println("\nВывод через метод:");
        printSeasonDescription(Season.Весна);
        printSeasonDescription(Season.Лето);
        printSeasonDescription(Season.Осень);
        printSeasonDescription(Season.Зима);

        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season.getName());
            System.out.println("Средняя температура: " + season.getTemp() + " градусов Цельсия");
            System.out.println("Описание: " + season.getDescription() + "\n");
        }
    }


}