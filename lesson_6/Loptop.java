package lesson_6;
/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих*/
public class Loptop {
    private String creator;
    private String name;
    private String ozy;
    private String  hd;
    private String os;
    private String color;
    private String  cost;

    public Loptop (String creator, String name,String ozy,String hd,String cost,String os,String color){
        this.creator = creator;
        this.name = name;
        this.ozy = ozy;
        this.hd = hd;
        this.cost = cost;
        this.os = os;
        this.color = color;
        
    }
    

    @Override
    public String toString() {
        
        return name + " " + color + " " + cost + " " + os + " " + hd + " " +ozy;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getCost() {
        return cost;
    }
    public String getCreator() {
        return creator;
    }
    public String getHd() {
        return hd;
    }
    public String getOs() {
        return os;
    }
    public String getOzy() {
        return ozy;
    }
}
