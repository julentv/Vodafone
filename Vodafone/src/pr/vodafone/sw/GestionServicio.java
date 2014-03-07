package pr.vodafone.sw;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import pr.vodafone.dao.dto.xsd.Terminal;
import pr.vodafone.service.ActualizarTerminal;
import pr.vodafone.service.InsertarTerminal;
import pr.vodafone.service.InsertarTerminalResponse;
import pr.vodafone.service.TerminalManagerStub;

public class GestionServicio {
	
public void actualizarTerminal(String idTerminal, Float promoOro, Float promoPlata, Float promoBronce){
		
		
		try {
			TerminalManagerStub stub = new TerminalManagerStub("http://localhost:8080/axis2/services/TerminalManager");
			InsertarTerminal op = new InsertarTerminal();
			
//			ActualizarTerminal operacion = new ActualizarTerminal();
//			operacion.setIdTerminal(idTerminal);
			Terminal terminal = new Terminal();
			
			terminal.setIdTerminal(idTerminal);
			terminal.setPromoOro(promoOro);
			terminal.setPromoPlata(promoPlata);
			terminal.setPromoBronce(promoBronce);
			terminal.setMarca("marca");
			terminal.setModelo("marca");
			terminal.setPrecio(20);
			//operacion.setTerminal(terminal);
			
			//stub.actualizarTerminal(operacion);
			
			op.setTerminal(terminal);
			InsertarTerminalResponse insertado=stub.insertarTerminal(op);
			System.out.println(insertado.get_return());
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}


public void insertarTerminal (Terminal nuevoTerminal){
	try {
		TerminalManagerStub stub = new TerminalManagerStub("http://localhost:8080/axis2/services/TerminalManager");
		InsertarTerminal op = new InsertarTerminal();
		
//		ActualizarTerminal operacion = new ActualizarTerminal();
//		operacion.setIdTerminal(idTerminal);
		
		nuevoTerminal.setMarca("marca");
		nuevoTerminal.setModelo("marca");
		nuevoTerminal.setPrecio(20);
		//operacion.setTerminal(terminal);
		
		//stub.actualizarTerminal(operacion);
		
		op.setTerminal(nuevoTerminal);
		InsertarTerminalResponse insertado=stub.insertarTerminal(op);
		System.out.println(insertado.get_return());
		
	} catch (AxisFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
}
}
