
/**
 * TerminalManagerSQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package pr.vodafone.dao;

public class TerminalManagerSQLExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1394129745985L;
    
    private pr.vodafone.dao.TerminalManagerSQLException faultMessage;

    
        public TerminalManagerSQLExceptionException() {
            super("TerminalManagerSQLExceptionException");
        }

        public TerminalManagerSQLExceptionException(java.lang.String s) {
           super(s);
        }

        public TerminalManagerSQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public TerminalManagerSQLExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(pr.vodafone.dao.TerminalManagerSQLException msg){
       faultMessage = msg;
    }
    
    public pr.vodafone.dao.TerminalManagerSQLException getFaultMessage(){
       return faultMessage;
    }
}
    