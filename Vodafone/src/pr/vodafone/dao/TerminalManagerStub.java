
/**
 * TerminalManagerStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package pr.vodafone.dao;

        

        /*
        *  TerminalManagerStub java implementation
        */

        
        public class TerminalManagerStub extends org.apache.axis2.client.Stub
        implements TerminalManager{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("TerminalManager" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[40];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "actualizarCliente"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerClientesPorNombre"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "conectar"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "borrarFacturas"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "borrarTerminal"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "contarClientes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerLineas"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerLineasActivasCliente"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "borrarLinea"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerClientes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "insertarCliente"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "desconectar"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerTerminalesPorMarca"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "borrarCliente"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerCliente"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "borrarTerminales"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "borrarFactura"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "contarLineas"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "borrarLineas"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "actualizarFactura"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "insertarTerminal"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "insertarFactura"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "actualizarLinea"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerFacturasLinea"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerLinea"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[24]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerTerminales"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[25]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "insertarLinea"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[26]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerLineasCliente"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[27]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerTerminalesPorModelo"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[28]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "actualizarTerminal"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[29]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "contarFacturas"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[30]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerFactura"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[31]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "contarTerminales"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[32]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerTerminal"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[33]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerFacturasCliente"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[34]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerLineasActivas"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[35]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "activarLinea"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[36]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerFacturas"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[37]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "borrarClientes"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[38]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://dao.vodafone.pr", "obtenerTerminalesPorPrecio"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[39]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarCliente"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerClientesPorNombre"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerClientesPorNombre"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerClientesPorNombre"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "conectar"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "conectar"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "conectar"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerClassNotFoundException"), "conectar"),"pr.vodafone.dao.TerminalManagerClassNotFoundExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerClassNotFoundException"), "conectar"),"pr.vodafone.dao.TerminalManagerClassNotFoundExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerClassNotFoundException"), "conectar"),"pr.vodafone.dao.TerminalManagerClassNotFoundException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarFacturas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarFacturas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarFacturas"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarTerminal"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarTerminal"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarTerminal"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarClientes"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarClientes"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarClientes"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineas"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineasActivasCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineasActivasCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineasActivasCliente"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarLinea"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerClientes"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerClientes"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerClientes"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarCliente"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "desconectar"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "desconectar"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "desconectar"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminalesPorMarca"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminalesPorMarca"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminalesPorMarca"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarCliente"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerCliente"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarTerminales"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarTerminales"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarTerminales"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarFactura"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarFactura"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarFactura"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarLineas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarLineas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarLineas"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarLineas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarLineas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarLineas"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarFactura"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarFactura"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarFactura"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarTerminal"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarTerminal"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarTerminal"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarFactura"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarFactura"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarFactura"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarLinea"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFacturasLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFacturasLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFacturasLinea"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLinea"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminales"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminales"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminales"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "insertarLinea"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineasCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineasCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineasCliente"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminalesPorModelo"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminalesPorModelo"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminalesPorModelo"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarTerminal"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarTerminal"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "actualizarTerminal"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarFacturas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarFacturas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarFacturas"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFactura"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFactura"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFactura"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarTerminales"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarTerminales"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "contarTerminales"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminal"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminal"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminal"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFacturasCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFacturasCliente"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFacturasCliente"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineasActivas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineasActivas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerLineasActivas"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "activarLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "activarLinea"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "activarLinea"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFacturas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFacturas"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerFacturas"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarClientes"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarClientes"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "borrarClientes"),"pr.vodafone.dao.TerminalManagerSQLException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminalesPorPrecio"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminalesPorPrecio"),"pr.vodafone.dao.TerminalManagerSQLExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://dao.vodafone.pr","TerminalManagerSQLException"), "obtenerTerminalesPorPrecio"),"pr.vodafone.dao.TerminalManagerSQLException");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public TerminalManagerStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public TerminalManagerStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public TerminalManagerStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://localhost:8080/axis2/services/TerminalManager.TerminalManagerHttpSoap12Endpoint/" );
                
    }

    /**
     * Default Constructor
     */
    public TerminalManagerStub() throws org.apache.axis2.AxisFault {
        
                    this("http://localhost:8080/axis2/services/TerminalManager.TerminalManagerHttpSoap12Endpoint/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public TerminalManagerStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#actualizarCliente
                     * @param actualizarCliente98
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void actualizarCliente(

                            pr.vodafone.dao.ActualizarCliente actualizarCliente98)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:actualizarCliente");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    actualizarCliente98,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarCliente"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarCliente"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarCliente"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarCliente"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startactualizarCliente
                    * @param actualizarCliente98
                
                */
                public  void startactualizarCliente(

                 pr.vodafone.dao.ActualizarCliente actualizarCliente98,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("urn:actualizarCliente");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    actualizarCliente98,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarCliente"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerClientesPorNombre
                     * @param obtenerClientesPorNombre100
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerClientesPorNombreResponse obtenerClientesPorNombre(

                            pr.vodafone.dao.ObtenerClientesPorNombre obtenerClientesPorNombre100)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn:obtenerClientesPorNombre");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerClientesPorNombre100,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerClientesPorNombre")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerClientesPorNombre"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerClientesPorNombreResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerClientesPorNombreResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientesPorNombre"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientesPorNombre"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientesPorNombre"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerClientesPorNombre
                    * @param obtenerClientesPorNombre100
                
                */
                public  void startobtenerClientesPorNombre(

                 pr.vodafone.dao.ObtenerClientesPorNombre obtenerClientesPorNombre100,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("urn:obtenerClientesPorNombre");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerClientesPorNombre100,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerClientesPorNombre")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerClientesPorNombre"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerClientesPorNombreResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerClientesPorNombre(
                                        (pr.vodafone.dao.ObtenerClientesPorNombreResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerClientesPorNombre(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientesPorNombre"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientesPorNombre"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientesPorNombre"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerClientesPorNombre((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerClientesPorNombre(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientesPorNombre(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientesPorNombre(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientesPorNombre(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientesPorNombre(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientesPorNombre(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientesPorNombre(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientesPorNombre(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerClientesPorNombre(f);
									    }
									} else {
									    callback.receiveErrorobtenerClientesPorNombre(f);
									}
								} else {
								    callback.receiveErrorobtenerClientesPorNombre(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerClientesPorNombre(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#conectar
                     * @param conectar102
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     * @throws pr.vodafone.dao.TerminalManagerClassNotFoundExceptionException : 
                     */

                    

                            public  void conectar(

                            pr.vodafone.dao.Conectar conectar102)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException
                        ,pr.vodafone.dao.TerminalManagerClassNotFoundExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("urn:conectar");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    conectar102,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "conectar")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "conectar"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"conectar"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"conectar"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"conectar"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerClassNotFoundExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerClassNotFoundExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startconectar
                    * @param conectar102
                
                */
                public  void startconectar(

                 pr.vodafone.dao.Conectar conectar102,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("urn:conectar");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    conectar102,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "conectar")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "conectar"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#borrarFacturas
                     * @param borrarFacturas104
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void borrarFacturas(

                            pr.vodafone.dao.BorrarFacturas borrarFacturas104)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("urn:borrarFacturas");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarFacturas104,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarFacturas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarFacturas"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarFacturas"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarFacturas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarFacturas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startborrarFacturas
                    * @param borrarFacturas104
                
                */
                public  void startborrarFacturas(

                 pr.vodafone.dao.BorrarFacturas borrarFacturas104,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("urn:borrarFacturas");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarFacturas104,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarFacturas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarFacturas"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#borrarTerminal
                     * @param borrarTerminal106
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void borrarTerminal(

                            pr.vodafone.dao.BorrarTerminal borrarTerminal106)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("urn:borrarTerminal");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarTerminal106,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarTerminal")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarTerminal"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarTerminal"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarTerminal"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarTerminal"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startborrarTerminal
                    * @param borrarTerminal106
                
                */
                public  void startborrarTerminal(

                 pr.vodafone.dao.BorrarTerminal borrarTerminal106,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("urn:borrarTerminal");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarTerminal106,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarTerminal")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarTerminal"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#contarClientes
                     * @param contarClientes108
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ContarClientesResponse contarClientes(

                            pr.vodafone.dao.ContarClientes contarClientes108)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn:contarClientes");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contarClientes108,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarClientes")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarClientes"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ContarClientesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ContarClientesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarClientes"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarClientes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarClientes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startcontarClientes
                    * @param contarClientes108
                
                */
                public  void startcontarClientes(

                 pr.vodafone.dao.ContarClientes contarClientes108,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("urn:contarClientes");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contarClientes108,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarClientes")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarClientes"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ContarClientesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcontarClientes(
                                        (pr.vodafone.dao.ContarClientesResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcontarClientes(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarClientes"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarClientes"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarClientes"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorcontarClientes((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcontarClientes(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarClientes(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarClientes(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarClientes(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarClientes(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarClientes(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarClientes(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarClientes(f);
                                            }
									    } else {
										    callback.receiveErrorcontarClientes(f);
									    }
									} else {
									    callback.receiveErrorcontarClientes(f);
									}
								} else {
								    callback.receiveErrorcontarClientes(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcontarClientes(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerLineas
                     * @param obtenerLineas110
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerLineasResponse obtenerLineas(

                            pr.vodafone.dao.ObtenerLineas obtenerLineas110)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("urn:obtenerLineas");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLineas110,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineas"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerLineasResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerLineasResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineas"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerLineas
                    * @param obtenerLineas110
                
                */
                public  void startobtenerLineas(

                 pr.vodafone.dao.ObtenerLineas obtenerLineas110,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("urn:obtenerLineas");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLineas110,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineas"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerLineasResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerLineas(
                                        (pr.vodafone.dao.ObtenerLineasResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerLineas(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineas"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineas"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineas"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerLineas((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerLineas(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineas(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineas(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineas(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineas(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineas(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineas(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineas(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerLineas(f);
									    }
									} else {
									    callback.receiveErrorobtenerLineas(f);
									}
								} else {
								    callback.receiveErrorobtenerLineas(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerLineas(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerLineasActivasCliente
                     * @param obtenerLineasActivasCliente112
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerLineasActivasClienteResponse obtenerLineasActivasCliente(

                            pr.vodafone.dao.ObtenerLineasActivasCliente obtenerLineasActivasCliente112)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("urn:obtenerLineasActivasCliente");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLineasActivasCliente112,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasActivasCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasActivasCliente"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerLineasActivasClienteResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerLineasActivasClienteResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivasCliente"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivasCliente"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivasCliente"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerLineasActivasCliente
                    * @param obtenerLineasActivasCliente112
                
                */
                public  void startobtenerLineasActivasCliente(

                 pr.vodafone.dao.ObtenerLineasActivasCliente obtenerLineasActivasCliente112,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("urn:obtenerLineasActivasCliente");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLineasActivasCliente112,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasActivasCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasActivasCliente"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerLineasActivasClienteResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerLineasActivasCliente(
                                        (pr.vodafone.dao.ObtenerLineasActivasClienteResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerLineasActivasCliente(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivasCliente"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivasCliente"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivasCliente"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerLineasActivasCliente((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerLineasActivasCliente(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivasCliente(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivasCliente(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivasCliente(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivasCliente(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivasCliente(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivasCliente(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivasCliente(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerLineasActivasCliente(f);
									    }
									} else {
									    callback.receiveErrorobtenerLineasActivasCliente(f);
									}
								} else {
								    callback.receiveErrorobtenerLineasActivasCliente(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerLineasActivasCliente(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#borrarLinea
                     * @param borrarLinea114
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void borrarLinea(

                            pr.vodafone.dao.BorrarLinea borrarLinea114)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("urn:borrarLinea");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarLinea114,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarLinea"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarLinea"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarLinea"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarLinea"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startborrarLinea
                    * @param borrarLinea114
                
                */
                public  void startborrarLinea(

                 pr.vodafone.dao.BorrarLinea borrarLinea114,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("urn:borrarLinea");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarLinea114,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarLinea"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerClientes
                     * @param obtenerClientes116
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerClientesResponse obtenerClientes(

                            pr.vodafone.dao.ObtenerClientes obtenerClientes116)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("urn:obtenerClientes");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerClientes116,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerClientes")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerClientes"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerClientesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerClientesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientes"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerClientes
                    * @param obtenerClientes116
                
                */
                public  void startobtenerClientes(

                 pr.vodafone.dao.ObtenerClientes obtenerClientes116,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("urn:obtenerClientes");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerClientes116,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerClientes")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerClientes"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerClientesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerClientes(
                                        (pr.vodafone.dao.ObtenerClientesResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerClientes(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientes"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientes"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerClientes"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerClientes((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerClientes(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientes(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientes(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientes(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientes(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientes(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientes(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerClientes(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerClientes(f);
									    }
									} else {
									    callback.receiveErrorobtenerClientes(f);
									}
								} else {
								    callback.receiveErrorobtenerClientes(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerClientes(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#insertarCliente
                     * @param insertarCliente118
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void insertarCliente(

                            pr.vodafone.dao.InsertarCliente insertarCliente118)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("urn:insertarCliente");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    insertarCliente118,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarCliente"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarCliente"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarCliente"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarCliente"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startinsertarCliente
                    * @param insertarCliente118
                
                */
                public  void startinsertarCliente(

                 pr.vodafone.dao.InsertarCliente insertarCliente118,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("urn:insertarCliente");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    insertarCliente118,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarCliente"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#desconectar
                     * @param desconectar120
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void desconectar(

                            pr.vodafone.dao.Desconectar desconectar120)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("urn:desconectar");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    desconectar120,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "desconectar")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "desconectar"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"desconectar"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"desconectar"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"desconectar"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startdesconectar
                    * @param desconectar120
                
                */
                public  void startdesconectar(

                 pr.vodafone.dao.Desconectar desconectar120,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
             _operationClient.getOptions().setAction("urn:desconectar");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    desconectar120,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "desconectar")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "desconectar"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[11].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerTerminalesPorMarca
                     * @param obtenerTerminalesPorMarca122
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse obtenerTerminalesPorMarca(

                            pr.vodafone.dao.ObtenerTerminalesPorMarca obtenerTerminalesPorMarca122)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("urn:obtenerTerminalesPorMarca");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminalesPorMarca122,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorMarca")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorMarca"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorMarca"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorMarca"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorMarca"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerTerminalesPorMarca
                    * @param obtenerTerminalesPorMarca122
                
                */
                public  void startobtenerTerminalesPorMarca(

                 pr.vodafone.dao.ObtenerTerminalesPorMarca obtenerTerminalesPorMarca122,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
             _operationClient.getOptions().setAction("urn:obtenerTerminalesPorMarca");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminalesPorMarca122,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorMarca")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorMarca"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerTerminalesPorMarca(
                                        (pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerTerminalesPorMarca(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorMarca"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorMarca"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorMarca"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerTerminalesPorMarca((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerTerminalesPorMarca(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorMarca(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorMarca(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorMarca(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorMarca(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorMarca(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorMarca(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorMarca(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerTerminalesPorMarca(f);
									    }
									} else {
									    callback.receiveErrorobtenerTerminalesPorMarca(f);
									}
								} else {
								    callback.receiveErrorobtenerTerminalesPorMarca(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerTerminalesPorMarca(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[12].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[12].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#borrarCliente
                     * @param borrarCliente124
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void borrarCliente(

                            pr.vodafone.dao.BorrarCliente borrarCliente124)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("urn:borrarCliente");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarCliente124,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarCliente"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarCliente"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarCliente"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarCliente"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startborrarCliente
                    * @param borrarCliente124
                
                */
                public  void startborrarCliente(

                 pr.vodafone.dao.BorrarCliente borrarCliente124,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
             _operationClient.getOptions().setAction("urn:borrarCliente");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarCliente124,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarCliente"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[13].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[13].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerCliente
                     * @param obtenerCliente126
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerClienteResponse obtenerCliente(

                            pr.vodafone.dao.ObtenerCliente obtenerCliente126)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("urn:obtenerCliente");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerCliente126,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerCliente"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerClienteResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerClienteResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerCliente"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerCliente"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerCliente"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerCliente
                    * @param obtenerCliente126
                
                */
                public  void startobtenerCliente(

                 pr.vodafone.dao.ObtenerCliente obtenerCliente126,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
             _operationClient.getOptions().setAction("urn:obtenerCliente");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerCliente126,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerCliente"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerClienteResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerCliente(
                                        (pr.vodafone.dao.ObtenerClienteResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerCliente(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerCliente"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerCliente"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerCliente"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerCliente((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerCliente(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerCliente(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerCliente(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerCliente(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerCliente(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerCliente(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerCliente(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerCliente(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerCliente(f);
									    }
									} else {
									    callback.receiveErrorobtenerCliente(f);
									}
								} else {
								    callback.receiveErrorobtenerCliente(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerCliente(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[14].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[14].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#borrarTerminales
                     * @param borrarTerminales128
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void borrarTerminales(

                            pr.vodafone.dao.BorrarTerminales borrarTerminales128)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("urn:borrarTerminales");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarTerminales128,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarTerminales")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarTerminales"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarTerminales"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarTerminales"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarTerminales"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startborrarTerminales
                    * @param borrarTerminales128
                
                */
                public  void startborrarTerminales(

                 pr.vodafone.dao.BorrarTerminales borrarTerminales128,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
             _operationClient.getOptions().setAction("urn:borrarTerminales");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarTerminales128,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarTerminales")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarTerminales"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[15].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[15].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#borrarFactura
                     * @param borrarFactura130
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void borrarFactura(

                            pr.vodafone.dao.BorrarFactura borrarFactura130)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("urn:borrarFactura");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarFactura130,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarFactura")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarFactura"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarFactura"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarFactura"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarFactura"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startborrarFactura
                    * @param borrarFactura130
                
                */
                public  void startborrarFactura(

                 pr.vodafone.dao.BorrarFactura borrarFactura130,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
             _operationClient.getOptions().setAction("urn:borrarFactura");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarFactura130,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarFactura")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarFactura"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[16].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[16].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#contarLineas
                     * @param contarLineas132
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ContarLineasResponse contarLineas(

                            pr.vodafone.dao.ContarLineas contarLineas132)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("urn:contarLineas");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contarLineas132,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarLineas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarLineas"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ContarLineasResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ContarLineasResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarLineas"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarLineas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarLineas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startcontarLineas
                    * @param contarLineas132
                
                */
                public  void startcontarLineas(

                 pr.vodafone.dao.ContarLineas contarLineas132,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
             _operationClient.getOptions().setAction("urn:contarLineas");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contarLineas132,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarLineas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarLineas"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ContarLineasResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcontarLineas(
                                        (pr.vodafone.dao.ContarLineasResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcontarLineas(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarLineas"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarLineas"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarLineas"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorcontarLineas((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcontarLineas(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarLineas(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarLineas(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarLineas(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarLineas(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarLineas(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarLineas(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarLineas(f);
                                            }
									    } else {
										    callback.receiveErrorcontarLineas(f);
									    }
									} else {
									    callback.receiveErrorcontarLineas(f);
									}
								} else {
								    callback.receiveErrorcontarLineas(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcontarLineas(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[17].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[17].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#borrarLineas
                     * @param borrarLineas134
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void borrarLineas(

                            pr.vodafone.dao.BorrarLineas borrarLineas134)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("urn:borrarLineas");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarLineas134,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarLineas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarLineas"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarLineas"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarLineas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarLineas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startborrarLineas
                    * @param borrarLineas134
                
                */
                public  void startborrarLineas(

                 pr.vodafone.dao.BorrarLineas borrarLineas134,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
             _operationClient.getOptions().setAction("urn:borrarLineas");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarLineas134,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarLineas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarLineas"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[18].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[18].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#actualizarFactura
                     * @param actualizarFactura136
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void actualizarFactura(

                            pr.vodafone.dao.ActualizarFactura actualizarFactura136)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("urn:actualizarFactura");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    actualizarFactura136,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarFactura")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarFactura"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarFactura"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarFactura"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarFactura"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startactualizarFactura
                    * @param actualizarFactura136
                
                */
                public  void startactualizarFactura(

                 pr.vodafone.dao.ActualizarFactura actualizarFactura136,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
             _operationClient.getOptions().setAction("urn:actualizarFactura");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    actualizarFactura136,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarFactura")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarFactura"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[19].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[19].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#insertarTerminal
                     * @param insertarTerminal138
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void insertarTerminal(

                            pr.vodafone.dao.InsertarTerminal insertarTerminal138)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("urn:insertarTerminal");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    insertarTerminal138,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarTerminal")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarTerminal"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarTerminal"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarTerminal"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarTerminal"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startinsertarTerminal
                    * @param insertarTerminal138
                
                */
                public  void startinsertarTerminal(

                 pr.vodafone.dao.InsertarTerminal insertarTerminal138,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
             _operationClient.getOptions().setAction("urn:insertarTerminal");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    insertarTerminal138,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarTerminal")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarTerminal"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[20].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[20].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#insertarFactura
                     * @param insertarFactura140
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.InsertarFacturaResponse insertarFactura(

                            pr.vodafone.dao.InsertarFactura insertarFactura140)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("urn:insertarFactura");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    insertarFactura140,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarFactura")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarFactura"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.InsertarFacturaResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.InsertarFacturaResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarFactura"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarFactura"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarFactura"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startinsertarFactura
                    * @param insertarFactura140
                
                */
                public  void startinsertarFactura(

                 pr.vodafone.dao.InsertarFactura insertarFactura140,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
             _operationClient.getOptions().setAction("urn:insertarFactura");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    insertarFactura140,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarFactura")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarFactura"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.InsertarFacturaResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultinsertarFactura(
                                        (pr.vodafone.dao.InsertarFacturaResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorinsertarFactura(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarFactura"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarFactura"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarFactura"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorinsertarFactura((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorinsertarFactura(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinsertarFactura(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinsertarFactura(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinsertarFactura(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinsertarFactura(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinsertarFactura(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinsertarFactura(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorinsertarFactura(f);
                                            }
									    } else {
										    callback.receiveErrorinsertarFactura(f);
									    }
									} else {
									    callback.receiveErrorinsertarFactura(f);
									}
								} else {
								    callback.receiveErrorinsertarFactura(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorinsertarFactura(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[21].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[21].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#actualizarLinea
                     * @param actualizarLinea142
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void actualizarLinea(

                            pr.vodafone.dao.ActualizarLinea actualizarLinea142)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("urn:actualizarLinea");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    actualizarLinea142,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarLinea"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarLinea"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarLinea"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarLinea"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startactualizarLinea
                    * @param actualizarLinea142
                
                */
                public  void startactualizarLinea(

                 pr.vodafone.dao.ActualizarLinea actualizarLinea142,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
             _operationClient.getOptions().setAction("urn:actualizarLinea");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    actualizarLinea142,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarLinea"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[22].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[22].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerFacturasLinea
                     * @param obtenerFacturasLinea144
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerFacturasLineaResponse obtenerFacturasLinea(

                            pr.vodafone.dao.ObtenerFacturasLinea obtenerFacturasLinea144)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("urn:obtenerFacturasLinea");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerFacturasLinea144,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturasLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturasLinea"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerFacturasLineaResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerFacturasLineaResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasLinea"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasLinea"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasLinea"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerFacturasLinea
                    * @param obtenerFacturasLinea144
                
                */
                public  void startobtenerFacturasLinea(

                 pr.vodafone.dao.ObtenerFacturasLinea obtenerFacturasLinea144,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
             _operationClient.getOptions().setAction("urn:obtenerFacturasLinea");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerFacturasLinea144,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturasLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturasLinea"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerFacturasLineaResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerFacturasLinea(
                                        (pr.vodafone.dao.ObtenerFacturasLineaResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerFacturasLinea(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasLinea"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasLinea"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasLinea"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerFacturasLinea((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerFacturasLinea(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasLinea(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasLinea(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasLinea(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasLinea(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasLinea(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasLinea(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasLinea(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerFacturasLinea(f);
									    }
									} else {
									    callback.receiveErrorobtenerFacturasLinea(f);
									}
								} else {
								    callback.receiveErrorobtenerFacturasLinea(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerFacturasLinea(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[23].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[23].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerLinea
                     * @param obtenerLinea146
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerLineaResponse obtenerLinea(

                            pr.vodafone.dao.ObtenerLinea obtenerLinea146)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("urn:obtenerLinea");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLinea146,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLinea"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerLineaResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerLineaResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLinea"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLinea"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLinea"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerLinea
                    * @param obtenerLinea146
                
                */
                public  void startobtenerLinea(

                 pr.vodafone.dao.ObtenerLinea obtenerLinea146,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
             _operationClient.getOptions().setAction("urn:obtenerLinea");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLinea146,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLinea"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerLineaResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerLinea(
                                        (pr.vodafone.dao.ObtenerLineaResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerLinea(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLinea"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLinea"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLinea"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerLinea((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerLinea(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLinea(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLinea(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLinea(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLinea(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLinea(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLinea(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLinea(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerLinea(f);
									    }
									} else {
									    callback.receiveErrorobtenerLinea(f);
									}
								} else {
								    callback.receiveErrorobtenerLinea(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerLinea(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[24].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[24].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerTerminales
                     * @param obtenerTerminales148
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerTerminalesResponse obtenerTerminales(

                            pr.vodafone.dao.ObtenerTerminales obtenerTerminales148)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
              _operationClient.getOptions().setAction("urn:obtenerTerminales");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminales148,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminales")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminales"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerTerminalesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerTerminalesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminales"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminales"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminales"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerTerminales
                    * @param obtenerTerminales148
                
                */
                public  void startobtenerTerminales(

                 pr.vodafone.dao.ObtenerTerminales obtenerTerminales148,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
             _operationClient.getOptions().setAction("urn:obtenerTerminales");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminales148,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminales")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminales"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerTerminalesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerTerminales(
                                        (pr.vodafone.dao.ObtenerTerminalesResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerTerminales(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminales"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminales"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminales"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerTerminales((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerTerminales(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminales(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminales(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminales(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminales(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminales(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminales(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminales(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerTerminales(f);
									    }
									} else {
									    callback.receiveErrorobtenerTerminales(f);
									}
								} else {
								    callback.receiveErrorobtenerTerminales(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerTerminales(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[25].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[25].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#insertarLinea
                     * @param insertarLinea150
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void insertarLinea(

                            pr.vodafone.dao.InsertarLinea insertarLinea150)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
              _operationClient.getOptions().setAction("urn:insertarLinea");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    insertarLinea150,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarLinea"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarLinea"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarLinea"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"insertarLinea"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startinsertarLinea
                    * @param insertarLinea150
                
                */
                public  void startinsertarLinea(

                 pr.vodafone.dao.InsertarLinea insertarLinea150,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
             _operationClient.getOptions().setAction("urn:insertarLinea");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    insertarLinea150,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "insertarLinea"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[26].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[26].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerLineasCliente
                     * @param obtenerLineasCliente152
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerLineasClienteResponse obtenerLineasCliente(

                            pr.vodafone.dao.ObtenerLineasCliente obtenerLineasCliente152)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
              _operationClient.getOptions().setAction("urn:obtenerLineasCliente");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLineasCliente152,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasCliente"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerLineasClienteResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerLineasClienteResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasCliente"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasCliente"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasCliente"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerLineasCliente
                    * @param obtenerLineasCliente152
                
                */
                public  void startobtenerLineasCliente(

                 pr.vodafone.dao.ObtenerLineasCliente obtenerLineasCliente152,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
             _operationClient.getOptions().setAction("urn:obtenerLineasCliente");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLineasCliente152,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasCliente"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerLineasClienteResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerLineasCliente(
                                        (pr.vodafone.dao.ObtenerLineasClienteResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerLineasCliente(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasCliente"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasCliente"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasCliente"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerLineasCliente((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerLineasCliente(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasCliente(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasCliente(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasCliente(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasCliente(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasCliente(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasCliente(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasCliente(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerLineasCliente(f);
									    }
									} else {
									    callback.receiveErrorobtenerLineasCliente(f);
									}
								} else {
								    callback.receiveErrorobtenerLineasCliente(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerLineasCliente(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[27].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[27].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerTerminalesPorModelo
                     * @param obtenerTerminalesPorModelo154
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerTerminalesPorModeloResponse obtenerTerminalesPorModelo(

                            pr.vodafone.dao.ObtenerTerminalesPorModelo obtenerTerminalesPorModelo154)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
              _operationClient.getOptions().setAction("urn:obtenerTerminalesPorModelo");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminalesPorModelo154,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorModelo")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorModelo"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerTerminalesPorModeloResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerTerminalesPorModeloResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorModelo"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorModelo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorModelo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerTerminalesPorModelo
                    * @param obtenerTerminalesPorModelo154
                
                */
                public  void startobtenerTerminalesPorModelo(

                 pr.vodafone.dao.ObtenerTerminalesPorModelo obtenerTerminalesPorModelo154,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
             _operationClient.getOptions().setAction("urn:obtenerTerminalesPorModelo");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminalesPorModelo154,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorModelo")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorModelo"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerTerminalesPorModeloResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerTerminalesPorModelo(
                                        (pr.vodafone.dao.ObtenerTerminalesPorModeloResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerTerminalesPorModelo(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorModelo"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorModelo"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorModelo"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerTerminalesPorModelo((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerTerminalesPorModelo(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorModelo(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorModelo(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorModelo(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorModelo(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorModelo(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorModelo(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorModelo(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerTerminalesPorModelo(f);
									    }
									} else {
									    callback.receiveErrorobtenerTerminalesPorModelo(f);
									}
								} else {
								    callback.receiveErrorobtenerTerminalesPorModelo(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerTerminalesPorModelo(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[28].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[28].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#actualizarTerminal
                     * @param actualizarTerminal156
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void actualizarTerminal(

                            pr.vodafone.dao.ActualizarTerminal actualizarTerminal156)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
              _operationClient.getOptions().setAction("urn:actualizarTerminal");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    actualizarTerminal156,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarTerminal")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarTerminal"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarTerminal"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarTerminal"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"actualizarTerminal"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startactualizarTerminal
                    * @param actualizarTerminal156
                
                */
                public  void startactualizarTerminal(

                 pr.vodafone.dao.ActualizarTerminal actualizarTerminal156,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
             _operationClient.getOptions().setAction("urn:actualizarTerminal");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    actualizarTerminal156,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarTerminal")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "actualizarTerminal"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[29].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[29].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#contarFacturas
                     * @param contarFacturas158
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ContarFacturasResponse contarFacturas(

                            pr.vodafone.dao.ContarFacturas contarFacturas158)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
              _operationClient.getOptions().setAction("urn:contarFacturas");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contarFacturas158,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarFacturas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarFacturas"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ContarFacturasResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ContarFacturasResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarFacturas"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarFacturas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarFacturas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startcontarFacturas
                    * @param contarFacturas158
                
                */
                public  void startcontarFacturas(

                 pr.vodafone.dao.ContarFacturas contarFacturas158,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
             _operationClient.getOptions().setAction("urn:contarFacturas");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contarFacturas158,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarFacturas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarFacturas"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ContarFacturasResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcontarFacturas(
                                        (pr.vodafone.dao.ContarFacturasResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcontarFacturas(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarFacturas"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarFacturas"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarFacturas"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorcontarFacturas((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcontarFacturas(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarFacturas(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarFacturas(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarFacturas(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarFacturas(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarFacturas(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarFacturas(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarFacturas(f);
                                            }
									    } else {
										    callback.receiveErrorcontarFacturas(f);
									    }
									} else {
									    callback.receiveErrorcontarFacturas(f);
									}
								} else {
								    callback.receiveErrorcontarFacturas(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcontarFacturas(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[30].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[30].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerFactura
                     * @param obtenerFactura160
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerFacturaResponse obtenerFactura(

                            pr.vodafone.dao.ObtenerFactura obtenerFactura160)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
              _operationClient.getOptions().setAction("urn:obtenerFactura");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerFactura160,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFactura")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFactura"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerFacturaResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerFacturaResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFactura"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFactura"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFactura"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerFactura
                    * @param obtenerFactura160
                
                */
                public  void startobtenerFactura(

                 pr.vodafone.dao.ObtenerFactura obtenerFactura160,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[31].getName());
             _operationClient.getOptions().setAction("urn:obtenerFactura");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerFactura160,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFactura")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFactura"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerFacturaResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerFactura(
                                        (pr.vodafone.dao.ObtenerFacturaResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerFactura(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFactura"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFactura"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFactura"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerFactura((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerFactura(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFactura(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFactura(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFactura(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFactura(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFactura(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFactura(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFactura(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerFactura(f);
									    }
									} else {
									    callback.receiveErrorobtenerFactura(f);
									}
								} else {
								    callback.receiveErrorobtenerFactura(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerFactura(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[31].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[31].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#contarTerminales
                     * @param contarTerminales162
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ContarTerminalesResponse contarTerminales(

                            pr.vodafone.dao.ContarTerminales contarTerminales162)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
              _operationClient.getOptions().setAction("urn:contarTerminales");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contarTerminales162,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarTerminales")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarTerminales"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ContarTerminalesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ContarTerminalesResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarTerminales"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarTerminales"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarTerminales"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startcontarTerminales
                    * @param contarTerminales162
                
                */
                public  void startcontarTerminales(

                 pr.vodafone.dao.ContarTerminales contarTerminales162,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[32].getName());
             _operationClient.getOptions().setAction("urn:contarTerminales");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    contarTerminales162,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarTerminales")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "contarTerminales"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ContarTerminalesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcontarTerminales(
                                        (pr.vodafone.dao.ContarTerminalesResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcontarTerminales(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarTerminales"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarTerminales"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"contarTerminales"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorcontarTerminales((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcontarTerminales(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarTerminales(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarTerminales(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarTerminales(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarTerminales(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarTerminales(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarTerminales(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcontarTerminales(f);
                                            }
									    } else {
										    callback.receiveErrorcontarTerminales(f);
									    }
									} else {
									    callback.receiveErrorcontarTerminales(f);
									}
								} else {
								    callback.receiveErrorcontarTerminales(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcontarTerminales(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[32].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[32].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerTerminal
                     * @param obtenerTerminal164
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerTerminalResponse obtenerTerminal(

                            pr.vodafone.dao.ObtenerTerminal obtenerTerminal164)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
              _operationClient.getOptions().setAction("urn:obtenerTerminal");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminal164,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminal")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminal"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerTerminalResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerTerminalResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminal"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminal"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminal"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerTerminal
                    * @param obtenerTerminal164
                
                */
                public  void startobtenerTerminal(

                 pr.vodafone.dao.ObtenerTerminal obtenerTerminal164,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[33].getName());
             _operationClient.getOptions().setAction("urn:obtenerTerminal");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminal164,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminal")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminal"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerTerminalResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerTerminal(
                                        (pr.vodafone.dao.ObtenerTerminalResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerTerminal(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminal"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminal"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminal"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerTerminal((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerTerminal(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminal(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminal(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminal(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminal(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminal(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminal(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminal(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerTerminal(f);
									    }
									} else {
									    callback.receiveErrorobtenerTerminal(f);
									}
								} else {
								    callback.receiveErrorobtenerTerminal(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerTerminal(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[33].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[33].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerFacturasCliente
                     * @param obtenerFacturasCliente166
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerFacturasClienteResponse obtenerFacturasCliente(

                            pr.vodafone.dao.ObtenerFacturasCliente obtenerFacturasCliente166)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
              _operationClient.getOptions().setAction("urn:obtenerFacturasCliente");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerFacturasCliente166,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturasCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturasCliente"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerFacturasClienteResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerFacturasClienteResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasCliente"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasCliente"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasCliente"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerFacturasCliente
                    * @param obtenerFacturasCliente166
                
                */
                public  void startobtenerFacturasCliente(

                 pr.vodafone.dao.ObtenerFacturasCliente obtenerFacturasCliente166,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[34].getName());
             _operationClient.getOptions().setAction("urn:obtenerFacturasCliente");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerFacturasCliente166,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturasCliente")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturasCliente"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerFacturasClienteResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerFacturasCliente(
                                        (pr.vodafone.dao.ObtenerFacturasClienteResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerFacturasCliente(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasCliente"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasCliente"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturasCliente"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerFacturasCliente((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerFacturasCliente(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasCliente(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasCliente(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasCliente(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasCliente(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasCliente(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasCliente(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturasCliente(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerFacturasCliente(f);
									    }
									} else {
									    callback.receiveErrorobtenerFacturasCliente(f);
									}
								} else {
								    callback.receiveErrorobtenerFacturasCliente(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerFacturasCliente(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[34].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[34].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerLineasActivas
                     * @param obtenerLineasActivas168
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerLineasActivasResponse obtenerLineasActivas(

                            pr.vodafone.dao.ObtenerLineasActivas obtenerLineasActivas168)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[35].getName());
              _operationClient.getOptions().setAction("urn:obtenerLineasActivas");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLineasActivas168,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasActivas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasActivas"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerLineasActivasResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerLineasActivasResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivas"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerLineasActivas
                    * @param obtenerLineasActivas168
                
                */
                public  void startobtenerLineasActivas(

                 pr.vodafone.dao.ObtenerLineasActivas obtenerLineasActivas168,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[35].getName());
             _operationClient.getOptions().setAction("urn:obtenerLineasActivas");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerLineasActivas168,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasActivas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerLineasActivas"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerLineasActivasResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerLineasActivas(
                                        (pr.vodafone.dao.ObtenerLineasActivasResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerLineasActivas(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivas"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivas"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerLineasActivas"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerLineasActivas((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerLineasActivas(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivas(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivas(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivas(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivas(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivas(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivas(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerLineasActivas(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerLineasActivas(f);
									    }
									} else {
									    callback.receiveErrorobtenerLineasActivas(f);
									}
								} else {
								    callback.receiveErrorobtenerLineasActivas(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerLineasActivas(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[35].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[35].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#activarLinea
                     * @param activarLinea170
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void activarLinea(

                            pr.vodafone.dao.ActivarLinea activarLinea170)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[36].getName());
              _operationClient.getOptions().setAction("urn:activarLinea");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    activarLinea170,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "activarLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "activarLinea"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"activarLinea"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"activarLinea"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"activarLinea"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startactivarLinea
                    * @param activarLinea170
                
                */
                public  void startactivarLinea(

                 pr.vodafone.dao.ActivarLinea activarLinea170,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[36].getName());
             _operationClient.getOptions().setAction("urn:activarLinea");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    activarLinea170,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "activarLinea")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "activarLinea"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[36].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[36].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerFacturas
                     * @param obtenerFacturas172
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerFacturasResponse obtenerFacturas(

                            pr.vodafone.dao.ObtenerFacturas obtenerFacturas172)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[37].getName());
              _operationClient.getOptions().setAction("urn:obtenerFacturas");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerFacturas172,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturas"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerFacturasResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerFacturasResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturas"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerFacturas
                    * @param obtenerFacturas172
                
                */
                public  void startobtenerFacturas(

                 pr.vodafone.dao.ObtenerFacturas obtenerFacturas172,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[37].getName());
             _operationClient.getOptions().setAction("urn:obtenerFacturas");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerFacturas172,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturas")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerFacturas"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerFacturasResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerFacturas(
                                        (pr.vodafone.dao.ObtenerFacturasResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerFacturas(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturas"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturas"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerFacturas"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerFacturas((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerFacturas(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturas(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturas(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturas(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturas(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturas(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturas(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerFacturas(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerFacturas(f);
									    }
									} else {
									    callback.receiveErrorobtenerFacturas(f);
									}
								} else {
								    callback.receiveErrorobtenerFacturas(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerFacturas(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[37].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[37].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#borrarClientes
                     * @param borrarClientes174
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  void borrarClientes(

                            pr.vodafone.dao.BorrarClientes borrarClientes174)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[38].getName());
              _operationClient.getOptions().setAction("urn:borrarClientes");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarClientes174,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarClientes")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarClientes"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
                return;
            
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarClientes"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarClientes"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"borrarClientes"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startborrarClientes
                    * @param borrarClientes174
                
                */
                public  void startborrarClientes(

                 pr.vodafone.dao.BorrarClientes borrarClientes174,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[38].getName());
             _operationClient.getOptions().setAction("urn:borrarClientes");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    borrarClientes174,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarClientes")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "borrarClientes"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                            // Nothing to pass as the callback!!!
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[38].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[38].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see pr.vodafone.dao.TerminalManager#obtenerTerminalesPorPrecio
                     * @param obtenerTerminalesPorPrecio176
                    
                     * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
                     */

                    

                            public  pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse obtenerTerminalesPorPrecio(

                            pr.vodafone.dao.ObtenerTerminalesPorPrecio obtenerTerminalesPorPrecio176)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,pr.vodafone.dao.TerminalManagerSQLExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[39].getName());
              _operationClient.getOptions().setAction("urn:obtenerTerminalesPorPrecio");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminalesPorPrecio176,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorPrecio")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorPrecio"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorPrecio"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorPrecio"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorPrecio"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
                          throw (pr.vodafone.dao.TerminalManagerSQLExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see pr.vodafone.dao.TerminalManager#startobtenerTerminalesPorPrecio
                    * @param obtenerTerminalesPorPrecio176
                
                */
                public  void startobtenerTerminalesPorPrecio(

                 pr.vodafone.dao.ObtenerTerminalesPorPrecio obtenerTerminalesPorPrecio176,

                  final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[39].getName());
             _operationClient.getOptions().setAction("urn:obtenerTerminalesPorPrecio");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    obtenerTerminalesPorPrecio176,
                                                    optimizeContent(new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorPrecio")), new javax.xml.namespace.QName("http://dao.vodafone.pr",
                                                    "obtenerTerminalesPorPrecio"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultobtenerTerminalesPorPrecio(
                                        (pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorobtenerTerminalesPorPrecio(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorPrecio"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorPrecio"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"obtenerTerminalesPorPrecio"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof pr.vodafone.dao.TerminalManagerSQLExceptionException){
														callback.receiveErrorobtenerTerminalesPorPrecio((pr.vodafone.dao.TerminalManagerSQLExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorobtenerTerminalesPorPrecio(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorPrecio(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorPrecio(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorPrecio(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorPrecio(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorPrecio(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorPrecio(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorobtenerTerminalesPorPrecio(f);
                                            }
									    } else {
										    callback.receiveErrorobtenerTerminalesPorPrecio(f);
									    }
									} else {
									    callback.receiveErrorobtenerTerminalesPorPrecio(f);
									}
								} else {
								    callback.receiveErrorobtenerTerminalesPorPrecio(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorobtenerTerminalesPorPrecio(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[39].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[39].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://localhost:8080/axis2/services/TerminalManager.TerminalManagerHttpSoap12Endpoint/
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ActualizarCliente param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ActualizarCliente.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.TerminalManagerSQLException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.TerminalManagerSQLException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerClientesPorNombre param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerClientesPorNombre.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerClientesPorNombreResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerClientesPorNombreResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.Conectar param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.Conectar.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.TerminalManagerClassNotFoundException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.TerminalManagerClassNotFoundException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.BorrarFacturas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.BorrarFacturas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.BorrarTerminal param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.BorrarTerminal.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ContarClientes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ContarClientes.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ContarClientesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ContarClientesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLineas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLineas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLineasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLineasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLineasActivasCliente param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLineasActivasCliente.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLineasActivasClienteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLineasActivasClienteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.BorrarLinea param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.BorrarLinea.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerClientes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerClientes.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerClientesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerClientesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.InsertarCliente param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.InsertarCliente.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.Desconectar param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.Desconectar.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminalesPorMarca param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminalesPorMarca.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.BorrarCliente param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.BorrarCliente.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerCliente param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerCliente.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerClienteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerClienteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.BorrarTerminales param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.BorrarTerminales.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.BorrarFactura param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.BorrarFactura.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ContarLineas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ContarLineas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ContarLineasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ContarLineasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.BorrarLineas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.BorrarLineas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ActualizarFactura param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ActualizarFactura.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.InsertarTerminal param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.InsertarTerminal.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.InsertarFactura param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.InsertarFactura.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.InsertarFacturaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.InsertarFacturaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ActualizarLinea param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ActualizarLinea.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerFacturasLinea param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerFacturasLinea.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerFacturasLineaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerFacturasLineaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLinea param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLinea.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLineaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLineaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminales param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminales.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminalesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminalesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.InsertarLinea param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.InsertarLinea.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLineasCliente param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLineasCliente.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLineasClienteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLineasClienteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminalesPorModelo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminalesPorModelo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminalesPorModeloResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminalesPorModeloResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ActualizarTerminal param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ActualizarTerminal.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ContarFacturas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ContarFacturas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ContarFacturasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ContarFacturasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerFactura param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerFactura.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerFacturaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerFacturaResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ContarTerminales param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ContarTerminales.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ContarTerminalesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ContarTerminalesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminal param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminal.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminalResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminalResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerFacturasCliente param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerFacturasCliente.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerFacturasClienteResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerFacturasClienteResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLineasActivas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLineasActivas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerLineasActivasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerLineasActivasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ActivarLinea param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ActivarLinea.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerFacturas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerFacturas.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerFacturasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerFacturasResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.BorrarClientes param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.BorrarClientes.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminalesPorPrecio param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminalesPorPrecio.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ActualizarCliente param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ActualizarCliente.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerClientesPorNombre param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerClientesPorNombre.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.Conectar param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.Conectar.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.BorrarFacturas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.BorrarFacturas.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.BorrarTerminal param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.BorrarTerminal.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ContarClientes param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ContarClientes.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerLineas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerLineas.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerLineasActivasCliente param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerLineasActivasCliente.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.BorrarLinea param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.BorrarLinea.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerClientes param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerClientes.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.InsertarCliente param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.InsertarCliente.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.Desconectar param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.Desconectar.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerTerminalesPorMarca param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerTerminalesPorMarca.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.BorrarCliente param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.BorrarCliente.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerCliente param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerCliente.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.BorrarTerminales param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.BorrarTerminales.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.BorrarFactura param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.BorrarFactura.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ContarLineas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ContarLineas.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.BorrarLineas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.BorrarLineas.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ActualizarFactura param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ActualizarFactura.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.InsertarTerminal param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.InsertarTerminal.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.InsertarFactura param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.InsertarFactura.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ActualizarLinea param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ActualizarLinea.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerFacturasLinea param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerFacturasLinea.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerLinea param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerLinea.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerTerminales param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerTerminales.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.InsertarLinea param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.InsertarLinea.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerLineasCliente param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerLineasCliente.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerTerminalesPorModelo param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerTerminalesPorModelo.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ActualizarTerminal param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ActualizarTerminal.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ContarFacturas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ContarFacturas.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerFactura param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerFactura.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ContarTerminales param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ContarTerminales.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerTerminal param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerTerminal.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerFacturasCliente param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerFacturasCliente.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerLineasActivas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerLineasActivas.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ActivarLinea param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ActivarLinea.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerFacturas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerFacturas.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.BorrarClientes param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.BorrarClientes.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, pr.vodafone.dao.ObtenerTerminalesPorPrecio param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(pr.vodafone.dao.ObtenerTerminalesPorPrecio.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (pr.vodafone.dao.ActualizarCliente.class.equals(type)){
                
                           return pr.vodafone.dao.ActualizarCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerClientesPorNombre.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerClientesPorNombre.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerClientesPorNombreResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerClientesPorNombreResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.Conectar.class.equals(type)){
                
                           return pr.vodafone.dao.Conectar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerClassNotFoundException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerClassNotFoundException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.BorrarFacturas.class.equals(type)){
                
                           return pr.vodafone.dao.BorrarFacturas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.BorrarTerminal.class.equals(type)){
                
                           return pr.vodafone.dao.BorrarTerminal.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ContarClientes.class.equals(type)){
                
                           return pr.vodafone.dao.ContarClientes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ContarClientesResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ContarClientesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLineas.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLineas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLineasResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLineasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLineasActivasCliente.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLineasActivasCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLineasActivasClienteResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLineasActivasClienteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.BorrarLinea.class.equals(type)){
                
                           return pr.vodafone.dao.BorrarLinea.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerClientes.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerClientes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerClientesResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerClientesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.InsertarCliente.class.equals(type)){
                
                           return pr.vodafone.dao.InsertarCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.Desconectar.class.equals(type)){
                
                           return pr.vodafone.dao.Desconectar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminalesPorMarca.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminalesPorMarca.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.BorrarCliente.class.equals(type)){
                
                           return pr.vodafone.dao.BorrarCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerCliente.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerClienteResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerClienteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.BorrarTerminales.class.equals(type)){
                
                           return pr.vodafone.dao.BorrarTerminales.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.BorrarFactura.class.equals(type)){
                
                           return pr.vodafone.dao.BorrarFactura.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ContarLineas.class.equals(type)){
                
                           return pr.vodafone.dao.ContarLineas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ContarLineasResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ContarLineasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.BorrarLineas.class.equals(type)){
                
                           return pr.vodafone.dao.BorrarLineas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ActualizarFactura.class.equals(type)){
                
                           return pr.vodafone.dao.ActualizarFactura.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.InsertarTerminal.class.equals(type)){
                
                           return pr.vodafone.dao.InsertarTerminal.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.InsertarFactura.class.equals(type)){
                
                           return pr.vodafone.dao.InsertarFactura.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.InsertarFacturaResponse.class.equals(type)){
                
                           return pr.vodafone.dao.InsertarFacturaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ActualizarLinea.class.equals(type)){
                
                           return pr.vodafone.dao.ActualizarLinea.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerFacturasLinea.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerFacturasLinea.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerFacturasLineaResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerFacturasLineaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLinea.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLinea.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLineaResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLineaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminales.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminales.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminalesResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminalesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.InsertarLinea.class.equals(type)){
                
                           return pr.vodafone.dao.InsertarLinea.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLineasCliente.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLineasCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLineasClienteResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLineasClienteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminalesPorModelo.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminalesPorModelo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminalesPorModeloResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminalesPorModeloResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ActualizarTerminal.class.equals(type)){
                
                           return pr.vodafone.dao.ActualizarTerminal.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ContarFacturas.class.equals(type)){
                
                           return pr.vodafone.dao.ContarFacturas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ContarFacturasResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ContarFacturasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerFactura.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerFactura.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerFacturaResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerFacturaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ContarTerminales.class.equals(type)){
                
                           return pr.vodafone.dao.ContarTerminales.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ContarTerminalesResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ContarTerminalesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminal.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminal.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminalResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminalResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerFacturasCliente.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerFacturasCliente.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerFacturasClienteResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerFacturasClienteResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLineasActivas.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLineasActivas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerLineasActivasResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerLineasActivasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ActivarLinea.class.equals(type)){
                
                           return pr.vodafone.dao.ActivarLinea.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerFacturas.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerFacturas.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerFacturasResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerFacturasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.BorrarClientes.class.equals(type)){
                
                           return pr.vodafone.dao.BorrarClientes.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminalesPorPrecio.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminalesPorPrecio.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse.class.equals(type)){
                
                           return pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (pr.vodafone.dao.TerminalManagerSQLException.class.equals(type)){
                
                           return pr.vodafone.dao.TerminalManagerSQLException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   