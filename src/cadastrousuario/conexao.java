/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrousuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/cadastro";
    private static final String Usuario = "root";
    private static final String Senha = "";

    public static Connection conectar() {

        try {

            Connection conexao = DriverManager.getConnection(
                    URL,
                    Usuario,
                    Senha
            );

            System.out.println("Conectando ao banco");

            return conexao;

        } catch (SQLException erro) {

            System.out.println("Erro ao conectar: " + erro.getMessage());

            return null;
        }
    }
}