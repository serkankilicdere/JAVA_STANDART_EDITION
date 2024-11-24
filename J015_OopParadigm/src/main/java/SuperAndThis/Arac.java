package SuperAndThis;

import java.util.UUID;

public class Arac {
    private String uuid;
    public String yakitTuru;
    public int kapasite;
    public int hiz;

    public Arac(){
        uuid= UUID.randomUUID().toString();
    }
    public String getUuid(){
        return uuid;
    }

}
