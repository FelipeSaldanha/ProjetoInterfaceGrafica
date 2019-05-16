package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JTable;
public class MenuPesquisar extends JFrame {

	String[] coluna = {"Nome","Cidade","Estado"};
	String [][] dados = {{"Eduardo Jorge","Salvador","Bahia"},{"Gustavo Neves","Caetit�","Bahia"},{"Tarc�sio Ar�ujo","Mutu�pe","Bahia"},{"Rafaela","Campinas","S�o Paulo"},{"Luisa","Arthur Alvim","S�o Paulo"},{"Nicolas","Vila Nova Curu�a","S�o Paulo"},{"Rafaela","S�o Miguel","S�o Paulo"},{"Jorge","Br�s","S�o Paulo"},{"Davi","Guarulhos","S�o Paulo"},{"Guilherme","Guaianazes","S�o Paulo"},{"Dias","S�o Jos� do Rio Branco","S�o Paulo"},{"Gusm�o","Vila Curu�a","S�o Paulo"},{"Ymir","Itaim Paulista","S�o Paulo"},{"Karlos","Bertioga","S�o Paulo"},{"Iago","Penha","S�o Paulo"},{"Xavier","Carr�o","S�o Paulo"}};
	private JTable listEstados = new JTable(dados,coluna); 
	private JScrollPane scrollpane = new JScrollPane(listEstados); 
	
	public MenuPesquisar() {
		super("Pesquisar");
		Container paine = this.getContentPane();
		paine.add(scrollpane);
		
		scrollpane.setBounds(0,0,600,330);
		
		this.setSize(228, 322);
		this.setVisible(true);
		this.setResizable(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
	}
	

}