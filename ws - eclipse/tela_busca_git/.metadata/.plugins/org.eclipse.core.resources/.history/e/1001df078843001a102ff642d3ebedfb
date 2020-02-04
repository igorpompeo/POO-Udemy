package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JSpinner;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JDateChooser;

public class PrimeiraTela {

	private JFrame frame;
	private JTextField txtBranch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela window = new PrimeiraTela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 497, 268);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNameBranch = new JLabel("Branch");
		lblNameBranch.setBounds(10, 34, 46, 14);
		frame.getContentPane().add(lblNameBranch);
		
		txtBranch = new JTextField();
		txtBranch.setBounds(66, 31, 269, 20);
		frame.getContentPane().add(txtBranch);
		txtBranch.setColumns(10);
		
		Label lblDateBeggin = new Label("Data Início");
		lblDateBeggin.setBounds(10, 112, 62, 22);
		frame.getContentPane().add(lblDateBeggin);
		
		JLabel lblDateEnd = new JLabel("Data Fim");
		lblDateEnd.setBounds(10, 159, 46, 14);
		frame.getContentPane().add(lblDateEnd);
		
		JButton btnCheckout = new JButton("Fazer Checkout");
		btnCheckout.setBounds(345, 31, 126, 23);
		frame.getContentPane().add(btnCheckout);
		
		JButton btnPull = new JButton("Fazer Pull");
		btnPull.setBounds(345, 96, 89, 23);
		frame.getContentPane().add(btnPull);
		
		JButton btnGenerateReport = new JButton("Gerar Relatório");
		btnGenerateReport.setBounds(345, 156, 126, 23);
		frame.getContentPane().add(btnGenerateReport);
		
		JDateChooser dateBegginer = new JDateChooser();
		dateBegginer.setBounds(78, 112, 87, 20);
		frame.getContentPane().add(dateBegginer);
		
		JDateChooser dateEnd = new JDateChooser();
		dateEnd.setBounds(78, 159, 87, 20);
		frame.getContentPane().add(dateEnd);
	}
}
