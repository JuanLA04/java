
package Controlador;

import Modelo.Arreglo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    
    private Vista vi;
    private Arreglo mo;
    
     public Controlador (Vista vi , Arreglo mo ){
         this.vi=vi;
         this.mo=mo;
         this.vi.btnAgregar.addActionListener(this);
         this.vi.btnMostrar.addActionListener(this);
        
         
     }

     public void Iniciar() {
        vi.setTitle("INGRESOS DE ESTUDIANTES...");
        vi.setLocationRelativeTo(null);
    }
     
     public void AgregarNumero(){
         
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
}
