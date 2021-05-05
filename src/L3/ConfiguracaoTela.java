package L3;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class ConfiguracaoTela {
	public static void configura() {
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 30)));
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("ARIAL", Font.PLAIN, 30)));
	    JDialog.setDefaultLookAndFeelDecorated(true);
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    Toolkit.getDefaultToolkit().setDynamicLayout(true);
	    System.setProperty("sun.awt.noerasebackground", "true");
	    try {
	        UIManager.setLookAndFeel(new MetalLookAndFeel());
	    } catch (UnsupportedLookAndFeelException e) {
	        System.out.println(
	                "Metal Look & Feel not supported on this platform. \n"
	                + "Program Terminated");
	        System.exit(0);
	    }
	}
}
