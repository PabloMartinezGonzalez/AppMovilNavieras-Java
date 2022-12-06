/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Reserva;
import java.awt.Frame;
import java.io.IOException;
import java.text.ParseException;



/**
 *
 * @author alumno
 */
public class FachadaGui {
    aplicacion.FachadaAplicacion fa;
    VInicio vi;
    VBilletes vb;
    VRutas vr;
    VMas vm;
    VSeleccion vs;
    VRuta1Info vr1;
    VRuta2Info vr2;
    VIndividual vin;
    VGrupo vgr;
    VCancelar vca;
    VCompra vc;
    VPago vp;
    VReserva vre;
    VAnular va;
    VAyuda vay;
   public FachadaGui(aplicacion.FachadaAplicacion fa){
     this.fa=fa;
   } 

    
    public void vistaInicio(){
        this.vi = new VInicio(fa);
        vi.setVisible(true);
    }
    public void vistaBilletes(){
        this.vb = new VBilletes(fa);
        vb.setVisible(true);
    }
    public void vistaRutas(){
        this.vr = new VRutas(fa);
        vr.setVisible(true);
    }
    public void vistaMas(){
        this.vm = new VMas(fa);
        vm.setVisible(true);
    }
    public void vistaSeleccion(String ruta, java.awt.Frame parent) throws ParseException{
      this.vs = new VSeleccion(fa, ruta, parent);
      vs.setVisible(true);
    }
    
    public void vistaRuta1(java.awt.Frame parent) throws IOException{
      this.vr1 = new VRuta1Info(fa, parent);
      vr1.setVisible(true);
    }
    public void vistaRuta2(java.awt.Frame parent){
      this.vr2 = new VRuta2Info(fa, parent);
      vr2.setVisible(true);
    }
    public void vistaIndividual(java.awt.Frame parent, Reserva res, Double precRuta) throws ParseException{
      this.vin = new VIndividual(fa, parent, res, precRuta);
      vin.setVisible(true);
    }
    public void vistaGrupo(java.awt.Frame parent, Reserva res, Double precRuta) throws ParseException{
      this.vgr = new VGrupo(fa, parent, res, precRuta);
      vgr.setVisible(true);
    }
    public void vistaCompra(java.awt.Frame parent, Reserva res){
      this.vc = new VCompra(fa, parent, res);
      vc.setVisible(true);
    }
    public void vistaPago(java.awt.Frame parent, Reserva res){
      this.vp = new VPago(fa, parent, res);
      vp.setVisible(true);
    }
    public void vistaReserva(java.awt.Frame parent, Reserva res){
      this.vre = new VReserva(fa, parent, res);
      vre.setVisible(true);
    }
    public void vistaAnular(java.awt.Frame parent) throws ParseException{
      this.va = new VAnular(fa, parent);
      va.setVisible(true);
    }
    public void vistaAyuda(java.awt.Frame parent){
      this.vay = new VAyuda(fa, parent);
      vay.setVisible(true);
  }
    
    
    public void muestraMensaje(java.awt.Frame parent,String txtExcepcion){
       VAviso va;
       va = new VAviso(parent, true, txtExcepcion);
       va.setVisible(true);
    }
    public void muestraCancelar(java.awt.Frame parent){
       VCancelar vca;
       vca = new VCancelar(parent, true);
       vca.setVisible(true);
    }
    public void avisoEdad(java.awt.Frame parent){
       VAvisoEdad vedad;
       vedad = new VAvisoEdad(parent, true);
       vedad.setVisible(true);
    }

}