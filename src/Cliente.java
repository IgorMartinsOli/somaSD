import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

public class Cliente {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException{
        Mensageiro men = (Mensageiro) Naming.lookup("localhost/tsi");
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
        JOptionPane.showMessageDialog(null, men.soma(n1, n2));
    }
}