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
	String [][] dados = {{"Eduardo Jorge","Salvador","Bahia"},{"Gustavo Neves","Caetité","Bahia"},{"Tarcísio Aráujo","Mutuípe","Bahia"},{"Rafaela","Campinas","São Paulo"},{"Luisa","Arthur Alvim","São Paulo"},{"Nicolas","Vila Nova Curuça","São Paulo"},{"Rafaela","São Miguel","São Paulo"},{"Jorge","Brás","São Paulo"},{"Davi","Guarulhos","São Paulo"},{"Guilherme","Guaianazes","São Paulo"},{"Dias","São José do Rio Branco","São Paulo"},{"Gusmão","Vila Curuça","São Paulo"},{"Ymir","Itaim Paulista","São Paulo"},{"Karlos","Bertioga","São Paulo"},{"Iago","Penha","São Paulo"},{"Xavier","Carrão","São Paulo"}};
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