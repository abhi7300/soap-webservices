/**
 * MovieCatalogService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.abhishek.mysoapdemo;

public interface MovieCatalogService extends javax.xml.rpc.Service {
    public java.lang.String getMovieCatalogAddress();

    public com.abhishek.mysoapdemo.MovieCatalog getMovieCatalog() throws javax.xml.rpc.ServiceException;

    public com.abhishek.mysoapdemo.MovieCatalog getMovieCatalog(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
