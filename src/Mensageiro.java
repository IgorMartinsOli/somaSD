import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mensageiro extends Remote{
    public int soma (int nr1, int nr2) throws RemoteException;
}