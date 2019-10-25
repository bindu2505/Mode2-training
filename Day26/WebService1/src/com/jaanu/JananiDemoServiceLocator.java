/**
 * JananiDemoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jaanu;

public class JananiDemoServiceLocator extends org.apache.axis.client.Service implements com.jaanu.JananiDemoService {

    public JananiDemoServiceLocator() {
    }


    public JananiDemoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JananiDemoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JananiDemo
    private java.lang.String JananiDemo_address = "http://192.168.1.2:8191/SOAPProject/services/JananiDemo";

    public java.lang.String getJananiDemoAddress() {
        return JananiDemo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JananiDemoWSDDServiceName = "JananiDemo";

    public java.lang.String getJananiDemoWSDDServiceName() {
        return JananiDemoWSDDServiceName;
    }

    public void setJananiDemoWSDDServiceName(java.lang.String name) {
        JananiDemoWSDDServiceName = name;
    }

    public com.jaanu.JananiDemo getJananiDemo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JananiDemo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJananiDemo(endpoint);
    }

    public com.jaanu.JananiDemo getJananiDemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jaanu.JananiDemoSoapBindingStub _stub = new com.jaanu.JananiDemoSoapBindingStub(portAddress, this);
            _stub.setPortName(getJananiDemoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJananiDemoEndpointAddress(java.lang.String address) {
        JananiDemo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jaanu.JananiDemo.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jaanu.JananiDemoSoapBindingStub _stub = new com.jaanu.JananiDemoSoapBindingStub(new java.net.URL(JananiDemo_address), this);
                _stub.setPortName(getJananiDemoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("JananiDemo".equals(inputPortName)) {
            return getJananiDemo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jaanu.com", "JananiDemoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jaanu.com", "JananiDemo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JananiDemo".equals(portName)) {
            setJananiDemoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
