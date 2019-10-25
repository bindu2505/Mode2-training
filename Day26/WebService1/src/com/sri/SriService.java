/**
 * SriService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sri;

public interface SriService extends javax.xml.rpc.Service {
    public java.lang.String getSriAddress();

    public com.sri.Sri getSri() throws javax.xml.rpc.ServiceException;

    public com.sri.Sri getSri(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
