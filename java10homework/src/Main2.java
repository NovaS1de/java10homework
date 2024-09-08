    // Базовый класс «Музыкальный инструмент»
    abstract class MusicalInstrument {
        protected String name;
        protected String characteristics;

        public MusicalInstrument(String name, String characteristics) {
            this.name = name;
            this.characteristics = characteristics;
        }

        public abstract void sound();
        public abstract void show();
        public abstract void desc();
        public abstract void history();
    }

    // Производные классы
    class Violin extends MusicalInstrument {
        public Violin(String name, String characteristics) {
            super(name, characteristics);
        }

        @Override
        public void sound() {
            System.out.println("Скрипка звучит: Ви-и-оли-оли!");
        }

        @Override
        public void show() {
            System.out.println("Музыкальный инструмент: " + name);
        }

        @Override
        public void desc() {
            System.out.println("Описание: " + characteristics);
        }

        @Override
        public void history() {
            System.out.println("История: Скрипка была изобретена в Италии в 16 веке.");
        }
    }

    class Trombone extends MusicalInstrument {
        public Trombone(String name, String characteristics) {
            super(name, characteristics);
        }

        @Override
        public void sound() {
            System.out.println("Тромбон звучит: Бум-бум!");
        }

        @Override
        public void show() {
            System.out.println("Музыкальный инструмент: " + name);
        }

        @Override
        public void desc() {
            System.out.println("Описание: " + characteristics);
        }

        @Override
        public void history() {
            System.out.println("История: Тромбон был изобретен в 15 веке в Европе.");
        }
    }

    class Ukulele extends MusicalInstrument {
        public Ukulele(String name, String characteristics) {
            super(name, characteristics);
        }

        @Override
        public void sound() {
            System.out.println("Укулеле звучит: Тинг-тинг!");
        }

        @Override
        public void show() {
            System.out.println("Музыкальный инструмент: " + name);
        }

        @Override
        public void desc() {
            System.out.println("Описание: " + characteristics);
        }

        @Override
        public void history() {
            System.out.println("История: Укулеле было придумано на Гавайях в 19 веке.");
        }
    }

    class Cello extends MusicalInstrument {
        public Cello(String name, String characteristics) {
            super(name, characteristics);
        }

        @Override
        public void sound() {
            System.out.println("Виолончель звучит: Вум-вум!");
        }

        @Override
        public void show() {
            System.out.println("Музыкальный инструмент: " + name);
        }

        @Override
        public void desc() {
            System.out.println("Описание: " + characteristics);
        }

        @Override
        public void history() {
            System.out.println("История: Виолончель появилась в 16 веке в Италии.");
        }
    }

    // Пример использования
    public class Main2 {
        public static void main(String[] args) {
            MusicalInstrument violin = new Violin("Скрипка", "Число струн: 4, тип древесины: ель");
            MusicalInstrument trombone = new Trombone("Тромбон", "Материал: латунь, тип: слайд-тромбон");
            MusicalInstrument ukulele = new Ukulele("Укулеле", "Число струн: 4, материал: дерево");
            MusicalInstrument cello = new Cello("Виолончель", "Число струн: 4, тип древесины: ель");

            violin.sound();
            violin.show();
            violin.desc();
            violin.history();
            System.out.println();

            trombone.sound();
            trombone.show();
            trombone.desc();
            trombone.history();
            System.out.println();

            ukulele.sound();
            ukulele.show();
            ukulele.desc();
            ukulele.history();
            System.out.println();

            cello.sound();
            cello.show();
            cello.desc();
            cello.history();
        }
    }