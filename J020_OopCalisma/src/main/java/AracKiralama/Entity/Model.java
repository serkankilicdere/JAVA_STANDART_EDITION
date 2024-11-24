package AracKiralama.Entity;

public class Model extends Arac{

    private String modelAdi;

    public Model(String modelAdi ) {

        this.modelAdi = modelAdi;
    }

    public String getModelAdi() {
        return modelAdi;
    }
}
