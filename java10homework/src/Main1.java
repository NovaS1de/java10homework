    // Базовый класс «Устройство»
    abstract class Device {
        protected String name;
        protected String characteristics;

        public Device(String name, String characteristics) {
            this.name = name;
            this.characteristics = characteristics;
        }

        public abstract void sound();
        public abstract void show();
        public abstract void desc();
    }

    // Производные классы
    class Kettle extends Device {
        public Kettle(String name, String characteristics) {
            super(name, characteristics);
        }

        @Override
        public void sound() {
            System.out.println("Чайник звучит: Свисток!");
        }

        @Override
        public void show() {
            System.out.println("Устройство: " + name);
        }

        @Override
        public void desc() {
            System.out.println("Описание: " + characteristics);
        }
    }

    class Microwave extends Device {
        public Microwave(String name, String characteristics) {
            super(name, characteristics);
        }

        @Override
        public void sound() {
            System.out.println("Микроволновка звучит: Бип-бип!");
        }

        @Override
        public void show() {
            System.out.println("Устройство: " + name);
        }

        @Override
        public void desc() {
            System.out.println("Описание: " + characteristics);
        }
    }

    class Car extends Device {
        public Car(String name, String characteristics) {
            super(name, characteristics);
        }

        @Override
        public void sound() {
            System.out.println("Автомобиль звучит: Врум-врум!");
        }

        @Override
        public void show() {
            System.out.println("Устройство: " + name);
        }

        @Override
        public void desc() {
            System.out.println("Описание: " + characteristics);
        }
    }

    class Steamer extends Device {
        public Steamer(String name, String characteristics) {
            super(name, characteristics);
        }

        @Override
        public void sound() {
            System.out.println("Пароход звучит: У-у-у!");
        }

        @Override
        public void show() {
            System.out.println("Устройство: " + name);
        }

        @Override
        public void desc() {
            System.out.println("Описание: " + characteristics);
        }
    }

    // Пример использования
    public class Main1 {
        public static void main(String[] args) {
            Device kettle = new Kettle("Электрический чайник", "Мощность: 2200 Вт, объем: 1.7 л");
            Device microwave = new Microwave("СВЧ-микроволновка", "Мощность: 800 Вт, объем: 20 л");
            Device car = new Car("Седан", "Цвет: черный, мощность: 150 л.с.");
            Device steamer = new Steamer("Носовой пароход", "Длина: 50 м, скорость: 20 узлов");

            kettle.sound();
            kettle.show();
            kettle.desc();
            System.out.println();

            microwave.sound();
            microwave.show();
            microwave.desc();
            System.out.println();

            car.sound();
            car.show();
            car.desc();
            System.out.println();

            steamer.sound();
            steamer.show();
            steamer.desc();
        }
    }
