
/**
 * TerminalManagerClassNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package pr.vodafone.dao;

public class TerminalManagerClassNotFoundExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1394129746000L;
    
    private pr.vodafone.dao.TerminalManagerClassNotFoundException faultMessage;

    
        public TerminalManagerClassNotFoundExceptionException() {
            super("TerminalManagerClassNotFoundExceptionException");
        }

        public TerminalManagerClassNotFoundExceptionException(java.lang.String s) {
           super(s);
        }

        public TerminalManagerClassNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public TerminalManagerClassNotFoundExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(pr.vodafone.dao.TerminalManagerClassNotFoundException msg){
       faultMessage = msg;
    }
    
    public pr.vodafone.dao.TerminalManagerClassNotFoundException getFaultMessage(){
       return faultMessage;
    }
}
    