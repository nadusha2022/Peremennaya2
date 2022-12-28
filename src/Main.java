public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 3;
        short d = 2;
        int f = 4;
        long c = 12;
        float h = 3f;
        double k = 2.58;
        System.out.println("Значение переменной a с типом byte равно" + " " + a);
        System.out.println("Значение переменной d с типом short равно" + " " + d);
        System.out.println("Значение переменной f с типом int равно" + " " + f);
        System.out.println("Значение переменной c с типом long равно" + " " + c);
        System.out.println("Значение переменной h с типом float равно" + " " + h);
        System.out.println("Значение переменной k с типом doubl равно" + " " + k);
        // Пишем код для задачи 1
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = -159;
        short d = 569;
        int f = 27897;
        long c = 987678965549l;
        float h = 27.12f;
        double k = 2.786;
        byte n = 67;
        System.out.println(a);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(h);
        System.out.println(k);
        System.out.println(n);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        int classCh = LP+AS+EA;
        System.out.println(classCh);
        short paper = 480;
        int paperclass = paper/classCh;
        System.out.println("На каждого ученика рассчитано" + " "+ paperclass + " " + "листов бумаги");

    }
    public static void task4() {
        System.out.println("Задача 4");
        byte a=16;
        int b=2;
        int oneMinute=a/b;
        int time=20;
        int overTime=time*oneMinute;
        System.out.println("За" + " " + time+ " " + "минут машина произвела" + " "+ overTime + " "+ "штук бутылок");
        int d=60;
        int k=d*oneMinute;
        int hour=24;
        int prod=hour*k;
        System.out.println("За" + " " + "сутки" + " " + " машина произвела" + " "+ prod + " "+ "штук бутылок");
        int vDay=24;
        int xDay=vDay*3;
        int zBB=480;
        int prod1=zBB*xDay;
        System.out.println("За" + " " + "3 дня" + " " + " машина произвела" + " "+ prod1 + " "+ "штук бутылок");
        int m=31;
        int x=m*hour*d;
        int prod2=x*oneMinute;
        System.out.println("За" + " " + "1 месяц" + " " + " машина произвела" + " "+ prod2 + " "+ "штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int a = 120;
        int c = 2;
        int b = 4;
        int class1 = c + b;
        int tt = a / class1;
        int z = tt * c;
        int v = tt * b;
        System.out.println("В школе, где" + " " + tt + " " + "классов, нужно" + " " + z + " " + "банок белой краски и"
                + " " + v + " " + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int a=5;
        int z=a*80;
        int b=2;
        int x=b*105;
        int c=2;
        int n=c*100;
        int m=4;
        int h=m*70;
        int tt=z+x+n+h;
        System.out.println(tt);
        float bb=tt/1000f;
        System.out.println(bb + " "+ "кг");}
    public static void task7() {
        System.out.println("Задача 7");
        int a=7;
        int b=250;
        int c=500;
        int z=1000;
        int x=z*a;
        int j=x/b;
        System.out.println(j + " "+ "дней уйдет на похудение,если спортсмен будет терять каждый день по 250 грамм");
        int k=x/c;
        System.out.println(k + " "+ "дней уйдет на похудение,если спортсмен будет терять каждый день по 500 грамм");}

    public static void task8() {
        System.out.println("Задача 8");
        int a=10;
        int b=67760;
        int c=83690;
        int d=76230;
        int aa=b/a+b;
        int bb=c/a+c;
        int dd=d/a+d;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(dd);
       // int w=(aa+bb+dd)*12;
       // int e=(c+b+d)*12;
       // int uu=w-e;
       // System.out.println(uu + " " + " - разница между годовым доходом после повышения");
        int b1=(aa*12)-(b*12);
        int c1= (bb*12)-(c*12);
        int d1=(dd*12)-(d*12);
        System.out.println("Маша теперь получает" + " "+ aa + " " + "рублей. Годовой доход вырос на"
                + " "+ b1+ " " +  "рублей");
        System.out.println("Маша теперь получает" + " "+ bb + " " + "рублей. Годовой доход вырос на"
                + " "+ c1+ " " +  "рублей");
        System.out.println("Маша теперь получает" + " "+ dd + " " + "рублей. Годовой доход вырос на"
                + " "+ d1+ " " +  "рублей");

}
}