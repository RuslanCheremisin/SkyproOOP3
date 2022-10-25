public class SkyproOOP3 {
    public static void main(String[] args) {

//        Transport transport = new Transport("Brand", "Model", 1999, "Uganda", "Camo", 200);
//        System.out.println(transport);

        Car benz = new Car("Mercedes-Benz", "G-wagon", 2012, "Germany", "Black", 240);
        System.out.println(benz);
        benz.refill("Gasoline");


        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", 301, 3500, 5, "Белорусский вокзал", "Минск-Пассажирский", 11);
        lastochka.refill("Diesel");
        System.out.println(lastochka);

        Train leningrad = new Train("Ленинград", "D-125", 2019,"Россия", 270, 1700, 7,"Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(leningrad);

        Bus ikarus250 = new Bus("Ikarus", "250", 1999, "Hungary", "Red and White", 120);
        System.out.println(ikarus250);

        Bus zhongTong = new Bus("Zhong Tong", "Cruise 6107H", 2019, "China", "Gold metallic", 120);
        System.out.println(zhongTong);

        Bus laz699 = new Bus("LAZ", "699A", 1966, "USSR", "White", 102);
        System.out.println(laz699);
    }
}
