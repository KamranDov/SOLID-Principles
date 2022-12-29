package InterfaceSegregation;

import java.security.SecureRandom;

public class Market implements CallCenter, EmailAdress, ProductPrice, Delivery{


    @Override
    public String call() {
        return "Elaqe nomresi: *114";
    }

    @Override
    public String mail() {
        return "Bizim mail adresimiz: Tacmarket@gmail.com";
    }

    @Override
    public String prices() {
        return "Mehsulu secin: ";
    }

    @Override
    public String takeOver() {
       return ("Sifarisi qebul etdim. Mehsulu marketden goturdum");
    }

    @Override
    public String handOver() {
        return ("Sifarisi adresse catdirdim");

    }
}
