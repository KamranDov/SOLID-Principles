package SingleResponsibility;

public class Hotel {
   public static final String HOTEL_NAME = "KOMPAS";
   public static final String HOTEL_ADDRESS = null;

    public double roomsPrices(double roomsPrices) {
        return roomsPrices;
    }

}
/*S.O.L.I.D. Principles
 *1)Single Responsibility Principle - O demekdir ki her class ozunde bir xususiyyet dasimalidir. Yeni nece
 * aciqlayaq. Misalcun bir classmiz var Hotel adinda ve bu classin icinde yuxarda gorduyumuz kimi 4 xususiyeti var.
 * S herfinde bir classin var yeni 4 metodu var ve bizde demisdik ki SOLID prinsipne uygun olaraq 1-classin bir
 * xususiyeti olmalidir. Ama yuxarda gorunduyu kimi biz bu SOLID-in S herfinin prinsipine uygun kod yazmiriq.
 * Ona gore hele bu paketin icinde sekil var onu diyagramda cekmisem ki bu prinsipe ygun kodu nece yazmaliyiq.
 * Hemin bu sekile baxib biz bu prinsipi basa duse bilerik.*/