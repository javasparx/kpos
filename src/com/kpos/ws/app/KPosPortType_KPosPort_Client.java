
package com.kpos.ws.app;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.8
 * Wed Mar 14 23:54:52 EDT 2012
 * Generated source version: 2.2.8
 * 
 */

public final class KPosPortType_KPosPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.kpos.com/app", "KPosService");

    private KPosPortType_KPosPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = KPosService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        KPosService ss = new KPosService(wsdlURL, SERVICE_NAME);
        KPosPortType port = ss.getKPosPort();  
        
        {
        System.out.println("Invoking createCategory...");
        com.kpos.ws.app.CreateCategoryType _createCategory_parameters = new com.kpos.ws.app.CreateCategoryType();
        com.kpos.ws.app.CreateCategoryResponseType _createCategory__return = port.createCategory(_createCategory_parameters);
        System.out.println("createCategory.result=" + _createCategory__return);


        }

        System.exit(0);
    }

}