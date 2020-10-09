/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoSO;

//import  java.lang.Thread.sleep;
import java.util.*;

/**
 *
 * @author Shetotis
 * 
 */
public class ControlMemoria extends Thread{
    boolean band;
    int tamaño;
    Grafico obj;
    public int recorre;
    public long ProsAtendidos=0;
    public int ocupada=0;
    public float PorcentajeOc=0;
    public float PorcentajeTot=0;
    public int ciclos=0;
    public int desperdicio=0;
    public static int k=0;
    //cola que lleva el control del planificador
    Queue<Integer> qe=new LinkedList<>();
    //lista que guarda a los procesos con su id, contabiliza el tiempo y las veces que han entrado al micro
    ArrayList<atencionProcesos> tiempo = new ArrayList<>();
    //levara el promedio de atencion por proceso de cada uno (tiempo/veces que entro)
    ArrayList<Float> promTiempoProceso = new ArrayList<>();
    
    //Recibe el objeto del main que contiene todos los datos proporcionados por el ussuario
    public ControlMemoria(Grafico obj) {
        super("Controla");
        this.obj=obj; //MUY IMPORTANTE, EL OBJETO RECIBIDO ES AHORA EL DE ESTA CLASE
        band=true;
        this.obj.Memoria.add(new Procesos(obj.tamañoMem,1)); //agrega  al array de memoria objeto anonimo
        tiempo.add(new atencionProcesos(0,0,0));
        start(); // salta al run
    }
}

   
class atencionProcesos
{
    protected int id, tiempo, iveces;

    public atencionProcesos(int id, int tiempo, int iveces) {
        this.id = id;
        this.tiempo = tiempo;
        this.iveces = iveces;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getIveces() {
        return iveces;
    }

    public void setIveces(int iveces) {
        this.iveces = iveces;
    }
    
}