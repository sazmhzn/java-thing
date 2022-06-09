/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package createfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lenovo
 */
public class CreateFile {
 String fileName;
 
 public CreateFile() {
     fileName = "D://myFile.txt";
 }
 
 public void writeFile() {
     try {
         FileWriter myWriter = new FileWriter( fileName );
         myWriter.write("Files in Java might be tricky, nut is fun enough");
         myWriter.close();
         System.out.println("Succesfully wrote to the file");
     } catch( IOException e ) {
         System.out.println("An error occured");
         e.printStackTrace();
     }
 }

 
 
    public void createFile() {
        
        //if error in try it throw it in catch
        //compile time and run-time error;
        try {
            
            File myObj = new File( fileName );
            
            //will read the if the file is created or not
            if( myObj.createNewFile() ) {
                System.out.println("File is created: " + myObj.getName());
            } else {
                System.out.println("File already exits.");
            }
        } catch ( IOException e ) {
                    System.out.println("An error occured.");
                    
                    //give the detail of the error
                    e.printStackTrace();
        } 
    } //createFile created
   
    public static void main(String[] args) {
        // TODO code application logic here
        CreateFile c = new CreateFile();
        c.createFile();
        c.writeFile();
    }
    
}
