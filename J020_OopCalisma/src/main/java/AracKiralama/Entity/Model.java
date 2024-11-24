package AracKiralama.Entity;

public class Model extends Arac{

    private String modelAdi;

    public Model(String modelAdi) {
        super();
        this.modelAdi = modelAdi;
    }

    public String getModelAdi() {
        return modelAdi;
    }
}
