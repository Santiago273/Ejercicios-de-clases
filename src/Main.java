public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Jorge", "Lopez", "12004635",1960, "Argentina",'M');
        p1.imprimir();

        Planeta planeta1 = new Planeta("Tierra",1,59736E24,108321E12,12742, Tipo.TERRESTRE,150000000,true, 1,1);
        Planeta planeta2 = new Planeta("Jupiter", 1, 1899E27, 14313E15, 139820,  Tipo.GASEOSO, 750000000,true, 12, 0.41);

        planeta1.imprimir();
        System.out.println("La densidad del planeta es de: "+planeta1.calcularDensidad()+" kg/km3");
        if(planeta1.esPlanetaExterior()){
            System.out.println("El planeta es Externo");
        }else {
            System.out.println("El planeta es interno");
        }
        System.out.println();
        planeta2.imprimir();
        System.out.println("La densidad del planeta es de: "+planeta2.calcularDensidad()+" kg/km3");
        if(planeta2.esPlanetaExterior()){
            System.out.println("El planeta es Externo");
        }else {
            System.out.println("El planeta es interno");
        }

    }
}
