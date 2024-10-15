import javax.swing.JOptionPane;
public class test1 {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Hãy nhập tên bạn :");
        JOptionPane.showMessageDialog(null, "Xin chào " + result + "!" );

        System.exit(0);
    }
}