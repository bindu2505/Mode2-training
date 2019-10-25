/**
 * SriServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sri;

public class SriServiceLocator extends org.apache.axis.client.Service implements com.sri.SriService {

    public SriServiceLocator() {
    }


    public SriServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SriServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Sri
    private java.lang.String Sri_address = "http://192.168.1.127:8080/SOAP/services/Sri";

    public java.lang.String getSriAddress() {
        return Sri_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SriWSDDServiceName = "Sri";

    public java.lang.String getSriWSDDServiceName() {
        return SriWSDDServiceName;
    }

    public void setSriWSDDServiceName(java.lang.String name) {
        SriWSDDServiceName = name;
    }

    public com.sri.Sri getSri() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Sri_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSri(endpoint);
    }

    public com.sri.Sri getSri(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sri.SriSoapBindingStub _stub = new com.sri.SriSoapBindingStub(portAddress, this);
            _stub.setPortName(getSriWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSriEndpointAddress(java.lang.String address) {
        Sri_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sri.Sri.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sri.SriSoapBindingStub _stub = new com.sri.SriSoapBindingStub(new java.net.URL(Sri_address), this);
                _stub.setPortName(getSriWSDDServiceName());
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
        if ("Sri".equals(inputPortName)) {
            return getSri();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sri.com", "SriService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sri.com", "Sri"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Sri".equals(portName)) {
            setSriEndpointAddress(address);
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
