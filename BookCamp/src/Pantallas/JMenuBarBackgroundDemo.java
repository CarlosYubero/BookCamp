package Pantallas;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class JMenuBarBackgroundDemo extends JFrame {

	private JMenu mnFile;
	private JMenuItem mntmNew;
	private JMenuItem mntmSave;
	private JMenuBar menuBar;
	private JMenu mnName;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JScrollPane scrollPane_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel label;
	private JTable table;
	private Component verticalGlue;
	private Component verticalGlue_1;
	private Component verticalGlue_2;
	private Component verticalGlue_3;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					JMenuBarBackgroundDemo frame = new JMenuBarBackgroundDemo();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public JMenuBarBackgroundDemo() {
		//super("Background Image JMenuBar");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 502);

		menuBar = new JMenuBar() {

			/*@Override
			public void paintComponent(Graphics g) {
				Dimension size = this.getSize();
				g.drawImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Libros1.png")), 0, 0, size.width, size.height, this);
			}*/
		};

		mnFile = new JMenu("File");
		mntmNew = new JMenuItem("New");
		mntmSave = new JMenuItem("Save");

		menuBar.add(mnFile); 
		mnFile.add(mntmNew); 
		mnFile.add(mntmSave);

		setJMenuBar(menuBar);
		
		mnName = new JMenu("Name");
		menuBar.add(mnName);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		intializeTable();
		scrollPane_1 = new JScrollPane(table);
		getContentPane().add(scrollPane_1, BorderLayout.CENTER);
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		verticalGlue = Box.createVerticalGlue();
		panel.add(verticalGlue);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setIcon(new ImageIcon(JMenuBarBackgroundDemo.class.getResource("/Imagenes/Add.png")));
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btnNewButton_1);
		
		verticalGlue_1 = Box.createVerticalGlue();
		panel.add(verticalGlue_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2.setIcon(new ImageIcon(JMenuBarBackgroundDemo.class.getResource("/Imagenes/Delete.png")));
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btnNewButton_2);
		
		verticalGlue_2 = Box.createVerticalGlue();
		panel.add(verticalGlue_2);
		
		btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setIcon(new ImageIcon(JMenuBarBackgroundDemo.class.getResource("/Imagenes/Search.png")));
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btnNewButton);
		
		verticalGlue_3 = Box.createVerticalGlue();
		panel.add(verticalGlue_3);
		
		label = new JLabel("");
		panel.add(label);
		
	}
	
	public void intializeTable(){
		String [] columnNames={"Id", "Tittle", "FK_author", "FK_publisher", "Year", "Stock"};
		BookStore books = new BookStore("Resources/archivo.bin", "Resources/Librosl.csv");
		books.loadCSVFile();
		Object data[][] =books.getDataForTable();
		table = new JTable(data,columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);
	}
	
}