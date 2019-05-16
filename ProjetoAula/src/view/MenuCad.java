package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.FlowLayout;

public class MenuCad extends JFrame {
	JTextField txt_Nome = new JTextField();
	 JLabel Nome = new JLabel("NOME: ");
	
	
	JTextField txt_End = new JTextField();
	JLabel End = new JLabel("ENDEREÇO: ");
	
	JTextField txt_Bairro = new JTextField();
	JLabel Bairro = new JLabel("BAIRRO: ");
	
	JFormattedTextField txt_Cep = null; 
	JLabel Cep = new JLabel("CEP: ");
	
	JTextField txt_Cidade = new JTextField();
	JLabel Cidade = new JLabel("CIDADE: ");	
	
	JLabel Est = new JLabel("ESTADO: ");
	JComboBox cmbEst = new JComboBox(); 
	
	JFormattedTextField txt_Tel = null;
	JLabel Tel = new JLabel("TELEFONE: ");
	
	JFormattedTextField txt_Cel = null;
	JLabel Cel = new JLabel("CELULAR: ");
	
	JFormattedTextField txt_Rg = null;
	JLabel Rg = new JLabel("RG: ");
	
	JFormattedTextField txt_Cpf = null;
	JLabel Cpf = new JLabel("CPF: ");
	
	JButton btnSalvar = new JButton("Salvar");
	
	JButton btnImprimir = new JButton("Imprimir");
	
	JLabel sexo = new JLabel("SEXO: ");
	
	JRadioButton[] rdb_sexo = new JRadioButton[2]; 
	ButtonGroup grupo = new ButtonGroup();{ 
	
	rdb_sexo[0] = new JRadioButton("Feminino");
	rdb_sexo[1] = new JRadioButton("Masculino");} //fechar chave nos groups
	
	MaskFormatter formatTel = null; //add mascara
	MaskFormatter formatCel = null;
	MaskFormatter formatCpf = null;
	MaskFormatter formatCep = null;
	MaskFormatter formatRg = null;
	
	public MenuCad() {
		super("Cadastro");
		
		Container paine = this.getContentPane();
		
		paine.add(txt_Nome);
		paine.add(Nome);	
		Nome.setBounds(10, 15, 45, 30);
		txt_Nome.setBounds(90, 15, 225, 30);
		
		paine.add(txt_End);
		paine.add(End);	
		End.setBounds(10, 50, 70, 30);
		txt_End.setBounds(90, 50, 225, 30);
				
		try { //add mascara antes de tudo!!!
			formatCep = new MaskFormatter("#####-###"); //a mascara
			txt_Cep = new JFormattedTextField(formatCep);
		} catch (Exception ex) { //exibir o erro
			ex.printStackTrace();
		}
		paine.add(txt_Cep);
		paine.add(Cep);			
		Cep.setBounds(335, 70, 40, 30);
		txt_Cep.setBounds(400, 70, 120, 30);
		
		
		paine.add(Cidade);
		paine.add(txt_Cidade);	
		Cidade.setBounds(10, 85, 70, 30);
		txt_Cidade.setBounds(90, 85, 225, 30);
		
		paine.add(Est);
		Est.setBounds(335, 105, 70, 30);
		paine.add(cmbEst);
		cmbEst.setBounds(400, 105, 70, 30);
		cmbEst.addItem("AC");		cmbEst.addItem("AL");
		cmbEst.addItem("AP");		cmbEst.addItem("AM");
		cmbEst.addItem("BA");		cmbEst.addItem("CE");
		cmbEst.addItem("DF");		cmbEst.addItem("ES");
		cmbEst.addItem("GO");		cmbEst.addItem("MA");
		cmbEst.addItem("MT");		cmbEst.addItem("MS");
		cmbEst.addItem("MG");		cmbEst.addItem("PA");
		cmbEst.addItem("PB");		cmbEst.addItem("PR");
		cmbEst.addItem("PE");		cmbEst.addItem("PI");
		cmbEst.addItem("RJ");		cmbEst.addItem("RN");
		cmbEst.addItem("RS");		cmbEst.addItem("RO");
		cmbEst.addItem("RR");		cmbEst.addItem("SC");
		cmbEst.addItem("SP");		cmbEst.addItem("SE");
		cmbEst.addItem("TO");		
		
		paine.add(Bairro);
		paine.add(txt_Bairro);	
		Bairro.setBounds(10, 120, 70, 30);
		txt_Bairro.setBounds(90, 120, 225, 30);
				
		try {
			formatTel = new MaskFormatter("(##)####-####"); //a mascara
			txt_Tel = new JFormattedTextField(formatTel);
		} catch (Exception ext) { //exibir o erro
			ext.printStackTrace();
		}
		paine.add(Tel);
		paine.add(txt_Tel);	
		Tel.setBounds(10, 155, 70, 30);
		txt_Tel.setBounds(90, 155, 155, 30);		
		
		try {
			formatCel = new MaskFormatter("(##)#####-####"); //a mascara
			txt_Cel = new JFormattedTextField(formatCel);
		} catch (Exception exc) { //exibir o erro
			exc.printStackTrace();
		}
		paine.add(Cel);
		paine.add(txt_Cel);	
		Cel.setBounds(335, 155, 70, 30);
		txt_Cel.setBounds(400, 155, 155, 30);
		
		
		paine.add(sexo);			
		sexo.setBounds(335, 15, 55, 30);		
		grupo.add(rdb_sexo[0]); //grupo para o sexo
		grupo.add(rdb_sexo[1]);
		paine.add(rdb_sexo[0]); //opção para o sexo
		rdb_sexo[0].setBounds(375, 15, 85, 30);
		paine.add(rdb_sexo[1]);
		rdb_sexo[1].setBounds(455, 15, 90, 30);
				
		try {
			formatRg = new MaskFormatter("##.###.###-A"); //a mascara
			txt_Rg = new JFormattedTextField(formatRg);
		} catch (Exception exr) { //exibir o erro
			exr.printStackTrace();
		}
		paine.add(Rg);
		paine.add(txt_Rg);	
		Rg.setBounds(10, 190, 55, 30);
		txt_Rg.setBounds(90, 190, 155, 30);		
		
		try {
			formatCpf = new MaskFormatter("###.###.###-##"); //a mascara
			txt_Cpf = new JFormattedTextField(formatCpf);
		} catch (Exception exf) { //exibir o erro
			exf.printStackTrace();
		}
		paine.add(Cpf);
		paine.add(txt_Cpf);	
		Cpf.setBounds(335, 190, 70, 30);
		txt_Cpf.setBounds(400, 190, 155, 30);
		
		paine.add(btnSalvar);
		btnSalvar.setBounds(250, 250, 130, 30);
		btnSalvar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//pessoaFisic.setNome(txt_Nome.getText());
				//pessoaFisic.setEndereco(txt_End.getText());
			}
		});
		
		paine.add(btnImprimir);
		btnImprimir.setBounds(390, 250, 130, 30);
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(600, 330);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}	
	
		
	}

