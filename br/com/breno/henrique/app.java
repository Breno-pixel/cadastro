package br.com.breno.henrique;

import DAO.ClienteMapDAO;
import DAO.IClienteDAO;

import javax.swing.*;

public class app {
    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog( null,
         "Digite 1 para cadastra, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair" +
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
            sair();}
        }
        opcao = JOptionPane.showInternalInputDialog(null,
                "Opcao invalida digite 1 para cadastra, 2 para consulta, 3 para cadastro, 4 para alterar",
                "green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

         while (!isOpcaoValida(opcao)){
             if (isOpcaoSair(opcao)) {
                 sair();

             }
         }
    }

        if ("1".equals(opcao)) {
            JOptionPane.showInputDialog( null,  "opcao" + opcao,  "erro",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        private static void sair() {
            JOptionPane.showMessageDialog(null, "até logo", "sair", JOptionPane.INFORMATION_MESSAGE);
        }

        private static boolean isOpcaoValida(String opcao) {
            if ("5".equals(opcao) || "2".equals(opcao) || "3".equals(opcao)
                || "4".equals(opcao) || "5".equals(opcao)) {
                return true;
            }
            return false;

        }

        private static boolean isOpcaoValida(String opcao) {
            if ("1".equals(opcao)) {
                return true;
            }
            return false;

    }
}
