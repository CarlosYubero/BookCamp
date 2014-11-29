package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaAdd {

	private JFrame frmAadirLibro;
	private JTextField txtId;
	private JTextField txtTittle;
	private JTextField textField_tittle;
	private JTextField txtAuthor;
	private JTextField textField_author;
	private JTextField txtPublisher;
	private JTextField textField_publisher;
	private JTextField txtYear;
	private JTextField textField_year;
	private JTextField txtStock;
	private JTextField textField_stock;
	Book books;
	private JTextField textField_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaAdd window = new PantallaAdd();
					window.frmAadirLibro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaAdd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAadirLibro = new JFrame();
		frmAadirLibro.setTitle("A\u00F1adir Libro");
		frmAadirLibro.setBounds(100, 100, 489, 237);
		frmAadirLibro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("A\u00F1adir");

		//int ID = Integer.parseInt(txtId);
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setText("ID");
		txtId.setColumns(10);
		txtId.getText();
		int ID = Integer.parseInt(txtId.getText());
		
		textField_id = new JTextField();
		textField_id.setColumns(10);
		
		txtTittle = new JTextField();
		txtTittle.setText("Tittle");
		txtTittle.setEditable(false);
		txtTittle.setColumns(10);
		txtTittle.getText();
		
		textField_tittle = new JTextField();
		textField_tittle.setColumns(10);
		
		txtAuthor = new JTextField();
		txtAuthor.setText("Author");
		txtAuthor.setEditable(false);
		txtAuthor.setColumns(10);
		txtAuthor.getText();
		int AUTHOR = Integer.parseInt(txtAuthor.getText());
		
		textField_author = new JTextField();
		textField_author.setColumns(10);
		
		txtPublisher = new JTextField();
		txtPublisher.setText("Publisher");
		txtPublisher.setEditable(false);
		txtPublisher.setColumns(10);
		txtPublisher.getText();
		int PUBLISHER = Integer.parseInt(txtPublisher.getText());
		
		textField_publisher = new JTextField();
		textField_publisher.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setText("Year");
		txtYear.setEditable(false);
		txtYear.setColumns(10);
		txtYear.getText();
		int YEAR = Integer.parseInt(txtYear.getText());
		
		textField_year = new JTextField();
		textField_year.setColumns(10);
		
		txtStock = new JTextField();
		txtStock.setText("Stock");
		txtStock.setEditable(false);
		txtStock.setColumns(10);
		txtStock.getText();
		int STOCK = Integer.parseInt(txtStock.getText());
		
		textField_stock = new JTextField();
		textField_stock.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frmAadirLibro.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtId, 0, 0, Short.MAX_VALUE)
								.addComponent(txtAuthor, 0, 0, Short.MAX_VALUE)
								.addComponent(txtTittle, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_tittle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_author, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtPublisher, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addGap(28)
									.addComponent(textField_publisher, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtYear, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addGap(28)
									.addComponent(textField_year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtStock, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addGap(28)
									.addComponent(textField_stock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addComponent(btnNewButton, Alignment.TRAILING))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTittle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_tittle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtAuthor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_author, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPublisher, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_publisher, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_year, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtStock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_stock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(223))
		);
		frmAadirLibro.getContentPane().setLayout(groupLayout);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				books.setBook_id(ID);
				books.setTitle(txtTittle.getText());
				books.setFk_author(AUTHOR);
				books.setFk_publisher(PUBLISHER);
				books.setYear(YEAR);
				books.setStock(STOCK);
			}
		});
	}
}
