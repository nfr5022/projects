/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widgets;

import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author owner
 */
public class launcher {
    public void launchLinkedIn(){
        try{
            Desktop.getDesktop().browse(URI.create("www.linkedin.com"));
        }catch (IOException e){}
    }
        
    public void launchGmail(){
        try{
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        }catch(IOException e){}
    }
}
