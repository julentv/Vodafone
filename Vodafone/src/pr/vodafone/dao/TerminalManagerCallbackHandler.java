
/**
 * TerminalManagerCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package pr.vodafone.dao;

    /**
     *  TerminalManagerCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class TerminalManagerCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public TerminalManagerCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public TerminalManagerCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for actualizarCliente method
            * override this method for handling normal response from actualizarCliente operation
            */
           public void receiveResultactualizarCliente(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from actualizarCliente operation
           */
            public void receiveErroractualizarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerClientesPorNombre method
            * override this method for handling normal response from obtenerClientesPorNombre operation
            */
           public void receiveResultobtenerClientesPorNombre(
                    pr.vodafone.dao.ObtenerClientesPorNombreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerClientesPorNombre operation
           */
            public void receiveErrorobtenerClientesPorNombre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for conectar method
            * override this method for handling normal response from conectar operation
            */
           public void receiveResultconectar(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from conectar operation
           */
            public void receiveErrorconectar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarFacturas method
            * override this method for handling normal response from borrarFacturas operation
            */
           public void receiveResultborrarFacturas(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarFacturas operation
           */
            public void receiveErrorborrarFacturas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarTerminal method
            * override this method for handling normal response from borrarTerminal operation
            */
           public void receiveResultborrarTerminal(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarTerminal operation
           */
            public void receiveErrorborrarTerminal(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for contarClientes method
            * override this method for handling normal response from contarClientes operation
            */
           public void receiveResultcontarClientes(
                    pr.vodafone.dao.ContarClientesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from contarClientes operation
           */
            public void receiveErrorcontarClientes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerLineas method
            * override this method for handling normal response from obtenerLineas operation
            */
           public void receiveResultobtenerLineas(
                    pr.vodafone.dao.ObtenerLineasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerLineas operation
           */
            public void receiveErrorobtenerLineas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerLineasActivasCliente method
            * override this method for handling normal response from obtenerLineasActivasCliente operation
            */
           public void receiveResultobtenerLineasActivasCliente(
                    pr.vodafone.dao.ObtenerLineasActivasClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerLineasActivasCliente operation
           */
            public void receiveErrorobtenerLineasActivasCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarLinea method
            * override this method for handling normal response from borrarLinea operation
            */
           public void receiveResultborrarLinea(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarLinea operation
           */
            public void receiveErrorborrarLinea(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerClientes method
            * override this method for handling normal response from obtenerClientes operation
            */
           public void receiveResultobtenerClientes(
                    pr.vodafone.dao.ObtenerClientesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerClientes operation
           */
            public void receiveErrorobtenerClientes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarCliente method
            * override this method for handling normal response from insertarCliente operation
            */
           public void receiveResultinsertarCliente(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarCliente operation
           */
            public void receiveErrorinsertarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for desconectar method
            * override this method for handling normal response from desconectar operation
            */
           public void receiveResultdesconectar(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from desconectar operation
           */
            public void receiveErrordesconectar(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerTerminalesPorMarca method
            * override this method for handling normal response from obtenerTerminalesPorMarca operation
            */
           public void receiveResultobtenerTerminalesPorMarca(
                    pr.vodafone.dao.ObtenerTerminalesPorMarcaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerTerminalesPorMarca operation
           */
            public void receiveErrorobtenerTerminalesPorMarca(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarCliente method
            * override this method for handling normal response from borrarCliente operation
            */
           public void receiveResultborrarCliente(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarCliente operation
           */
            public void receiveErrorborrarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerCliente method
            * override this method for handling normal response from obtenerCliente operation
            */
           public void receiveResultobtenerCliente(
                    pr.vodafone.dao.ObtenerClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerCliente operation
           */
            public void receiveErrorobtenerCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarTerminales method
            * override this method for handling normal response from borrarTerminales operation
            */
           public void receiveResultborrarTerminales(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarTerminales operation
           */
            public void receiveErrorborrarTerminales(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarFactura method
            * override this method for handling normal response from borrarFactura operation
            */
           public void receiveResultborrarFactura(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarFactura operation
           */
            public void receiveErrorborrarFactura(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for contarLineas method
            * override this method for handling normal response from contarLineas operation
            */
           public void receiveResultcontarLineas(
                    pr.vodafone.dao.ContarLineasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from contarLineas operation
           */
            public void receiveErrorcontarLineas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarLineas method
            * override this method for handling normal response from borrarLineas operation
            */
           public void receiveResultborrarLineas(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarLineas operation
           */
            public void receiveErrorborrarLineas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for actualizarFactura method
            * override this method for handling normal response from actualizarFactura operation
            */
           public void receiveResultactualizarFactura(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from actualizarFactura operation
           */
            public void receiveErroractualizarFactura(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarTerminal method
            * override this method for handling normal response from insertarTerminal operation
            */
           public void receiveResultinsertarTerminal(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarTerminal operation
           */
            public void receiveErrorinsertarTerminal(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarFactura method
            * override this method for handling normal response from insertarFactura operation
            */
           public void receiveResultinsertarFactura(
                    pr.vodafone.dao.InsertarFacturaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarFactura operation
           */
            public void receiveErrorinsertarFactura(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for actualizarLinea method
            * override this method for handling normal response from actualizarLinea operation
            */
           public void receiveResultactualizarLinea(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from actualizarLinea operation
           */
            public void receiveErroractualizarLinea(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerFacturasLinea method
            * override this method for handling normal response from obtenerFacturasLinea operation
            */
           public void receiveResultobtenerFacturasLinea(
                    pr.vodafone.dao.ObtenerFacturasLineaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerFacturasLinea operation
           */
            public void receiveErrorobtenerFacturasLinea(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerLinea method
            * override this method for handling normal response from obtenerLinea operation
            */
           public void receiveResultobtenerLinea(
                    pr.vodafone.dao.ObtenerLineaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerLinea operation
           */
            public void receiveErrorobtenerLinea(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerTerminales method
            * override this method for handling normal response from obtenerTerminales operation
            */
           public void receiveResultobtenerTerminales(
                    pr.vodafone.dao.ObtenerTerminalesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerTerminales operation
           */
            public void receiveErrorobtenerTerminales(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarLinea method
            * override this method for handling normal response from insertarLinea operation
            */
           public void receiveResultinsertarLinea(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarLinea operation
           */
            public void receiveErrorinsertarLinea(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerLineasCliente method
            * override this method for handling normal response from obtenerLineasCliente operation
            */
           public void receiveResultobtenerLineasCliente(
                    pr.vodafone.dao.ObtenerLineasClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerLineasCliente operation
           */
            public void receiveErrorobtenerLineasCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerTerminalesPorModelo method
            * override this method for handling normal response from obtenerTerminalesPorModelo operation
            */
           public void receiveResultobtenerTerminalesPorModelo(
                    pr.vodafone.dao.ObtenerTerminalesPorModeloResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerTerminalesPorModelo operation
           */
            public void receiveErrorobtenerTerminalesPorModelo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for actualizarTerminal method
            * override this method for handling normal response from actualizarTerminal operation
            */
           public void receiveResultactualizarTerminal(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from actualizarTerminal operation
           */
            public void receiveErroractualizarTerminal(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for contarFacturas method
            * override this method for handling normal response from contarFacturas operation
            */
           public void receiveResultcontarFacturas(
                    pr.vodafone.dao.ContarFacturasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from contarFacturas operation
           */
            public void receiveErrorcontarFacturas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerFactura method
            * override this method for handling normal response from obtenerFactura operation
            */
           public void receiveResultobtenerFactura(
                    pr.vodafone.dao.ObtenerFacturaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerFactura operation
           */
            public void receiveErrorobtenerFactura(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for contarTerminales method
            * override this method for handling normal response from contarTerminales operation
            */
           public void receiveResultcontarTerminales(
                    pr.vodafone.dao.ContarTerminalesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from contarTerminales operation
           */
            public void receiveErrorcontarTerminales(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerTerminal method
            * override this method for handling normal response from obtenerTerminal operation
            */
           public void receiveResultobtenerTerminal(
                    pr.vodafone.dao.ObtenerTerminalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerTerminal operation
           */
            public void receiveErrorobtenerTerminal(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerFacturasCliente method
            * override this method for handling normal response from obtenerFacturasCliente operation
            */
           public void receiveResultobtenerFacturasCliente(
                    pr.vodafone.dao.ObtenerFacturasClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerFacturasCliente operation
           */
            public void receiveErrorobtenerFacturasCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerLineasActivas method
            * override this method for handling normal response from obtenerLineasActivas operation
            */
           public void receiveResultobtenerLineasActivas(
                    pr.vodafone.dao.ObtenerLineasActivasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerLineasActivas operation
           */
            public void receiveErrorobtenerLineasActivas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for activarLinea method
            * override this method for handling normal response from activarLinea operation
            */
           public void receiveResultactivarLinea(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from activarLinea operation
           */
            public void receiveErroractivarLinea(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerFacturas method
            * override this method for handling normal response from obtenerFacturas operation
            */
           public void receiveResultobtenerFacturas(
                    pr.vodafone.dao.ObtenerFacturasResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerFacturas operation
           */
            public void receiveErrorobtenerFacturas(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarClientes method
            * override this method for handling normal response from borrarClientes operation
            */
           public void receiveResultborrarClientes(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarClientes operation
           */
            public void receiveErrorborrarClientes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerTerminalesPorPrecio method
            * override this method for handling normal response from obtenerTerminalesPorPrecio operation
            */
           public void receiveResultobtenerTerminalesPorPrecio(
                    pr.vodafone.dao.ObtenerTerminalesPorPrecioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerTerminalesPorPrecio operation
           */
            public void receiveErrorobtenerTerminalesPorPrecio(java.lang.Exception e) {
            }
                


    }
    