package Pantallas;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenuBarBackgroundDemo extends JFrame {

	private JMenu mnFile;
	private JMenuItem mntmNew;
	private JMenuItem mntmSave;
	private JMenuBar menuBar;

	/**
	 * Create the frame.
	 */
	public JMenuBarBackgroundDemo() {
		//super("Background Image JMenuBar");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 361);

		menuBar = new JMenuBar() {

			@Override
			public void paintComponent(Graphics g) {
				Dimension size = this.getSize();
				g.drawImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Libros1.png")), 0, 0, size.width, size.height, this);
			}
		};

		mnFile = new JMenu("File");
		mntmNew = new JMenuItem("New");
		mntmSave = new JMenuItem("Save");

		menuBar.add(mnFile); 
		mnFile.add(mntmNew); 
		mnFile.add(mntmSave);

		setJMenuBar(menuBar);
		setLocationRelativeTo(null);
	}

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
}