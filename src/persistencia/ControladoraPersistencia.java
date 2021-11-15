package persistencia;

import logica.Perro;


public class ControladoraPersistencia {

    PerroJpaController perroJPA= new PerroJpaController();
    public ControladoraPersistencia() {
    }

    //Debido a que el ejercicio solamente solicita el create, no se añaden los demas metodos del CRUD
    public void crearPerro(Perro perro)
    {
        try {
            perroJPA.create(perro);
        } catch (Exception e) {
            System.out.println("Existe un problema con el objeto que se entrego y no se permite crear");
        }
        
    }
    
    
}
