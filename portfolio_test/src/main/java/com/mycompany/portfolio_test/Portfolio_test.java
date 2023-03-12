package com.mycompany.portfolio_test;

import java.util.ArrayList;

/**
 *
 * @author pollo
 */
public class Portfolio_test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        //Creamos una persona e imprimimos varios datos de ella
        Persona facu = new Persona(1,"Facundo Sharry", 21,
                "Fullstack developer junior" ,
                "Computer Science student at FaMAF-UNC",
                "Cordoba, Argentina", "(+54 9) 3547-563095",
                "facundo.sharry@gmail.com", "../assets/perfil3.png",
                null,null);
	System.out.println(facu.getName() + ' ' + facu.getAge());
        System.out.println(facu.toString());
        
        //Creamos una experiencia laboral y la asociamos a la persona
        Experiencia_Laboral repair = new Experiencia_Laboral(1, "Armado y reparacion de PC", null, null, "Instalación de OS, software, conexión de cables/componentes, atención al ciente, caja, diseño gráfico y publicidad", "Patricio Ferreira 351 5452149", 2017, 2023);
        ArrayList<Experiencia_Laboral> exps = new ArrayList<Experiencia_Laboral> ();
        exps.add(repair);
        
        facu.setExperiencias(exps);
        
        //Volvemos a imprimir los datos de la persona para ver como cambia
        System.out.println(facu.getName() + " de " + facu.getAge() + "años, tiene las siguientes experiencias laborales: " + facu.getExperiencias().toString());
        
    }
}
