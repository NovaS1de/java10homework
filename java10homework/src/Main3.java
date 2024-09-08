// Абстрактный класс «Worker»
abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    public abstract void print();
}

// Производные классы
class President extends Worker {
    public President(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Президент: " + name);
    }
}

class Security extends Worker {
    public Security(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Охранник: " + name);
    }
}

class Manager extends Worker {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Менеджер: " + name);
    }
}

class Engineer extends Worker {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Инженер: " + name);
    }
}

// Пример использования
public class Main3 {
    public static void main(String[] args) {
        Worker president = new President("Иванов И.И.");
        Worker security = new Security("Петров П.П.");
        Worker manager = new Manager("Сидоров С.С.");
        Worker engineer = new Engineer("Кузнецов К.К.");

        president.print();
        security.print();
        manager.print();
        engineer.print();
    }
}