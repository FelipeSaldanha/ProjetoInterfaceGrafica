package view;
import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class InterfaceGrafica extends JFrame {
	private JMenuItem menuItemCadastrar = new JMenuItem("Cadastrar");
	private JMenuItem menuItemPesquisar = new JMenuItem("Pesquisar");
	private JMenuItem menuItemExcluir = new JMenuItem("Excluir");
	private JMenuItem menuItemFechar = new JMenuItem("Fechar");
	
	private JMenuItem menuItemAtualizar = new JMenuItem("Atualizar");
	
	private JMenu menuArquivo = new JMenu("Arquivo");
	private JMenu menuEditar = new JMenu("Editar");
	
	private JMenuBar menuBar = new JMenuBar();
	
	public InterfaceGrafica() {
	super("Menus");
	menuArquivo.add(menuItemCadastrar);
	menuArquivo.add(menuItemPesquisar);
	menuArquivo.add(menuItemExcluir);
	menuArquivo.addSeparator();
	menuArquivo.add(menuItemFechar);
	

	
	menuEditar.add(menuItemAtualizar);
	
	menuBar.add(menuArquivo);
	menuBar.add(menuEditar);
	
	this.setJMenuBar(menuBar);
	this.setSize(1280,680);
	this.setVisible(true);
	this.setExtendedState(MAXIMIZED_BOTH);
		//Menu arquivo e suas janelas;
		menuItemCadastrar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				MenuCad cad = new MenuCad();
			}
		});
		menuItemPesquisar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				MenuPesquisar pesq = new MenuPesquisar();
			}
		});
		menuItemExcluir.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				MenuExcluir exc = new MenuExcluir();
			}
		});
		menuItemFechar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				MenuFechar fechar = new MenuFechar();
			}
		});
		//Menu Editar e suas janelas;
		menuItemAtualizar.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				menuAtualizar atualizar = new menuAtualizar();
			}
		});

		
		
	}
	

	public static void main(String[] args) {

		InterfaceGrafica exemplo = new InterfaceGrafica();
	}

}
