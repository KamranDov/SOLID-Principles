package InterfaceSegregation;

public class Test {
    public static void main(String[] args) {
        Restoran restoran = new Restoran();
        System.out.println("Beef Steak Xos Gelmisiniz!!!");
        System.out.println(restoran.call());
        System.out.println(restoran.mail());
        System.out.println(restoran.prices());
        System.out.println(restoran.takeOver());
        System.out.println(restoran.handOver());
        System.out.println("----------------------------------------------------------------");

        Market market = new Market();
        System.out.println("Tac Markete Xos Gelmisiniz!!!");
        System.out.println(market.call());
        System.out.println(market.mail());
        System.out.println(market.prices());
        System.out.println(market.takeOver());
        System.out.println(market.handOver());
        System.out.println("----------------------------------------------------------------");

        ClothingStore store = new ClothingStore();
        System.out.println("Style Geyim Magazasina Xos Gelmisiniz!!!");
        System.out.println(store.call());
        System.out.println(store.mail());
        System.out.println(store.prices());
        System.out.println(store.takeOver());
        System.out.println(store.handOver());
        System.out.println("----------------------------------------------------------------");

        BarberShop barberShop = new BarberShop();
        System.out.println("Man-Hair Salonuna Xos Gelmisiniz!!!");
        System.out.println(barberShop.call());

    }
}
