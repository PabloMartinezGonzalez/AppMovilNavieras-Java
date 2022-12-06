

package aplicacion;

import gui.VAviso;
import gui.VPago;
import java.io.IOException;
import java.text.ParseException;

public class FachadaAplicacion {
    gui.FachadaGui fgui;
    
    
 public FachadaAplicacion(){
   fgui=new gui.FachadaGui(this);

    }
 public void vistaInicio(){
        fgui.vistaInicio();
    }
  public void vistaBilletes(){
        fgui.vistaBilletes();
    }
  public void vistaRutas(){
        fgui.vistaRutas();
    }
  public void vistaMas(){
        fgui.vistaMas();
    }
  public void muestraMensaje(java.awt.Frame parent, String txtExcepcion){
       fgui.muestraMensaje(parent, txtExcepcion);
    }
  public void vistaSeleccion(String ruta, java.awt.Frame parent) throws ParseException{
      fgui.vistaSeleccion(ruta, parent);
  }
  public void vistaRuta1(java.awt.Frame parent) throws IOException{
      fgui.vistaRuta1(parent);
  }
  public void vistaRuta2(java.awt.Frame parent){
      fgui.vistaRuta2(parent);
  }
  public void vistaIndividual(java.awt.Frame parent, Reserva res, Double precRuta) throws ParseException{
      fgui.vistaIndividual(parent, res, precRuta);
  }
  public void vistaGrupo(java.awt.Frame parent, Reserva res, Double precRuta) throws ParseException{
      fgui.vistaGrupo(parent, res, precRuta);
  }
  public void vistaCompra(java.awt.Frame parent, Reserva res){
      fgui.vistaCompra(parent, res);
  }
  public void vistaPago(java.awt.Frame parent, Reserva res){
      fgui.vistaPago(parent, res);
  }
  public void vistaReserva(java.awt.Frame parent, Reserva res){
      fgui.vistaReserva(parent, res);
  }
  public void vistaAnular(java.awt.Frame parent) throws ParseException{
      fgui.vistaAnular(parent);
  }
  public void vistaAyuda(java.awt.Frame parent){
      fgui.vistaAyuda(parent);
  }
  
  public void muestraCancelar(java.awt.Frame parent) {
      fgui.muestraCancelar(parent);
  }
  public void avisoEdad(java.awt.Frame parent) {
      fgui.avisoEdad(parent);
  }

    
}
