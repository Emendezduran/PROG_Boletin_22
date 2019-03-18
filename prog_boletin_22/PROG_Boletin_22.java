
package prog_boletin_22;

public class PROG_Boletin_22 {

    public static void main(String[] args) {
       
        Correo c1 = new Correo("hola");
        Correo c2 = new Correo("salu2");
        Correo c3 = new Correo("chao");

        Buzon buzon = new Buzon();
        buzon.agregar(c1, c2, c3);

        //Hay 3 sin leer
        System.out.println(buzon.noLeidos());

        //leemos el 1 y se marca leido
        System.out.println(buzon.muestraPrimerNoLeido());

        //leemos el 2 y se marca leido
        System.out.println(buzon.muestraPrimerNoLeido());

        //queda uno sin leer
        System.out.println(buzon.noLeidos());
        //lo eliminamos
        buzon.elimina(2);

        //no quedan correos sin leer
        System.out.println(buzon.noLeidos());

        //mostramos todos los correos
        System.out.println(buzon.muestra());

        //agregamos 3 correos mas
        Correo c4 = new Correo("Correo 4");
        Correo c5 = new Correo("Correo 5");
        Correo c6 = new Correo("Correo 6");
        buzon.agregar(c4, c5, c6);

        //mostramos todos los correos
        System.out.println(buzon.muestra());

        //eliminamos 1 correo
        buzon.elimina(2);

        //mostramos todos los correos
        System.out.println(buzon.muestra());
    }
    
}
