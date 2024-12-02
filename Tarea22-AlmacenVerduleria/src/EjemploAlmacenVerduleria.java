public class EjemploAlmacenVerduleria {
    public static void main(String[] args) {

        Producto[] almacen = new Producto[8];

        Lacteo leche = new Lacteo("Leche", 1.20, 6, 13);
        almacen[0] = leche;
        Lacteo kefir = new Lacteo("Kefir", 1.5, 2, 10);
        almacen[1] = kefir;

        Fruta naranja = new Fruta("Naranja", 0.8, 130, "Naranja");
        almacen[2] = naranja;
        Fruta manzana = new Fruta("Manzana", 0.65, 100, "Verde");
        almacen[3] = manzana;

        Limpieza kh7 = new Limpieza("KH7", 2, "Desengrasante, desinfectante", 1);
        almacen[4] = kh7;
        Limpieza lejia = new Limpieza("Lejía", 1.5, "Hipoclorito de Sodio", 1);
        almacen[5] = lejia;

        NoPerecible miel = new NoPerecible("Miel", 7, 100, 304);
        almacen[6] = miel;
        NoPerecible sal = new NoPerecible("Sal", 3, 500, 0);
        almacen[7] = sal;

        System.out.println("--------   PRODUCTOS   --------");
        for (Producto p: almacen){
            System.out.println(p.toString());
            System.out.println("------------------------------");
        }
    }
}
