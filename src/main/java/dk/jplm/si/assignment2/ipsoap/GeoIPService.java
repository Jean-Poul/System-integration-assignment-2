/**
 * GeoIPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package dk.jplm.si.assignment2.ipsoap;

public interface GeoIPService extends javax.xml.rpc.Service {

/**
 * <b>A web service which performs GetIpAddress Lookups.</b>
 */
    public java.lang.String getGeoIPServiceSoapAddress();

    public GeoIPServiceSoap_PortType getGeoIPServiceSoap() throws javax.xml.rpc.ServiceException;

    public GeoIPServiceSoap_PortType getGeoIPServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getGeoIPServiceSoap12Address();

    public GeoIPServiceSoap_PortType getGeoIPServiceSoap12() throws javax.xml.rpc.ServiceException;

    public GeoIPServiceSoap_PortType getGeoIPServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
