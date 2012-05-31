
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
 * Thu May 31 00:43:05 EDT 2012
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
        System.out.println("Invoking listStaff...");
        com.kpos.ws.app.ListStaffType _listStaff_parameters = new com.kpos.ws.app.ListStaffType();
        com.kpos.ws.app.ListStaffResponseType _listStaff__return = port.listStaff(_listStaff_parameters);
        System.out.println("listStaff.result=" + _listStaff__return);


        }
        {
        System.out.println("Invoking deleteCategoryOption...");
        com.kpos.ws.app.DeleteCategoryOptionType _deleteCategoryOption_parameters = new com.kpos.ws.app.DeleteCategoryOptionType();
        com.kpos.ws.app.DeleteCategoryOptionResponseType _deleteCategoryOption__return = port.deleteCategoryOption(_deleteCategoryOption_parameters);
        System.out.println("deleteCategoryOption.result=" + _deleteCategoryOption__return);


        }
        {
        System.out.println("Invoking saveSeatingArea...");
        com.kpos.ws.app.SaveSeatingAreaType _saveSeatingArea_parameters = new com.kpos.ws.app.SaveSeatingAreaType();
        com.kpos.ws.app.SaveSeatingAreaResponseType _saveSeatingArea__return = port.saveSeatingArea(_saveSeatingArea_parameters);
        System.out.println("saveSeatingArea.result=" + _saveSeatingArea__return);


        }
        {
        System.out.println("Invoking saveStaff...");
        com.kpos.ws.app.SaveStaffType _saveStaff_parameters = new com.kpos.ws.app.SaveStaffType();
        com.kpos.ws.app.SaveStaffResponseType _saveStaff__return = port.saveStaff(_saveStaff_parameters);
        System.out.println("saveStaff.result=" + _saveStaff__return);


        }
        {
        System.out.println("Invoking createCategoryOption...");
        com.kpos.ws.app.CreateCategoryOptionType _createCategoryOption_parameters = new com.kpos.ws.app.CreateCategoryOptionType();
        com.kpos.ws.app.CreateCategoryOptionResponseType _createCategoryOption__return = port.createCategoryOption(_createCategoryOption_parameters);
        System.out.println("createCategoryOption.result=" + _createCategoryOption__return);


        }
        {
        System.out.println("Invoking listTables...");
        com.kpos.ws.app.ListTablesType _listTables_parameters = new com.kpos.ws.app.ListTablesType();
        com.kpos.ws.app.ListTablesResponseType _listTables__return = port.listTables(_listTables_parameters);
        System.out.println("listTables.result=" + _listTables__return);


        }
        {
        System.out.println("Invoking saveTable...");
        com.kpos.ws.app.SaveTableType _saveTable_parameters = new com.kpos.ws.app.SaveTableType();
        com.kpos.ws.app.SaveTableResponseType _saveTable__return = port.saveTable(_saveTable_parameters);
        System.out.println("saveTable.result=" + _saveTable__return);


        }
        {
        System.out.println("Invoking listPrinters...");
        com.kpos.ws.app.ListPrintersType _listPrinters_parameters = new com.kpos.ws.app.ListPrintersType();
        com.kpos.ws.app.ListPrintersResponseType _listPrinters__return = port.listPrinters(_listPrinters_parameters);
        System.out.println("listPrinters.result=" + _listPrinters__return);


        }
        {
        System.out.println("Invoking listCategoryOptionHTML...");
        com.kpos.ws.app.ListCategoryOptionHTMLType _listCategoryOptionHTML_parameters = new com.kpos.ws.app.ListCategoryOptionHTMLType();
        com.kpos.ws.app.ListCategoryOptionHTMLResponseType _listCategoryOptionHTML__return = port.listCategoryOptionHTML(_listCategoryOptionHTML_parameters);
        System.out.println("listCategoryOptionHTML.result=" + _listCategoryOptionHTML__return);


        }
        {
        System.out.println("Invoking listSaleItemOptions...");
        com.kpos.ws.app.ListSaleItemOptionsType _listSaleItemOptions_parameters = new com.kpos.ws.app.ListSaleItemOptionsType();
        com.kpos.ws.app.ListSaleItemOptionsResponseType _listSaleItemOptions__return = port.listSaleItemOptions(_listSaleItemOptions_parameters);
        System.out.println("listSaleItemOptions.result=" + _listSaleItemOptions__return);


        }
        {
        System.out.println("Invoking deleteTable...");
        com.kpos.ws.app.DeleteTableType _deleteTable_parameters = new com.kpos.ws.app.DeleteTableType();
        com.kpos.ws.app.DeleteTableResponseType _deleteTable__return = port.deleteTable(_deleteTable_parameters);
        System.out.println("deleteTable.result=" + _deleteTable__return);


        }
        {
        System.out.println("Invoking updateCategoryOption...");
        com.kpos.ws.app.UpdateCategoryOptionType _updateCategoryOption_parameters = new com.kpos.ws.app.UpdateCategoryOptionType();
        com.kpos.ws.app.UpdateCategoryOptionResponseType _updateCategoryOption__return = port.updateCategoryOption(_updateCategoryOption_parameters);
        System.out.println("updateCategoryOption.result=" + _updateCategoryOption__return);


        }
        {
        System.out.println("Invoking updateGlobalOption...");
        com.kpos.ws.app.UpdateGlobalOptionType _updateGlobalOption_parameters = new com.kpos.ws.app.UpdateGlobalOptionType();
        com.kpos.ws.app.UpdateGlobalOptionResponseType _updateGlobalOption__return = port.updateGlobalOption(_updateGlobalOption_parameters);
        System.out.println("updateGlobalOption.result=" + _updateGlobalOption__return);


        }
        {
        System.out.println("Invoking deleteGlobalOption...");
        com.kpos.ws.app.DeleteGlobalOptionType _deleteGlobalOption_parameters = new com.kpos.ws.app.DeleteGlobalOptionType();
        com.kpos.ws.app.DeleteGlobalOptionResponseType _deleteGlobalOption__return = port.deleteGlobalOption(_deleteGlobalOption_parameters);
        System.out.println("deleteGlobalOption.result=" + _deleteGlobalOption__return);


        }
        {
        System.out.println("Invoking listPrintersHTML...");
        com.kpos.ws.app.ListPrintersHTMLType _listPrintersHTML_parameters = new com.kpos.ws.app.ListPrintersHTMLType();
        com.kpos.ws.app.ListPrintersHTMLResponseType _listPrintersHTML__return = port.listPrintersHTML(_listPrintersHTML_parameters);
        System.out.println("listPrintersHTML.result=" + _listPrintersHTML__return);


        }
        {
        System.out.println("Invoking deleteCategory...");
        com.kpos.ws.app.DeleteCategoryType _deleteCategory_parameters = new com.kpos.ws.app.DeleteCategoryType();
        com.kpos.ws.app.DeleteCategoryResponseType _deleteCategory__return = port.deleteCategory(_deleteCategory_parameters);
        System.out.println("deleteCategory.result=" + _deleteCategory__return);


        }
        {
        System.out.println("Invoking updateSaleItemOption...");
        com.kpos.ws.app.UpdateSaleItemOptionType _updateSaleItemOption_parameters = new com.kpos.ws.app.UpdateSaleItemOptionType();
        com.kpos.ws.app.UpdateSaleItemOptionResponseType _updateSaleItemOption__return = port.updateSaleItemOption(_updateSaleItemOption_parameters);
        System.out.println("updateSaleItemOption.result=" + _updateSaleItemOption__return);


        }
        {
        System.out.println("Invoking deleteSaleItem...");
        com.kpos.ws.app.DeleteSaleItemType _deleteSaleItem_parameters = new com.kpos.ws.app.DeleteSaleItemType();
        com.kpos.ws.app.DeleteSaleItemResponseType _deleteSaleItem__return = port.deleteSaleItem(_deleteSaleItem_parameters);
        System.out.println("deleteSaleItem.result=" + _deleteSaleItem__return);


        }
        {
        System.out.println("Invoking listSaleItemsForCategoryHTML...");
        com.kpos.ws.app.ListSaleItemsForCategoryHTMLType _listSaleItemsForCategoryHTML_parameters = new com.kpos.ws.app.ListSaleItemsForCategoryHTMLType();
        com.kpos.ws.app.ListSaleItemsForCategoryHTMLResponseType _listSaleItemsForCategoryHTML__return = port.listSaleItemsForCategoryHTML(_listSaleItemsForCategoryHTML_parameters);
        System.out.println("listSaleItemsForCategoryHTML.result=" + _listSaleItemsForCategoryHTML__return);


        }
        {
        System.out.println("Invoking listCategory...");
        com.kpos.ws.app.ListCategoryType _listCategory_parameters = new com.kpos.ws.app.ListCategoryType();
        com.kpos.ws.app.ListCategoryResponseType _listCategory__return = port.listCategory(_listCategory_parameters);
        System.out.println("listCategory.result=" + _listCategory__return);


        }
        {
        System.out.println("Invoking createCategory...");
        com.kpos.ws.app.CreateCategoryType _createCategory_parameters = new com.kpos.ws.app.CreateCategoryType();
        com.kpos.ws.app.CreateCategoryResponseType _createCategory__return = port.createCategory(_createCategory_parameters);
        System.out.println("createCategory.result=" + _createCategory__return);


        }
        {
        System.out.println("Invoking deleteSaleItemOption...");
        com.kpos.ws.app.DeleteSaleItemOptionType _deleteSaleItemOption_parameters = new com.kpos.ws.app.DeleteSaleItemOptionType();
        com.kpos.ws.app.DeleteSaleItemOptionResponseType _deleteSaleItemOption__return = port.deleteSaleItemOption(_deleteSaleItemOption_parameters);
        System.out.println("deleteSaleItemOption.result=" + _deleteSaleItemOption__return);


        }
        {
        System.out.println("Invoking deleteStaff...");
        com.kpos.ws.app.DeleteStaffType _deleteStaff_parameters = new com.kpos.ws.app.DeleteStaffType();
        com.kpos.ws.app.DeleteStaffResponseType _deleteStaff__return = port.deleteStaff(_deleteStaff_parameters);
        System.out.println("deleteStaff.result=" + _deleteStaff__return);


        }
        {
        System.out.println("Invoking updateSaleItem...");
        com.kpos.ws.app.UpdateSaleItemType _updateSaleItem_parameters = new com.kpos.ws.app.UpdateSaleItemType();
        com.kpos.ws.app.UpdateSaleItemResponseType _updateSaleItem__return = port.updateSaleItem(_updateSaleItem_parameters);
        System.out.println("updateSaleItem.result=" + _updateSaleItem__return);


        }
        {
        System.out.println("Invoking deletePrinter...");
        com.kpos.ws.app.DeletePrinterType _deletePrinter_parameters = new com.kpos.ws.app.DeletePrinterType();
        com.kpos.ws.app.DeletePrinterResponseType _deletePrinter__return = port.deletePrinter(_deletePrinter_parameters);
        System.out.println("deletePrinter.result=" + _deletePrinter__return);


        }
        {
        System.out.println("Invoking settleOrder...");
        com.kpos.ws.app.SettleOrderType _settleOrder_parameters = new com.kpos.ws.app.SettleOrderType();
        com.kpos.ws.app.SettleOrderResponseType _settleOrder__return = port.settleOrder(_settleOrder_parameters);
        System.out.println("settleOrder.result=" + _settleOrder__return);


        }
        {
        System.out.println("Invoking createGlobalOption...");
        com.kpos.ws.app.CreateGlobalOptionType _createGlobalOption_parameters = new com.kpos.ws.app.CreateGlobalOptionType();
        com.kpos.ws.app.CreateGlobalOptionResponseType _createGlobalOption__return = port.createGlobalOption(_createGlobalOption_parameters);
        System.out.println("createGlobalOption.result=" + _createGlobalOption__return);


        }
        {
        System.out.println("Invoking fetchSeatingArea...");
        com.kpos.ws.app.FetchSeatingAreaType _fetchSeatingArea_parameters = new com.kpos.ws.app.FetchSeatingAreaType();
        com.kpos.ws.app.FetchSeatingAreaResponseType _fetchSeatingArea__return = port.fetchSeatingArea(_fetchSeatingArea_parameters);
        System.out.println("fetchSeatingArea.result=" + _fetchSeatingArea__return);


        }
        {
        System.out.println("Invoking listGlobalOption...");
        com.kpos.ws.app.ListGlobalOptionType _listGlobalOption_parameters = new com.kpos.ws.app.ListGlobalOptionType();
        com.kpos.ws.app.ListGlobalOptionResponseType _listGlobalOption__return = port.listGlobalOption(_listGlobalOption_parameters);
        System.out.println("listGlobalOption.result=" + _listGlobalOption__return);


        }
        {
        System.out.println("Invoking getUserFunctionsHTML...");
        com.kpos.ws.app.GetUserFunctionsHTMLType _getUserFunctionsHTML_parameters = new com.kpos.ws.app.GetUserFunctionsHTMLType();
        com.kpos.ws.app.GetUserFunctionsHTMLResponseType _getUserFunctionsHTML__return = port.getUserFunctionsHTML(_getUserFunctionsHTML_parameters);
        System.out.println("getUserFunctionsHTML.result=" + _getUserFunctionsHTML__return);


        }
        {
        System.out.println("Invoking fetchSaleItemOption...");
        com.kpos.ws.app.FetchSaleItemOptionType _fetchSaleItemOption_parameters = new com.kpos.ws.app.FetchSaleItemOptionType();
        com.kpos.ws.app.FetchSaleItemOptionResponseType _fetchSaleItemOption__return = port.fetchSaleItemOption(_fetchSaleItemOption_parameters);
        System.out.println("fetchSaleItemOption.result=" + _fetchSaleItemOption__return);


        }
        {
        System.out.println("Invoking createSaleItemOption...");
        com.kpos.ws.app.CreateSaleItemOptionType _createSaleItemOption_parameters = new com.kpos.ws.app.CreateSaleItemOptionType();
        com.kpos.ws.app.CreateSaleItemOptionResponseType _createSaleItemOption__return = port.createSaleItemOption(_createSaleItemOption_parameters);
        System.out.println("createSaleItemOption.result=" + _createSaleItemOption__return);


        }
        {
        System.out.println("Invoking listCategoryOption...");
        com.kpos.ws.app.ListCategoryOptionType _listCategoryOption_parameters = new com.kpos.ws.app.ListCategoryOptionType();
        com.kpos.ws.app.ListCategoryOptionResponseType _listCategoryOption__return = port.listCategoryOption(_listCategoryOption_parameters);
        System.out.println("listCategoryOption.result=" + _listCategoryOption__return);


        }
        {
        System.out.println("Invoking deleteSeatingArea...");
        com.kpos.ws.app.DeleteSeatingAreaType _deleteSeatingArea_parameters = new com.kpos.ws.app.DeleteSeatingAreaType();
        com.kpos.ws.app.DeleteSeatingAreaResponseType _deleteSeatingArea__return = port.deleteSeatingArea(_deleteSeatingArea_parameters);
        System.out.println("deleteSeatingArea.result=" + _deleteSeatingArea__return);


        }
        {
        System.out.println("Invoking createPrinter...");
        com.kpos.ws.app.CreatePrinterType _createPrinter_parameters = new com.kpos.ws.app.CreatePrinterType();
        com.kpos.ws.app.CreatePrinterResponseType _createPrinter__return = port.createPrinter(_createPrinter_parameters);
        System.out.println("createPrinter.result=" + _createPrinter__return);


        }
        {
        System.out.println("Invoking updatePrinter...");
        com.kpos.ws.app.UpdatePrinterType _updatePrinter_parameters = new com.kpos.ws.app.UpdatePrinterType();
        com.kpos.ws.app.UpdatePrinterResponseType _updatePrinter__return = port.updatePrinter(_updatePrinter_parameters);
        System.out.println("updatePrinter.result=" + _updatePrinter__return);


        }
        {
        System.out.println("Invoking deleteOrder...");
        com.kpos.ws.app.DeleteOrderType _deleteOrder_parameters = new com.kpos.ws.app.DeleteOrderType();
        com.kpos.ws.app.DeleteOrderResponseType _deleteOrder__return = port.deleteOrder(_deleteOrder_parameters);
        System.out.println("deleteOrder.result=" + _deleteOrder__return);


        }
        {
        System.out.println("Invoking saveOrder...");
        com.kpos.ws.app.SaveOrderType _saveOrder_parameters = new com.kpos.ws.app.SaveOrderType();
        com.kpos.ws.app.SaveOrderResponseType _saveOrder__return = port.saveOrder(_saveOrder_parameters);
        System.out.println("saveOrder.result=" + _saveOrder__return);


        }
        {
        System.out.println("Invoking checkPrivilege...");
        com.kpos.ws.app.CheckPrivilegeType _checkPrivilege_parameters = new com.kpos.ws.app.CheckPrivilegeType();
        com.kpos.ws.app.CheckPrivilegeResponseType _checkPrivilege__return = port.checkPrivilege(_checkPrivilege_parameters);
        System.out.println("checkPrivilege.result=" + _checkPrivilege__return);


        }
        {
        System.out.println("Invoking listCategoryHTML...");
        com.kpos.ws.app.ListCategoryHTMLType _listCategoryHTML_parameters = new com.kpos.ws.app.ListCategoryHTMLType();
        com.kpos.ws.app.ListCategoryHTMLResponseType _listCategoryHTML__return = port.listCategoryHTML(_listCategoryHTML_parameters);
        System.out.println("listCategoryHTML.result=" + _listCategoryHTML__return);


        }
        {
        System.out.println("Invoking listAreas...");
        com.kpos.ws.app.ListAreasType _listAreas_parameters = new com.kpos.ws.app.ListAreasType();
        com.kpos.ws.app.ListAreasResponseType _listAreas__return = port.listAreas(_listAreas_parameters);
        System.out.println("listAreas.result=" + _listAreas__return);


        }
        {
        System.out.println("Invoking fetchSaleItem...");
        com.kpos.ws.app.FetchSaleItemType _fetchSaleItem_parameters = new com.kpos.ws.app.FetchSaleItemType();
        com.kpos.ws.app.FetchSaleItemResponseType _fetchSaleItem__return = port.fetchSaleItem(_fetchSaleItem_parameters);
        System.out.println("fetchSaleItem.result=" + _fetchSaleItem__return);


        }
        {
        System.out.println("Invoking fetchTable...");
        com.kpos.ws.app.FetchTableType _fetchTable_parameters = new com.kpos.ws.app.FetchTableType();
        com.kpos.ws.app.FetchTableResponseType _fetchTable__return = port.fetchTable(_fetchTable_parameters);
        System.out.println("fetchTable.result=" + _fetchTable__return);


        }
        {
        System.out.println("Invoking fetchGlobalOption...");
        com.kpos.ws.app.FetchGlobalOptionType _fetchGlobalOption_parameters = new com.kpos.ws.app.FetchGlobalOptionType();
        com.kpos.ws.app.FetchGlobalOptionResponseType _fetchGlobalOption__return = port.fetchGlobalOption(_fetchGlobalOption_parameters);
        System.out.println("fetchGlobalOption.result=" + _fetchGlobalOption__return);


        }
        {
        System.out.println("Invoking listSaleItemsForCategory...");
        com.kpos.ws.app.ListSaleItemsForCategoryType _listSaleItemsForCategory_parameters = new com.kpos.ws.app.ListSaleItemsForCategoryType();
        com.kpos.ws.app.ListSaleItemsForCategoryResponseType _listSaleItemsForCategory__return = port.listSaleItemsForCategory(_listSaleItemsForCategory_parameters);
        System.out.println("listSaleItemsForCategory.result=" + _listSaleItemsForCategory__return);


        }
        {
        System.out.println("Invoking updateCategory...");
        com.kpos.ws.app.UpdateCategoryType _updateCategory_parameters = new com.kpos.ws.app.UpdateCategoryType();
        com.kpos.ws.app.UpdateCategoryResponseType _updateCategory__return = port.updateCategory(_updateCategory_parameters);
        System.out.println("updateCategory.result=" + _updateCategory__return);


        }
        {
        System.out.println("Invoking listGlobalOptionHTML...");
        com.kpos.ws.app.ListGlobalOptionHTMLType _listGlobalOptionHTML_parameters = new com.kpos.ws.app.ListGlobalOptionHTMLType();
        com.kpos.ws.app.ListGlobalOptionHTMLResponseType _listGlobalOptionHTML__return = port.listGlobalOptionHTML(_listGlobalOptionHTML_parameters);
        System.out.println("listGlobalOptionHTML.result=" + _listGlobalOptionHTML__return);


        }
        {
        System.out.println("Invoking createSaleItem...");
        com.kpos.ws.app.CreateSaleItemType _createSaleItem_parameters = new com.kpos.ws.app.CreateSaleItemType();
        com.kpos.ws.app.CreateSaleItemResponseType _createSaleItem__return = port.createSaleItem(_createSaleItem_parameters);
        System.out.println("createSaleItem.result=" + _createSaleItem__return);


        }
        {
        System.out.println("Invoking fetchCategoryOption...");
        com.kpos.ws.app.FetchCategoryOptionType _fetchCategoryOption_parameters = new com.kpos.ws.app.FetchCategoryOptionType();
        com.kpos.ws.app.FetchCategoryOptionResponseType _fetchCategoryOption__return = port.fetchCategoryOption(_fetchCategoryOption_parameters);
        System.out.println("fetchCategoryOption.result=" + _fetchCategoryOption__return);


        }

        System.exit(0);
    }

}
