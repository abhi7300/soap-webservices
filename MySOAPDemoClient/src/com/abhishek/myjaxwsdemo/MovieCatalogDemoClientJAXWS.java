package com.abhishek.myjaxwsdemo;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class MovieCatalogDemoClientJAXWS {

	// http://localhost:8080/MyJAX-WSDemo/moviecatalog?wsdl

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost:8080/StockWebservice/stockendpoint?wsdl");

		/*QName qname = new QName("http://codenuclear.com/", "StockEndPointImplService");

		Service service = Service.create(url, qname);
		StockEndPoint stockEndPoint = service.getPort(StockEndPoint.class);
		System.out.println(stockEndPoint.getStockPrice("Apple"));*/

	}
}
