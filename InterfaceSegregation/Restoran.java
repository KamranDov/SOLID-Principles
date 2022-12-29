package InterfaceSegregation;

public class Restoran implements CallCenter, EmailAdress, ProductPrice, Delivery {

    @Override
    public String call() {
                return "Elaqe nomresi: +994 55 414 52 25";
    }

    @Override
    public String mail() {
        return "Bizim email adresimiz: BeefSteak@gmail.com";
    }

    @Override
    public String prices() {
        return "Budcenizi qeyd edin!. Biz ona uygun mehsullarimizi size gosterek!";
    }

    @Override
    public String takeOver() {
        return ("Sifarisi qebul etdim");
    }

    @Override
    public String handOver() {
        return ("Mehsulu sahibine tevil verdim ");

    }
}
