
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class ejemploclase8 {
    
     public static void ej1(){
          //paso1 definir el string de conexion
        String url ="jdbc:mysql://localhost:3306/dbalumnosprogra2a?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
   
        try{
            //paso2 crear el objeto de conexion
            Connection conexion = DriverManager.getConnection(url,"root","");
            //paso 3 creamos el objeto 
            Statement sentencia = conexion.createStatement();
            //paso4 crear instruccion slq
            String sql ="select * from tb_alumnosporgra2";
            //paso 5 ejecutamos el query
            ResultSet  resultado = sentencia.executeQuery(sql);
            
            //paso 6 procesar el resultado
            while(resultado.next()){
                
                System.out.println("id="+resultado.getInt(1));
                System.out.println("Nombre="+resultado.getString(2));
                System.out.println("Nota1="+resultado.getInt(3));
            }
                    
        }catch(SQLException ex){
        ex.printStackTrace(System.out);
        
        
       
        }
            
        }
    
    public static void main(String[] args){
        ej1();
        
       
       
    }
}
        

        
    
    
    
    
    
    
        
       
    
    
    
    
    
