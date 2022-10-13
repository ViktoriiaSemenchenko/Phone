package ua.com.toryzhel.phone;

/**
 * Класс Phone.
 * Создайте класс Phone, который содержит переменные number, model и diagonal.
 * Создайте три экземпляра этого класса.
 * Выведите на консоль значения их переменных.
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 * Добавить конструктор в класс Phone,
 * который принимает на вход три параметра для инициализации переменных класса - number, model и diagonal.
 * Добавить конструктор, который принимает на вход два параметра
 * для инициализации переменных класса - number, model.
 * Добавить конструктор без параметров.
 * Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * Добавьте перегруженный метод receiveCall, который принимает
 * два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
 * Создать метод sendMessage с аргументами переменной длины.
 * Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 * Метод выводит на консоль номера этих телефонов.
 * Изменить класс Phone в соответствии с концепцией JavaBean.
 *
 * @author Semenchenko V.
 */

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("IPhone", "+380991234567", 6.7);
        Phone phone2 = new Phone( "Samsung", "+380661234567");
        Phone phone3 = new Phone();

        System.out.println(phone1.getNumber() + " " + phone1.getModel() + " " + phone1.getDiagonal());
        System.out.println(phone2.getNumber() + " " + phone2.getModel() + " " + phone2.getDiagonal());
        System.out.println(phone3.getNumber() + " " + phone3.getModel() + " " + phone3.getDiagonal());

        phone1.receiveCall("Mommy");
        phone2.receiveCall("Daddy", "+380501287345");

        phone3.sendMessage("'Hello World!' ", "+380826664670", "+380163682641");
        phone1.sendMessage("'Hi!' ", "+380735373210");
    }
}
