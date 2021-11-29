
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Servidor {
    public static void main(String[] args) throws RemoteException, MalformedURLException{
        Operacao o = new Operacao();
        Naming.rebind("localhost/tsi", o);
    }
}
