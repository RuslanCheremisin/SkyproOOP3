import animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;

public class SkyproOOP3 {
    public static void main(String[] args) {



        System.out.println("Задание 1-2");


        Car benz = new Car("Mercedes-Benz", "G-wagon", 2012, "Germany", "Black", 240);
        System.out.println(benz);
        benz.refill("Gasoline");


        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", 301, 3500, 5, "Белорусский вокзал", "Минск-Пассажирский", 11);
        lastochka.refill("Diesel");
        System.out.println(lastochka);

        Train leningrad = new Train("Ленинград", "D-125", 2019,"Россия", 270, 1700, 7,"Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(leningrad);

        Bus ikarus250 = new Bus("Ikarus", "250", 1999, "Hungary", "Red and White", 120);
        ikarus250.refill("Electricity");
        System.out.println(ikarus250);

        Bus zhongTong = new Bus("Zhong Tong", "Cruise 6107H", 2019, "China", "Gold metallic", 120);
        System.out.println(zhongTong);

        Bus laz699 = new Bus("LAZ", "699A", 1966, "USSR", "White", 102);
        System.out.println(laz699);

        System.out.println("Задание 3");

        Herbivores gazelleGazik = new Herbivores("Газель","Газик", 12, "савана", 55, "трава, кустарники");
        Herbivores Rafik = new Herbivores("Жираф","Рафик",15,"Мадагаскар",50,"Листва, трава");
        Herbivores horseSpirit = new Herbivores("Лошадь","Спирит", 17, "степь", 70, "трава, овощи, фрукты");

        Carnivores Ed = new Carnivores("Гиена","Эд", 10, "Африка", 35, "мясо, падаль");
        Carnivores tigerAmur = new Carnivores("Тигр","Амур", 35, "Манчжурия", 50, "мясо");
        Carnivores bearBaloo = new Carnivores("Медведь","Балу", 40, "тайга", 45, "мясо, рыба, ягоды, мёд");

        Amphibians frogPrincess = new Amphibians("Лягушка","Принцесса", 3, "болото");
        Amphibians ratSnakeIron = new Amphibians("Уж","Утюг", 2, "Смешанный лес");

        Flightless peacockPasha = new Flightless("Павлин","Паша", 12, "Индия", "Вальяжная походка");
        Flightless penguinPenPen = new Flightless("Пингвин","Pen-pen", 5, "Tokyo-3", "шлёпает по квартире");
        Flightless dodoDodik = new Flightless("Птица До-До","Додик", 2, "Маврикий", "смело, уверенно, пешком");

        Flying seagullStupid = new Flying("Чайка","Дура", 4, "побережье Тихого Океана", "полёт, плавание");
        Flying greatAlbatrossAlba = new Flying("Альбатрос","Альба", 5, "побережье Тихого Океана", "полёт, плавание");
        Flying hawkRustam = new Flying("Сокол","Рустам", 7, "Кавказ", "полёт на высокой скорости и большой высоте");

        System.out.println(gazelleGazik+""+Rafik+""+horseSpirit);
        System.out.println(Ed+""+tigerAmur+""+bearBaloo);
        System.out.println(frogPrincess+""+ratSnakeIron);
        System.out.println(peacockPasha+""+penguinPenPen+""+dodoDodik);
        System.out.println(seagullStupid+""+greatAlbatrossAlba+""+hawkRustam);

        peacockPasha.walk();
        seagullStupid.fly();
        bearBaloo.eat();
        tigerAmur.hunt();
        frogPrincess.hunt();



    }




//    газель, жираф, лошадь
//    гиена, тигр, медведь
//    лягушка, уж
//    павлин, пингвин, додо
//    чайка, альбатрос, сокол

    public static class ValidateUtil {
        public static String validateString(String value) {
            if (value!=null && !value.isEmpty() && !value.isBlank()) {
                return value;
            }else{
                return "Incorrect entry";
            }
        }

        public static int validateInt(int value) {
            if (value > 0) {
                return value;
            } else {
                return 0;
            }
        }
    }
}
