/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.runner.RunWith;

/**
 *
 * @author fatima Calderon
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {
   @Deployment
   public static WebArchive prueva(){
       WebArchive salida=ShrinkWrap.create(WebArchive.class)
               .addClass(Utilities.class);
         
       return salida;
   }
   
   
   
    
}
