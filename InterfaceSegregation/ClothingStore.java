package InterfaceSegregation;

public class ClothingStore implements CallCenter, EmailAdress, ProductPrice, Delivery {
    @Override
    public String call() {
        return "Elaqe nomresi: +994 70 223 71 17";
    }

    @Override
    public String mail() {
        return "Bizim mail adresimiz: Style@gmail.com";
    }

    @Override
    public String prices() {
        return "Seciminizi edin:\n" +
                "1.Qadin geyimleri:\n" +
                "2.Kisi geyimleri:\n" +
                "3.Usaq geyimleri:";
    }

    @Override
    public String takeOver() {
        return ("Mehsulu tehvil aldim");
    }

    @Override
    public String handOver() {
        return ("Meshulu tehvil verdim");

    }
}
