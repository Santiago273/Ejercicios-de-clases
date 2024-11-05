public class Planeta {
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private Tipo tipo;
    private int distanciaSol;
    private boolean observable = false;
    private int periodoOrbital;
    private double periodoRotacion;

    public Planeta() {
    }

    public Planeta(String nombre, int satelites, double masaKg, double volumenKmCubicos, int diametroKm, Tipo tipo, int distanciaSol, boolean observable, int periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = satelites;
        this.masa = masaKg;
        this.volumen = volumenKmCubicos;
        this.diametro = diametroKm;
        this.tipo = tipo;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public int getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(int periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public void imprimir() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Satelites: "+cantidadSatelites);
        System.out.println("Masa: "+masa+" kg");
        System.out.println("Volumen: "+volumen+" km3");
        System.out.println("Diametro: "+diametro+" km");
        System.out.println("Tipo: "+tipo);
        System.out.println("Distancia al sol: "+distanciaSol);
        System.out.println("Es observable: "+observable);
        System.out.println("Periodo Orbital: "+periodoOrbital+" años");
        System.out.println("Periodo de rotacion: "+periodoRotacion+" dias");
    }

    public double calcularDensidad(){
        double d = masa/volumen;
        return d;
    }

    public boolean esPlanetaExterior(){
        if(distanciaSol < 149597870*3.4){
            return false;
        }
        return true;
    }


}
