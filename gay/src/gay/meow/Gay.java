package gay.meow;
import static javax.swing.JOptionPane.*;

public class Gay {

	public static void main(String[] args) {
		String qt = showInputDialog("enter qt name:").toLowerCase().replace("!", "");
		
		boolean isQt = (qt.equals("zoe") || qt.equals("ivy"));
		
		if (isQt) {
			showMessageDialog(null,"thats my girlfriend!!! i love faer so much!!!!!!");
		} else {
			showMessageDialog(null,"who??");
		}
		
	}

}

