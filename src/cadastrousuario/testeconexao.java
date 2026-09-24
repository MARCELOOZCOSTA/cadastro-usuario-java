/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrousuario;

/**
 *
 * @author marce
 */
import java.sql.Connection;
public class testeconexao {
    public static void main (String [] args){
        Connection conexaoBanco = conexao.conectar();
        
        if(conexaoBanco != null){
            System.out.println("Conexão realizada com sucesso!");
        } else {
            System.out.println("Não foi possível conectar ao banco"); 
}
    }
}

