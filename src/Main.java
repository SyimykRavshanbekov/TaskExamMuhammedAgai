import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog(1, "Sharik", 3, 100, true);
        Dog dog2 = new Dog(12, "Jolbors", 3, 100, true);

        Cat cat1 = new Cat(123, "Cat1", 2, 10, true);
        Cat cat2 = new Cat(1234, "Cat1", 4, 5, true);

        Eagle eagle1 = new Eagle(12345, "Eagle1", 4, 5, false);
        Eagle eagle2 = new Eagle(123456, "Eagle2", 3, 5, false);
        Eagle eagle3 = new Eagle(1234567, "Eagle3", 4, 5, false);
        Eagle eagle4 = new Eagle(12345678, "Eagle4", 6, 5, false);
        Eagle eagle5 = new Eagle(123456789, "Eagle5", 10, 5, false);
        Eagle eagle6 = new Eagle(747456, "Eagle6", 9, 5, false);

        WhiteSwan whiteSwan1 = new WhiteSwan(8346, "WhiteSwan1", 4, 5, false);
        WhiteSwan whiteSwan2 = new WhiteSwan(626524, "WhiteSwan2", 4, 5, false);
        WhiteSwan whiteSwan3 = new WhiteSwan(83426546, "WhiteSwan3", 4, 5, false);
        WhiteSwan whiteSwan4 = new WhiteSwan(8343566, "WhiteSwan4", 4, 5, false);
        WhiteSwan whiteSwan5 = new WhiteSwan(8345346, "WhiteSwan5", 4, 5, false);

        Bird bird1 = new Bird(852, "Bird1", 4, 5, false);
        Bird bird2 = new Bird(456, "Bird1", 4, 5, false);
        Bird bird3 = new Bird(9541, "Bird1", 4, 5, false);
        
        Animal[] animals = {dog, dog2, cat1, cat2, dog2, eagle1, eagle2, eagle3, eagle4, eagle5, eagle6, whiteSwan1, whiteSwan2, whiteSwan3, whiteSwan4, whiteSwan5, bird1, bird2, bird3};
        Animal[] animalsFlyable = {eagle1, eagle2, eagle3, eagle4, eagle5, eagle6, whiteSwan1, whiteSwan2, whiteSwan3, whiteSwan4, whiteSwan5, bird1, bird2, bird3};
        Animal[] animalsNotFlyable = {dog, dog2, cat1, cat2};
//        Animal[] animalsFlyable = new Animal[14];
//        int counter1 = 0;
//        Animal[] animalsNotFlyable = new Animal[4];
//        int counter2 = 0;
//        for (int i = 0; i < animals.length; i++) {
//            if (animals[i].getClass().isInterface()) {
//                animals[counter1] = animalsFlyable[counter1];
//                counter1++;
//            }
//            else {
//                animalsNotFlyable[counter2] = animalsFlyable[counter2];
//                counter2++;
//            }
//        }

        Animal[] asansAnimal = {cat1, dog, eagle1 ,eagle2, eagle3, eagle4, eagle5, whiteSwan1, whiteSwan2, whiteSwan3, bird1, bird2};
        Animal[] usonAnimal = {cat1, dog, dog2, eagle1 ,eagle2, eagle3, eagle4, whiteSwan1, whiteSwan2, bird1, bird2, bird3};
        Animal[] adylAnimal = {cat1, cat2, dog, eagle1 ,eagle2, eagle3, eagle4, eagle5, eagle6, whiteSwan1, whiteSwan2, whiteSwan3, whiteSwan4, whiteSwan5, bird1, bird2};

        Airplane airplane1 = new Airplane(7894, "Emirates", "e-23", 2019);
        Airplane airplane2 = new Airplane(6987, "Qatar", "hg777", 2020);

        Bayraktar bayraktar = new Bayraktar(8645, "Kyrgyz", "agfd", 2021);

        Tank tank1 = new Tank(8645, "T-32", "agfd", 2019);
        Tank tank2 = new Tank(3215, "T-56", "qwerty", 2022);
        Tank tank3 = new Tank(7412, "T-21", "houtr", 2021);

        Helicopter helicopter1 = new Helicopter(358, "H-78", "hel21", 2021);
        Helicopter helicopter2 = new Helicopter(265, "H-35", "hel22", 2021);
        Helicopter helicopter3 = new Helicopter(354654, "H-85", "hel23", 2021);
        Helicopter helicopter4 = new Helicopter(7412, "H-67", "hel24", 2021);
        Helicopter helicopter5 = new Helicopter(3549, "H-09", "hel25", 2021);

        Sidan sidan = new Sidan(32, "S-09", "sidan007", 2021);
        
        Technique[] techniques = {airplane1, airplane2, bayraktar, tank1, tank2, tank3, helicopter1, helicopter2, helicopter3, helicopter4, helicopter5, sidan};
        Technique[] techniquesNotFlyable = {tank1, tank2, tank3, sidan};
        Technique[] techniquesFlyable = {airplane1, airplane2, bayraktar, helicopter1, helicopter2, helicopter3, helicopter4, helicopter5};
//        Technique[] techniquesNotFlyable = new Technique[4];
//        int index1 = 0;
//        Technique[] techniquesFlyable = new Technique[8];
//        int index2 = 0;
//        for (int i = 0; i < techniques.length; i++) {
//            if (techniques[i].getClass().isInterface()) {
//                techniques[index1] = techniquesFlyable[index1];
//                index1++;
//            }
//             else {
//                techniques[index2] = techniquesNotFlyable[index2];
//                index2++;
//            }
//        }


        Technique[] asansTechnika = {airplane1, airplane2, bayraktar};
        Technique[] usonTechnika = {tank1, tank2, tank3, helicopter1, helicopter2, helicopter3, helicopter4, helicopter5};
        Technique[] adylTechnika = {sidan, bayraktar};

        Person asan = new Person(57335, "Asan", 20, asansAnimal, asansTechnika);
        Person uson = new Person(856, "Uson", 43, usonAnimal, usonTechnika);
        Person adyl = new Person(34567, "Adyl", 25, adylAnimal, adylTechnika);

//        String name = scanner.nextLine();
//
//        switch (name){
//            case "Asan" -> getInformation(asan);
//            case "Uson" -> getInformation(uson);
//            case "Adyl" -> getInformation(adyl);
//            default -> System.out.println("Error name");
//        }

        getRandom(techniquesNotFlyable, techniquesFlyable, animalsFlyable, animalsNotFlyable);

    }

    static void getInformation(Person person){
        person.getAnimal();
        person.getTechnik();
    }
    
    static void getRandom(Technique[] techniquesNotFlyable, Technique[] techniquesFlyable,Animal[] animalsFlyable,Animal[] animalsNotFlyable){
        Random random = new Random();
        int b = random.nextInt(4);
        if (b==0){
            System.out.println("\n--------------Уча ала турган техника-----------------");
            for (int i = 0; i < techniquesFlyable.length; i++) {
                int a = random.nextInt(techniquesFlyable.length);
                System.out.println(techniquesFlyable[a]);
                techniquesFlyable[a].capacity();
                techniquesFlyable[a].oil();
            }
        }else if (b == 1){
            System.out.println("\n--------------Учалбайт техника-----------------");
            for (int i = 0; i < techniquesNotFlyable.length; i++) {
                int a = random.nextInt(techniquesNotFlyable.length);
                System.out.println(techniquesNotFlyable[a]);
                techniquesNotFlyable[a].capacity();
                techniquesNotFlyable[a].oil();
            }
        } else if (b == 2){
            System.out.println("\n--------------Уча ала турган жаныбар-----------------");
            for (int i = 0; i < animalsFlyable.length; i++) {
                int a = random.nextInt(animalsFlyable.length);
                System.out.println(animalsFlyable[a]);
                animalsFlyable[a].eats();
                animalsFlyable[a].heLive();
            }
        } else {
            System.out.println("\n--------------Учалбайт жаныбар-----------------");
            for (int i = 0; i < animalsNotFlyable.length; i++) {
                int a = random.nextInt(animalsNotFlyable.length);
                System.out.println(animalsNotFlyable[a]);
                animalsNotFlyable[a].eats();
                animalsNotFlyable[a].heLive();
            }
        }
    }
}