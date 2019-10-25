package com.sri;

public class SriProxy implements com.sri.Sri {
  private String _endpoint = null;
  private com.sri.Sri sri = null;
  
  public SriProxy() {
    _initSriProxy();
  }
  
  public SriProxy(String endpoint) {
    _endpoint = endpoint;
    _initSriProxy();
  }
  
  private void _initSriProxy() {
    try {
      sri = (new com.sri.SriServiceLocator()).getSri();
      if (sri != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sri)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sri)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sri != null)
      ((javax.xml.rpc.Stub)sri)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sri.Sri getSri() {
    if (sri == null)
      _initSriProxy();
    return sri;
  }
  
  public int getSapCode() throws java.rmi.RemoteException{
    if (sri == null)
      _initSriProxy();
    return sri.getSapCode();
  }
  
  
}