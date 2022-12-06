/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author pacor
 */
public class P4_IPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FachadaAplicacion fa;
        System.setProperty("sun.java2d.uiScale", "1.0");
        fa= new FachadaAplicacion();
        fa.vistaInicio();
    }
    
}
