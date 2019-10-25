package com.jaanu;

public class JananiDemoProxy implements com.jaanu.JananiDemo {
  private String _endpoint = null;
  private com.jaanu.JananiDemo jananiDemo = null;
  
  public JananiDemoProxy() {
    _initJananiDemoProxy();
  }
  
  public JananiDemoProxy(String endpoint) {
    _endpoint = endpoint;
    _initJananiDemoProxy();
  }
  
  private void _initJananiDemoProxy() {
    try {
      jananiDemo = (new com.jaanu.JananiDemoServiceLocator()).getJananiDemo();
      if (jananiDemo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jananiDemo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jananiDemo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jananiDemo != null)
      ((javax.xml.rpc.Stub)jananiDemo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jaanu.JananiDemo getJananiDemo() {
    if (jananiDemo == null)
      _initJananiDemoProxy();
    return jananiDemo;
  }
  
  public int getInt() throws java.rmi.RemoteException{
    if (jananiDemo == null)
      _initJananiDemoProxy();
    return jananiDemo.getInt();
  }
  
  
}