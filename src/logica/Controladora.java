
package logica;

import persistencia.ControladoraPersistencia;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Se crean los metodos necesarios para crear registros en la base de datos
   public void crearPerro(String numCliente, String nombrePerro, String raza, String color, boolean alergico, boolean atenEspecial, String nombreDuenio, String celularDuenio, String observaciones)
   {
       Perro perro = new Perro(numCliente, nombrePerro, raza, color, alergico, atenEspecial, nombreDuenio, celularDuenio, observaciones);
       controlPersis.crearPerro(perro);
   }
    public void crearPerro(Perro perro)
    {
        controlPersis.crearPerro(perro);
    }
 }
