import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Operacao extends UnicastRemoteObject  implements Mensageiro{
    
    private static final long serialVersionUID = 1L;
    
    protected Operacao() throws RemoteException{
        super();
    }
    
    @Override
    public int soma(int nr1, int nr2) throws RemoteException{
        return nr1*nr2;
    }
    
}