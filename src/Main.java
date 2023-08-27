public class Main {
    public static void main(String[] args) {
        task1();
    task2();}

public static void task1(){
        System.out.println("Задача 1");
        int balance = 0;
         int month = 0;
         while (balance < 2_459_000){
             balance+=15000;
             ++month;
         }
         System.out.println("Месяц"+month+",сумма накоплений равна"+ balance+"рублей");

}public static void task2(){
        System.out.println("Задача 2");
        int i=1;
        while (i<=10){
            System.out.println(i+"");
            ++i;
        }

        for (i=10;i>=1;i--){
            System.out.println(i+"");
        }

    }
}