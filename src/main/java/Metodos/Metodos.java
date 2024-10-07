/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Cita.Cita;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author tracs
 */
public class Metodos {
    
    Vector VPrincipal = new Vector();
    
    public void Guardar(Cita UnaCita){
        VPrincipal.addElement(UnaCita);
    }
    
    public void GuardarArchivo(Cita cita){
        try{
            
            FileWriter fw = new FileWriter("Citas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw); 
            
            pw.print("|"+cita.getNombre());
            pw.print("|"+cita.getFecha());
            pw.print("|"+cita.getMotivo());
            pw.println("|"+cita.getDescripcion());
            pw.close();
            
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public DefaultTableModel listaCitas(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Fecha");
        cabeceras.addElement("Motivo");
        cabeceras.addElement("Descripcion");
        
        DefaultTableModel Tabla = new DefaultTableModel(cabeceras,0);
        
        try {
            FileReader fr = new FileReader("Citas.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer data = new StringTokenizer(d,"|");
                Vector vv = new Vector();
                while(data.hasMoreTokens()){
                    vv.addElement(data.nextToken());
                }
                Tabla.addRow(vv);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Tabla;
    }
    
    
}
