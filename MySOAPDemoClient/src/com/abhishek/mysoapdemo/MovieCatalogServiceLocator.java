/**
 * MovieCatalogServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.abhishek.mysoapdemo;

public class MovieCatalogServiceLocator extends org.apache.axis.client.Service implements com.abhishek.mysoapdemo.MovieCatalogService {

    public MovieCatalogServiceLocator() {
    }


    public MovieCatalogServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MovieCatalogServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MovieCatalog
    private java.lang.String MovieCatalog_address = "http://localhost:8080/MySOAPDemo/services/MovieCatalog";

    public java.lang.String getMovieCatalogAddress() {
        return MovieCatalog_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MovieCatalogWSDDServiceName = "MovieCatalog";

    public java.lang.String getMovieCatalogWSDDServiceName() {
        return MovieCatalogWSDDServiceName;
    }

    public void setMovieCatalogWSDDServiceName(java.lang.String name) {
        MovieCatalogWSDDServiceName = name;
    }

    public com.abhishek.mysoapdemo.MovieCatalog getMovieCatalog() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MovieCatalog_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMovieCatalog(endpoint);
    }

    public com.abhishek.mysoapdemo.MovieCatalog getMovieCatalog(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.abhishek.mysoapdemo.MovieCatalogSoapBindingStub _stub = new com.abhishek.mysoapdemo.MovieCatalogSoapBindingStub(portAddress, this);
            _stub.setPortName(getMovieCatalogWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMovieCatalogEndpointAddress(java.lang.String address) {
        MovieCatalog_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.abhishek.mysoapdemo.MovieCatalog.class.isAssignableFrom(serviceEndpointInterface)) {
                com.abhishek.mysoapdemo.MovieCatalogSoapBindingStub _stub = new com.abhishek.mysoapdemo.MovieCatalogSoapBindingStub(new java.net.URL(MovieCatalog_address), this);
                _stub.setPortName(getMovieCatalogWSDDServiceName());
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
        if ("MovieCatalog".equals(inputPortName)) {
            return getMovieCatalog();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://mysoapdemo.abhishek.com", "MovieCatalogService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://mysoapdemo.abhishek.com", "MovieCatalog"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MovieCatalog".equals(portName)) {
            setMovieCatalogEndpointAddress(address);
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
