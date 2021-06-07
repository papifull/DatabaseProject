package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ListComView {

	private JFrame frame;
	//private static ArrayList<String> addedCom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListComView window = new ListComView();
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
	public ListComView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Liste des communiqu\u00E9s du mois ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(33, 11, 196, 20);
		frame.getContentPane().add(lblNewLabel);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("01/06/2021");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addedCom.add("01/06/2021");
				
			}
		});
		chckbxNewCheckBox.setBounds(43, 40, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("02/06/2021");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addedCom.add("02/06/2021");
			}
		});
		chckbxNewCheckBox_1.setBounds(43, 60, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("03/06/2021");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addedCom.add("03/06/2021");
			}
		});
		chckbxNewCheckBox_2.setBounds(43, 80, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("04/06/2021");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addedCom.add("04/06/2021");
			}
		});
		chckbxNewCheckBox_3.setBounds(43, 100, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("05/06/2021");
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addedCom.add("05/06/2021");
			}
		});
		chckbxNewCheckBox_4.setBounds(43, 120, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("06/06/2021");
		/*chckbxNewCheckBox_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});*/
		chckbxNewCheckBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//addedCom.add("05/06/2021");
			}
		});
		chckbxNewCheckBox_5.setBounds(43, 140, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_5);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ArrayList<String> checkedcom = ListComView.getAddedCom();
				JOptionPane.showMessageDialog(btnNewButton, "Les communiqués des dates sélectionnées ont été ajoutés à la base de données");
				System.out.println("");
				//return checkedcom;
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBounds(311, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

	/*public static ArrayList<String> getAddedCom() {
		return addedCom;
	}

	public void setAddedCom(ArrayList<String> addedCom) {
		this.addedCom = addedCom;
	}*/
}

