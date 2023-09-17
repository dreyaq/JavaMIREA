package Proj11;

import java.util.Date;

import static java.lang.Thread.sleep;

public class task_11_1 {
    public static void main(String[] args) throws InterruptedException {
        Date firstDate = new Date();
        System.out.println("Задание выдано в " + firstDate);
        sleep(10000);
        System.out.println("Usov:\nДата и время выдачи задания - " + firstDate + "\nДата и время сдачи работы - " + new Date());
    }
}
