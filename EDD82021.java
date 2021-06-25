
package edd82021;

import java.util.ArrayList;

public class EDD82021 {

    
    public static void main(String[] args) {
        /*ArrayList <String> avengers = new ArrayList<String>();
        //add - para adicionar elementos
        avengers.add("Iroman");avengers.add("hulk");
        avengers.add("Cap. America");avengers.add("Thor");
        avengers.add("Ant man");avengers.add("Falcon");
        //tamaño de la lista
        System.out.println("El tamaño de la lista de heroes es: "
                +avengers.size());
        
        //obtener elemento de la lista
        System.out.println("El heroe de la posicion 2 es: "
                +avengers.get(2));
        
        //eliminar objeto o dato de la lista
        avengers.remove(2);
        
        //obtener elemento de la lista
        System.out.println("El heroe de la posicion 2 es: "
                +avengers.get(2));
        
        //buscar elemento 
        System.out.println("Buscando..."+avengers.contains("Thor"));
        
        //si esta vacio
        System.out.println("Esta vacio?? "+avengers.isEmpty());
        
        //limpiar la lista
        System.out.println("Limpiando lista...");
        avengers.clear();
        
        //si esta vacio
        System.out.println("Esta vacio?? "+avengers.isEmpty());
*/
        
        //arraylist con objetos
        
        ArrayList <Heroe> avengers = new ArrayList<Heroe>();
        avengers.add(new Heroe("Hulk", "Destruccion", 1));
        avengers.add(new Heroe("Cap America", "Destruccion", 2));
        avengers.add(new Heroe("Falcon", "Destruccion", 5));
        
        System.out.println("Heroe de la posicion 2 "
                +avengers.get(2).getNombre()+" con poder "
                +avengers.get(2).getPoder());
    }
    
}
