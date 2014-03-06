

/**
 * TerminalManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package pr.vodafone.dao;

    /*
     *  TerminalManager java interface
     */

    public interface TerminalManager {
          

        /**
          * Auto generated method signature
          * 
                    * @param actualizarCliente18
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void actualizarCliente(

                        pr.vodafone.dao.ActualizarCliente actualizarCliente18)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param actualizarCliente18
            
          */
        public void startactualizarCliente(

            pr.vodafone.dao.ActualizarCliente actualizarCliente18,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerClientesPorNombre20
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerClientesPorNombreResponse obtenerClientesPorNombre(

                        pr.vodafone.dao.ObtenerClientesPorNombre obtenerClientesPorNombre20)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerClientesPorNombre20
            
          */
        public void startobtenerClientesPorNombre(

            pr.vodafone.dao.ObtenerClientesPorNombre obtenerClientesPorNombre20,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param conectar22
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
             * @throws pr.vodafone.dao.TerminalManagerClassNotFoundExceptionException : 
         */

         
                     public void conectar(

                        pr.vodafone.dao.Conectar conectar22)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException
          ,pr.vodafone.dao.TerminalManagerClassNotFoundExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param conectar22
            
          */
        public void startconectar(

            pr.vodafone.dao.Conectar conectar22,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarFacturas24
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void borrarFacturas(

                        pr.vodafone.dao.BorrarFacturas borrarFacturas24)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarFacturas24
            
          */
        public void startborrarFacturas(

            pr.vodafone.dao.BorrarFacturas borrarFacturas24,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarTerminal26
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void borrarTerminal(

                        pr.vodafone.dao.BorrarTerminal borrarTerminal26)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarTerminal26
            
          */
        public void startborrarTerminal(

            pr.vodafone.dao.BorrarTerminal borrarTerminal26,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param contarClientes28
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ContarClientesResponse contarClientes(

                        pr.vodafone.dao.ContarClientes contarClientes28)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param contarClientes28
            
          */
        public void startcontarClientes(

            pr.vodafone.dao.ContarClientes contarClientes28,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerLineas30
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerLineasResponse obtenerLineas(

                        pr.vodafone.dao.ObtenerLineas obtenerLineas30)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerLineas30
            
          */
        public void startobtenerLineas(

            pr.vodafone.dao.ObtenerLineas obtenerLineas30,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerLineasActivasCliente32
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerLineasActivasClienteResponse obtenerLineasActivasCliente(

                        pr.vodafone.dao.ObtenerLineasActivasCliente obtenerLineasActivasCliente32)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerLineasActivasCliente32
            
          */
        public void startobtenerLineasActivasCliente(

            pr.vodafone.dao.ObtenerLineasActivasCliente obtenerLineasActivasCliente32,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarLinea34
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void borrarLinea(

                        pr.vodafone.dao.BorrarLinea borrarLinea34)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarLinea34
            
          */
        public void startborrarLinea(

            pr.vodafone.dao.BorrarLinea borrarLinea34,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerClientes36
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerClientesResponse obtenerClientes(

                        pr.vodafone.dao.ObtenerClientes obtenerClientes36)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerClientes36
            
          */
        public void startobtenerClientes(

            pr.vodafone.dao.ObtenerClientes obtenerClientes36,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarCliente38
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void insertarCliente(

                        pr.vodafone.dao.InsertarCliente insertarCliente38)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarCliente38
            
          */
        public void startinsertarCliente(

            pr.vodafone.dao.InsertarCliente insertarCliente38,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param desconectar40
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void desconectar(

                        pr.vodafone.dao.Desconectar desconectar40)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param desconectar40
            
          */
        public void startdesconectar(

            pr.vodafone.dao.Desconectar desconectar40,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerTerminalesPorMarca42
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse obtenerTerminalesPorMarca(

                        pr.vodafone.dao.ObtenerTerminalesPorMarca obtenerTerminalesPorMarca42)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerTerminalesPorMarca42
            
          */
        public void startobtenerTerminalesPorMarca(

            pr.vodafone.dao.ObtenerTerminalesPorMarca obtenerTerminalesPorMarca42,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarCliente44
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void borrarCliente(

                        pr.vodafone.dao.BorrarCliente borrarCliente44)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarCliente44
            
          */
        public void startborrarCliente(

            pr.vodafone.dao.BorrarCliente borrarCliente44,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerCliente46
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerClienteResponse obtenerCliente(

                        pr.vodafone.dao.ObtenerCliente obtenerCliente46)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerCliente46
            
          */
        public void startobtenerCliente(

            pr.vodafone.dao.ObtenerCliente obtenerCliente46,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarTerminales48
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void borrarTerminales(

                        pr.vodafone.dao.BorrarTerminales borrarTerminales48)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarTerminales48
            
          */
        public void startborrarTerminales(

            pr.vodafone.dao.BorrarTerminales borrarTerminales48,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarFactura50
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void borrarFactura(

                        pr.vodafone.dao.BorrarFactura borrarFactura50)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarFactura50
            
          */
        public void startborrarFactura(

            pr.vodafone.dao.BorrarFactura borrarFactura50,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param contarLineas52
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ContarLineasResponse contarLineas(

                        pr.vodafone.dao.ContarLineas contarLineas52)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param contarLineas52
            
          */
        public void startcontarLineas(

            pr.vodafone.dao.ContarLineas contarLineas52,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarLineas54
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void borrarLineas(

                        pr.vodafone.dao.BorrarLineas borrarLineas54)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarLineas54
            
          */
        public void startborrarLineas(

            pr.vodafone.dao.BorrarLineas borrarLineas54,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param actualizarFactura56
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void actualizarFactura(

                        pr.vodafone.dao.ActualizarFactura actualizarFactura56)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param actualizarFactura56
            
          */
        public void startactualizarFactura(

            pr.vodafone.dao.ActualizarFactura actualizarFactura56,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarTerminal58
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void insertarTerminal(

                        pr.vodafone.dao.InsertarTerminal insertarTerminal58)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarTerminal58
            
          */
        public void startinsertarTerminal(

            pr.vodafone.dao.InsertarTerminal insertarTerminal58,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarFactura60
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.InsertarFacturaResponse insertarFactura(

                        pr.vodafone.dao.InsertarFactura insertarFactura60)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarFactura60
            
          */
        public void startinsertarFactura(

            pr.vodafone.dao.InsertarFactura insertarFactura60,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param actualizarLinea62
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void actualizarLinea(

                        pr.vodafone.dao.ActualizarLinea actualizarLinea62)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param actualizarLinea62
            
          */
        public void startactualizarLinea(

            pr.vodafone.dao.ActualizarLinea actualizarLinea62,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerFacturasLinea64
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerFacturasLineaResponse obtenerFacturasLinea(

                        pr.vodafone.dao.ObtenerFacturasLinea obtenerFacturasLinea64)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerFacturasLinea64
            
          */
        public void startobtenerFacturasLinea(

            pr.vodafone.dao.ObtenerFacturasLinea obtenerFacturasLinea64,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerLinea66
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerLineaResponse obtenerLinea(

                        pr.vodafone.dao.ObtenerLinea obtenerLinea66)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerLinea66
            
          */
        public void startobtenerLinea(

            pr.vodafone.dao.ObtenerLinea obtenerLinea66,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerTerminales68
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerTerminalesResponse obtenerTerminales(

                        pr.vodafone.dao.ObtenerTerminales obtenerTerminales68)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerTerminales68
            
          */
        public void startobtenerTerminales(

            pr.vodafone.dao.ObtenerTerminales obtenerTerminales68,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarLinea70
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void insertarLinea(

                        pr.vodafone.dao.InsertarLinea insertarLinea70)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarLinea70
            
          */
        public void startinsertarLinea(

            pr.vodafone.dao.InsertarLinea insertarLinea70,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerLineasCliente72
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerLineasClienteResponse obtenerLineasCliente(

                        pr.vodafone.dao.ObtenerLineasCliente obtenerLineasCliente72)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerLineasCliente72
            
          */
        public void startobtenerLineasCliente(

            pr.vodafone.dao.ObtenerLineasCliente obtenerLineasCliente72,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerTerminalesPorModelo74
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerTerminalesPorModeloResponse obtenerTerminalesPorModelo(

                        pr.vodafone.dao.ObtenerTerminalesPorModelo obtenerTerminalesPorModelo74)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerTerminalesPorModelo74
            
          */
        public void startobtenerTerminalesPorModelo(

            pr.vodafone.dao.ObtenerTerminalesPorModelo obtenerTerminalesPorModelo74,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param actualizarTerminal76
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void actualizarTerminal(

                        pr.vodafone.dao.ActualizarTerminal actualizarTerminal76)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param actualizarTerminal76
            
          */
        public void startactualizarTerminal(

            pr.vodafone.dao.ActualizarTerminal actualizarTerminal76,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param contarFacturas78
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ContarFacturasResponse contarFacturas(

                        pr.vodafone.dao.ContarFacturas contarFacturas78)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param contarFacturas78
            
          */
        public void startcontarFacturas(

            pr.vodafone.dao.ContarFacturas contarFacturas78,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerFactura80
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerFacturaResponse obtenerFactura(

                        pr.vodafone.dao.ObtenerFactura obtenerFactura80)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerFactura80
            
          */
        public void startobtenerFactura(

            pr.vodafone.dao.ObtenerFactura obtenerFactura80,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param contarTerminales82
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ContarTerminalesResponse contarTerminales(

                        pr.vodafone.dao.ContarTerminales contarTerminales82)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param contarTerminales82
            
          */
        public void startcontarTerminales(

            pr.vodafone.dao.ContarTerminales contarTerminales82,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerTerminal84
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerTerminalResponse obtenerTerminal(

                        pr.vodafone.dao.ObtenerTerminal obtenerTerminal84)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerTerminal84
            
          */
        public void startobtenerTerminal(

            pr.vodafone.dao.ObtenerTerminal obtenerTerminal84,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerFacturasCliente86
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerFacturasClienteResponse obtenerFacturasCliente(

                        pr.vodafone.dao.ObtenerFacturasCliente obtenerFacturasCliente86)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerFacturasCliente86
            
          */
        public void startobtenerFacturasCliente(

            pr.vodafone.dao.ObtenerFacturasCliente obtenerFacturasCliente86,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerLineasActivas88
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerLineasActivasResponse obtenerLineasActivas(

                        pr.vodafone.dao.ObtenerLineasActivas obtenerLineasActivas88)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerLineasActivas88
            
          */
        public void startobtenerLineasActivas(

            pr.vodafone.dao.ObtenerLineasActivas obtenerLineasActivas88,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param activarLinea90
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void activarLinea(

                        pr.vodafone.dao.ActivarLinea activarLinea90)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param activarLinea90
            
          */
        public void startactivarLinea(

            pr.vodafone.dao.ActivarLinea activarLinea90,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerFacturas92
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerFacturasResponse obtenerFacturas(

                        pr.vodafone.dao.ObtenerFacturas obtenerFacturas92)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerFacturas92
            
          */
        public void startobtenerFacturas(

            pr.vodafone.dao.ObtenerFacturas obtenerFacturas92,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarClientes94
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public void borrarClientes(

                        pr.vodafone.dao.BorrarClientes borrarClientes94)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarClientes94
            
          */
        public void startborrarClientes(

            pr.vodafone.dao.BorrarClientes borrarClientes94,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerTerminalesPorPrecio96
                
             * @throws pr.vodafone.dao.TerminalManagerSQLExceptionException : 
         */

         
                     public pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse obtenerTerminalesPorPrecio(

                        pr.vodafone.dao.ObtenerTerminalesPorPrecio obtenerTerminalesPorPrecio96)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.dao.TerminalManagerSQLExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerTerminalesPorPrecio96
            
          */
        public void startobtenerTerminalesPorPrecio(

            pr.vodafone.dao.ObtenerTerminalesPorPrecio obtenerTerminalesPorPrecio96,

            final pr.vodafone.dao.TerminalManagerCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    