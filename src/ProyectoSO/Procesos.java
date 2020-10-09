/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoSO;

import java.util.Random;

/**
 *
 * @author Shetotis
 */
public class Procesos {
    public int cuantoPros;
    public int tamañoPros;
    public int idPros;
    public int ejecutadoPros;
    int posPros;
    int tam;

    public Procesos(int tamMem,int a) {//constructor de la memoria
        this.cuantoPros = 0;
        this.tamañoPros = tamMem;
        this.idPros = 0;
        this.ejecutadoPros=0;
        this.posPros=0;
        this.tam=0;
    }
    //crea
    public Procesos(int id,int tamMaxCuanto,int tamMaxProsMem) {//constructor de los procesos
        Random r=new Random();
        this.cuantoPros=(int)(r.nextDouble() * tamMaxCuanto)+1;
        this.tamañoPros =(int)((r.nextDouble() *tamMaxProsMem)+1);
        this.idPros = id+1;
        this.ejecutadoPros=0;
        this.posPros=0;
        this.tam=0;
    }

    public int getcuantoPros() {
        return cuantoPros;
    }

    public void setcuantoPros(int tiempo) {
        this.cuantoPros = tiempo;
    }

    public int getTamaño() {
        return tamañoPros;
    }

    public void setTamaño(int tamaño) {
        this.tamañoPros = tamaño;
    }

    public int getId() {
        return idPros;
    }

    public void setId(int id) {
        this.idPros = id;
    }
    
    
}
