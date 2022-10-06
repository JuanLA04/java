
package Modelo;


public class Arreglo {
    
    private int arreglo[];

    public Arreglo(int tam) {
        this.arreglo = new int [tam];
        
    }

    public int getArreglo(int pos) {
        return arreglo[pos];
    }

    public void setArreglo(int pos , int dato) {
        this.arreglo[pos] = dato;
    }
    
    public String Mostrar(){
        String msj ="Contenido del arreglo\n";
        for (int a = 0; a < this.arreglo.length;a++){
            msj += "Elemento dela posicion"+a+"->"+getArreglo(a);
        }
        return msj;
    }
}
