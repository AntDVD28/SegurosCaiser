/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ditarea1;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Clase que incluye métodos para validar la entrada de datos por parte del usuario, es decir comprueban si los caracteres introducidos son los permitidos
 * así como el número de ellos
 * @author AntDVD
 */
public class ValidarEntrada {
    
    
    /**
     * Función para validar un código formado por sólo letras y números, con un máximo de 5 caracteres
     * @param evt
     * @param codigo 
     */
    public static void validarCodigo(java.awt.event.KeyEvent evt, JTextField codigo){
        
        int max_caracteres = 5;
        
        char c = evt.getKeyChar();
        
        if(codigo.getText().length() >= max_caracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Máximo 5 caracteres alfanuméricos.", "Código del cliente", JOptionPane.INFORMATION_MESSAGE);
            //Paso el foco al siguiente textfield
            codigo.transferFocus();
        
        }else if (Character.isLetterOrDigit(c)){          
         //No hacemos nada, caracteres permitidos
         
        }else { //Es un caracter no permitido           
            if (!Character.isJavaIdentifierPart(c) ||  c == '$' || c == '_') {
                evt.consume();   
                JOptionPane.showMessageDialog(null,"Sólo caracteres alfanuméricos", "Código del cliente", JOptionPane.INFORMATION_MESSAGE);
                codigo.requestFocus();
            }    
        } 
    }
  
    /**
     * Función para validar el campo Nombre. Son permitidas letras y el espacio en blanco. Máximo de 20 caracteres
     * @param evt
     * @param nombre 
     */
    public static void validarNombre(java.awt.event.KeyEvent evt, JTextField nombre){
        
        int max_caracteres = 20;
        
        char c = evt.getKeyChar();
        
        if(nombre.getText().length() >= max_caracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Máximo 20 caracteres alfabéticos.", "Nombre del cliente", JOptionPane.INFORMATION_MESSAGE);
            //Paso el foco al siguiente textfield
            nombre.transferFocus();
        
        }else if (Character.isLetter(c) || Character.isSpaceChar(c)){
            //No hacemos nada, caracteres permitidos        
            
        }else { //Es un caracter diferente a una letra          
            if (!Character.isJavaIdentifierPart(c) || Character.isDigit(c)|| c == '$' || c == '_') {
                evt.consume();   
                JOptionPane.showMessageDialog(null,"Sólo carácteres alfabéticos.", "Nombre del cliente", JOptionPane.INFORMATION_MESSAGE);
                nombre.requestFocus();
            }    
        }        
    }//Fin de validarNombre
    
    /**
     * Función para validar el campo Apellidos. Son permitidas letras y el espacio en blanco. Máximo de 30 caracteres
     * @param evt
     * @param apellidos 
     */
    public static void validarApellidos(java.awt.event.KeyEvent evt, JTextField apellidos){
        
        int max_caracteres = 30;
        
        char c = evt.getKeyChar();
        
        if(apellidos.getText().length() >= max_caracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Máximo 30 caracteres alfabéticos.", "Apellidos del cliente", JOptionPane.INFORMATION_MESSAGE);
            //Paso el foco al siguiente textfield
            apellidos.transferFocus();
        
        }else if (Character.isLetter(c) || Character.isSpaceChar(c)){
            //No hacemos nada, caracteres permitidos         
            
        }else { //Es un caracter diferente a una letra           
            if (!Character.isJavaIdentifierPart(c) || Character.isDigit(c)|| c == '$' || c == '_') {
                evt.consume();   
                JOptionPane.showMessageDialog(null,"Sólo carácteres alfabéticos.", "Apellidos del cliente", JOptionPane.INFORMATION_MESSAGE);
                apellidos.requestFocus();
            }    
        }        
    }//Fin de validarApellidos
    
    /**
     * Función para validar el nombre del comercial. Son permitidas letras y el espacio en blanco hasta un máximo de 30 caracteres
     * @param evt
     * @param comercial 
     */
    public static void validarComercial(java.awt.event.KeyEvent evt, JTextField comercial){
        
        int max_caracteres = 30;
        
        char c = evt.getKeyChar();
        
        if(comercial.getText().length() >= max_caracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Máximo 30 caracteres alfabéticos.", "Nombre del comercial asignado", JOptionPane.INFORMATION_MESSAGE);
            //Paso el foco al siguiente textfield
            comercial.transferFocus();
        
        }else if (Character.isLetter(c) || Character.isSpaceChar(c)){
            //No hacemos nada, caracteres permitidos         
            
        }else { //Es un caracter diferente a una letra           
            if (!Character.isJavaIdentifierPart(c) || Character.isDigit(c)|| c == '$' || c == '_') {
                evt.consume();   
                JOptionPane.showMessageDialog(null,"Sólo carácteres alfabéticos.", "Nombre del comercial asignado", JOptionPane.INFORMATION_MESSAGE);
                comercial.requestFocus();
            }    
        }        
        
    }//Fin de validarComercial
    
    /**
     * Función para validar una dirección postal. Son válidos letras, números y el espacio en blanco. Máximo 50 caracteres
     * @param evt
     * @param direccion 
     */
    public static void validarDireccion(java.awt.event.KeyEvent evt, JTextField direccion){
        
        int max_caracteres = 50;
        
        char c = evt.getKeyChar();
        
        if(direccion.getText().length() >= max_caracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Máximo 50 caracteres alfanuméricos.", "Dirección del cliente", JOptionPane.INFORMATION_MESSAGE);
            //Paso el foco al siguiente textfield
            direccion.transferFocus();
        
        }else if (Character.isLetterOrDigit(c) || Character.isSpaceChar(c)){
            //No hacemos nada, caracteres permitidos       
            
        }else { //Es un caracter diferente a una letra o número
            if (!Character.isJavaIdentifierPart(c) || c == '$' || c == '_') {
                evt.consume();   
                JOptionPane.showMessageDialog(null,"Sólo carácteres alfanuméricos.", "Dirección del cliente", JOptionPane.INFORMATION_MESSAGE);
                direccion.requestFocus();
            }    
        }              
    }//Fin de validarDireccion
    
    /**
     * Función para validar un número telefónico. Son válidos números con un máximo de 9
     * @param evt
     * @param telefono 
     */
    public static void validarTelefono(java.awt.event.KeyEvent evt, JTextField telefono){
        
        int max_caracteres = 9;
        
        char c = evt.getKeyChar();
        
        if(telefono.getText().length() >= max_caracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Máximo 9 caracteres numéricos.", "Teléfono del cliente", JOptionPane.INFORMATION_MESSAGE);
            //Paso el foco al siguiente textfield
            telefono.transferFocus();
        
        }else if (Character.isDigit(c)){
            //No hacemos nada   
            
         
            
            JFormattedTextField jft = new JFormattedTextField();
            
        }else { //Es un caracter diferente a una letra o número  

            evt.consume();   
            JOptionPane.showMessageDialog(null,"Sólo carácteres numéricos.", "Teléfono del cliente", JOptionPane.INFORMATION_MESSAGE);
            telefono.requestFocus();
            
        }              
        
    }//Fin de validarTelefono
    
    /**
     * Función para validar la tarifa. Son válidos caracteres numéricos con un máximo de 3
     * @param evt
     * @param tarifa 
     */
    public static void validarTarifa(java.awt.event.KeyEvent evt, JTextField tarifa){
        
        int max_caracteres = 3;
        
        char c = evt.getKeyChar();
        
        if(tarifa.getText().length() >= max_caracteres) {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Máximo 3 caracteres numéricos.", "Tarifa del cliente", JOptionPane.INFORMATION_MESSAGE);
            //Paso el foco al siguiente textfield
            tarifa.transferFocus();
        
        }else if (Character.isDigit(c)){
            //No hacemos nada      
            
        }else { //Es un caracter diferente a una letra o número           
            evt.consume();   
            JOptionPane.showMessageDialog(null,"Sólo carácteres numéricos.", "Tarifa del cliente", JOptionPane.INFORMATION_MESSAGE);
            tarifa.requestFocus();
  
        }              
        
    }//Fin de validarTarifa
    
}
