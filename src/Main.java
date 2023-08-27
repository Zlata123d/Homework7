import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();}

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
            balance*=1.07;
            ++ month;
            System.out.println("Месяц"+ month+",сумма накоплений равна"+balance+"рублей");
        }

}
    public static void task5(){
        System.out.println("Задача 5");
        int  balance=0;
        int month=0;
        while (balance <=12_000_000){
            balance +=15000;
            balance*=1.07;
            ++ month;
            if (month % 6 ==0){
            System.out.println("Месяц"+ month+",сумма накоплений равна"+balance+"рублей");
    }}}
    public static void task6(){
        System.out.println("Задача 6");
    int balance =0;
    for (int j=1; j<9 * 12; j++){
        balance+=15000;
        balance*=1.07;
        if (j % 6 ==0){
            System.out.println("Месяц"+j+",сумма накоплений равна"+balance+"рублей");
        }
    }}
        public static void task7 () {
            System.out.println("Задача 7");
            for (int friday =3; friday<=31; friday+=7){
                System.out.println("Сегодня пятница"+friday+"-е число. Необходимо подготовить отчет");
            }

    } public static void task8 () {
        System.out.println("Задача 8");
        int currentYear= LocalDate.now().getYear();
        int startYear=currentYear-200;
        int endYear=currentYear+100;
        for (int j=startYear; j<=endYear; j++){
            if (j % 79==0){
                System.out.println(j);
            }
        }
    }}