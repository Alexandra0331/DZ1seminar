//На основе кода с урока добавить еще один класс продукта, (Молоко, шоколад ,и т.п., можно добавить несколько классов),
// они должны наследоваться от класса Product, надо переопределить метод toString
// и попробовать включить эти классы в VendingMachine, вывести список товаров из VendingMachine

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Product("Mars", 70));
        machine.addProduct(new Product("Twix", 70.99));
        machine.addProduct(new Product("Алёнка", 90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Коровка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Василёк", 85, new Date(2023, 1, 25)));
        machine.addProduct(new confetionery("Торт", "12", "20"));


        //confetionery confetionery = new confetionery("Торт", "12", "20");
        //System.out.println(confetionery);   //другой вариант вывода confetionery[name='Торт', amountOfCarbohydrates='12', amountOfProtein=20]



        // System.out.println("__________________________________");
        // System.out.println(machine.findProduct("Молоко"));
        //  System.out.println(machine.findProduct("Алёнка"));
        // System.out.println(machine.findProduct("Alenka"));
        //  System.out.println("__________________________________");
        //System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        // System.out.println("__________________________________");

        System.out.println(machine);
        /*наименование Lays цена 100,000000 дата загрузки 2023-02-20
        наименование Mars цена 70,000000 дата загрузки 2023-02-20
        наименование Twix цена 70,990000 дата загрузки 2023-02-20
        наименование Алёнка цена 90,000000 дата загрузки 2023-02-20
        наименование Колокольчик цена 85,000000 дата загрузки 2023-02-20
        наименование Молоко Бурёнка цена 85,000000 дата загрузки 2023-02-20 годен до 3923-02-25
        наименование Молоко Коровка цена 85,000000 дата загрузки 2023-02-20 годен до 3923-02-25
        наименование Молоко Василёк цена 85,000000 дата загрузки 2023-02-20 годен до 3923-02-25
        cсonfetionery[name='Торт', amountOfCarbohydrates='12', amountOfProtein=20]*/


    }
}





