/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;


import java.util.ArrayList;
import java.util.List;
import Server.Interpreter.CadenaExpression;
import Server.Interpreter.Expression;
import Server.Interpreter.JSONExpression;
import Server.Interpreter.JSONtoFijaExpression;

/**
 *
 * @author javie
 */
public class Protocol {

    /**
     *
     * @param persona
     */
    Expression cadenaExpression;
public Protocol(){
      cadenaExpression = new  JSONtoFijaExpression();
}
  
  

    public String processInput(String cadena) {
        System.out.println("procesando input");
        
        //el mensaje es de json  y selo kiere enviar a cadena
        //return jsontocade.interprete(cadena)
         
         
        return  cadenaExpression.interpret(cadena);
    
}
}