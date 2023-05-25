/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import controle.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author jpman
 */
public class TelaInicial extends JFrame{

public TelaInicial() {
        setTitle("Tela Inicial");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Botão para abrir a tela de cadastro de cliente
        JButton btnCliente = new JButton("Cadastro de Cliente");
        btnCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmTela telaCadastroCliente = new frmTela();
                telaCadastroCliente.setVisible(true);
            }
        });

        // Botão para abrir a tela de cadastro de filmes
       /* JButton btnFilmes = new JButton("Cadastro de Filmes");
        btnFilmes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadastroFilmes telaCadastroFilmes = new TelaCadastroFilmes();
                telaCadastroFilmes.setVisible(true);
            }
        });*/

        // Botão para abrir a tela de registro de locação de filmes
        /*JButton btnLocacao = new JButton("Registro de Locação");
        btnLocacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaRegistroLocacao telaRegistroLocacao = new TelaRegistroLocacao();
                telaRegistroLocacao.setVisible(true);
            }
        });*/

        // Layout do JFrame
        setLayout(new FlowLayout());
        add(btnCliente);
        //add(btnFilmes);
       //add(btnLocacao);
    }

    public static void main(String[] args) {
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
    }
}
