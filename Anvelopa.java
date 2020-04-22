public class Anvelopa {
    private String nume; //necesar
    private String tip;  //necesar
    private int stocI;   //necesar
    private int vandut;	 //optional
    private int pretUnit; //necesar
    //idea folosirii constructorilor telescopici
    public Anvelopa(String nume,String tip, int stocI, int pretUnit){
        this(nume, tip, stocI, pretUnit,0);
    }
    public Anvelopa(String nume,String tip, int stocI, int pretUnit, int vandut) {
        this.nume=nume;
        this.tip=tip;
        this.stocI=stocI;
        this.pretUnit=pretUnit;
        this.vandut=vandut;
    }
    //getari si setari
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public int getStocI() {
        return stocI;
    }
    public void setStocI(int stocI) {
        this.stocI = stocI;
    }
    public int getVandut() {
        return vandut;
    }
    public void setVandut(int vandut) {
        this.vandut = vandut;
    }
    public int getPretUnit() {
        return pretUnit;
    }
    public void setPretUnit(int pretUnit) {
        this.pretUnit = pretUnit;
    }



}
