/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.correcionmediociclo.modelo;

/**
 *
 * @author mundo
 */
public class GestorProductos {
    
    int tamanoVector = 5;
    Productos[] tareas = new Productos[tamanoVector];
    int cont = 0;

    public String agregarTarea(Productos tarea) {
        String msg = "Ingreso exitoso";
        if (tareas.length != cont) {
            for (int i = 0; i < tareas.length; i++) {
                if (tareas[i] == null) {
                    //inicializar el objeto
                    tareas[i] = new Productos();
                    tareas[i].setId(i);
                    tareas[i].setTitulo(tarea.getTitulo());
                    tareas[i].setDescripcion(tarea.getDescripcion());
                    tareas[i].setEstado(tarea.getEstado());
                    cont++;
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }
        public Productos[] listarTareas() {

        Productos[] auxTareas = new Productos[tamanoVector];
        for (int i = 0; i < cont; i++) {

            auxTareas[i] = new Productos();
            auxTareas[i].setId(tareas[i].getId());
            auxTareas[i].setTitulo(tareas[i].getTitulo());
            auxTareas[i].setDescripcion(tareas[i].getDescripcion());
            auxTareas[i].setEstado(tareas[i].getEstado());
            System.out.println("Modelo-listarTarea" + auxTareas[i].getEstado());
        }
        return auxTareas;
    }
}
