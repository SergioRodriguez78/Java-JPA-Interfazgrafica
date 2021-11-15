
package logica;

import igu.Principal;

/**
 *
 * @author Sergio Rodriguez
 */
public class TPO2 {

    
    public static void main(String[] args) {
        //Se inicia la controladora y la ventana para la creacion de la bases de datos y la igu
        Controladora control= new Controladora();
        Principal ventana= new Principal(control);
        
        //Se acomodan parametros de visibiliad de la pantalla y posicion
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        
    }

    
    
}
