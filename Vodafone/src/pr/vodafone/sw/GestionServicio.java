package pr.vodafone.sw;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import pr.vodafone.dao.ActualizarTerminal;
import pr.vodafone.dao.TerminalManagerSQLExceptionException;
import pr.vodafone.dao.TerminalManagerStub;
import pr.vodafone.dao.dto.xsd.Terminal;

public class GestionServicio {
	
	
	private void actualizarTerminal(String idTerminal, Float promoOro, Float promoPlata, Float promoBronce){
		
		
		try {
			TerminalManagerStub stub = new TerminalManagerStub("http://localhost:8080/axis2/services/TerminalManager");
			
			ActualizarTerminal operacion = new ActualizarTerminal();
			operacion.setIdTerminal(idTerminal);
			Terminal terminal = new Terminal();
			
			terminal.setIdTerminal(idTerminal);
			terminal.setPromoOro(promoOro);
			terminal.setPromoPlata(promoPlata);
			terminal.setPromoBronce(promoBronce);
			operacion.setTerminal(terminal);
			
			stub.actualizarTerminal(operacion);
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TerminalManagerSQLExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
