package com.abhishek.mysoapdemo;

public class MovieCatalogProxy implements com.abhishek.mysoapdemo.MovieCatalog {
  private String _endpoint = null;
  private com.abhishek.mysoapdemo.MovieCatalog movieCatalog = null;
  
  public MovieCatalogProxy() {
    _initMovieCatalogProxy();
  }
  
  public MovieCatalogProxy(String endpoint) {
    _endpoint = endpoint;
    _initMovieCatalogProxy();
  }
  
  private void _initMovieCatalogProxy() {
    try {
      movieCatalog = (new com.abhishek.mysoapdemo.MovieCatalogServiceLocator()).getMovieCatalog();
      if (movieCatalog != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)movieCatalog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)movieCatalog)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (movieCatalog != null)
      ((javax.xml.rpc.Stub)movieCatalog)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.abhishek.mysoapdemo.MovieCatalog getMovieCatalog() {
    if (movieCatalog == null)
      _initMovieCatalogProxy();
    return movieCatalog;
  }
  
  public java.lang.String bestPicture() throws java.rmi.RemoteException{
    if (movieCatalog == null)
      _initMovieCatalogProxy();
    return movieCatalog.bestPicture();
  }
  
  
}