public class Main {
    public static void main(String[] args) {
        task1();
    task2();
    task3();
    task4();}

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
    public static void task3(){
     System.out.println("Задача 3");
     int population=12_000_000;
     int ferility=17;
     int mortality=8;
     for (int j=1; j<=10; j++) {
         population+=population/1000*(ferility - mortality);
         System.out.println("Год"+ j +",численность населения составляет "+ population);


     }
    }
    public static void task4(){
        System.out.println("Задача 4");
       int  balance=0;
        int month=0;
        while (balance <=12_000_000){
            balance +=15000;
            balance*=0.07;
            ++ month;
            System.out.println("Месяц"+ month+",сумма накоплений равна"+balance+"рублей");
        }

}}