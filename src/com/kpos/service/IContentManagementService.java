package com.kpos.service;

import com.kpos.domain.*;
import com.kpos.domain.Order;
import com.kpos.ws.app.*;

import java.util.List;

/**
 * Created by kpos.
 * Author: kkwang
 * Date: 3/14/12 11:08 PM
 */
public interface IContentManagementService {
    CreateResult<MenuCategory> createMenuCategory(MenuCategory aCategory, List<Long> printerIds);
    //boolean addPrintersToCategory(MenuCategory category, List<Long> printerIds);
    
    FetchResult<List<MenuCategory>> listAllCategories();
    FetchResult<List<MenuCategory>> listAllCategories(int begin, int maxSize);

    FetchResult<MenuCategory> fetchCategory(long aCategoryId);

    UpdateResult<MenuCategory> updateCategory(CategoryType aCategoryType);

    DeleteResult deleteCategory(long aCategoryId);

    CreateResult<SaleItem> createSaleItem(SaleItemType aSaleItemType);

    FetchResult<SaleItem> fetchSaleItem(long aId);
    
    UpdateResult<SaleItem> updateSaleItem(SaleItemType aSaleItemType);
    
    DeleteResult deleteSaleItem(long aId);
    
    FetchResult<List<SaleItem>> listSaleItemsForCategory(long aCategoryId);
    
    CreateResult<SaleItemOption> addSaleItemOption(SaleItemOptionType soapType);

    UpdateResult<SaleItemOption> updateSaleItemOption(SaleItemOptionType soapType);

    FetchResult<SaleItemOption> fetchSaleItemOption(long aId);

    DeleteResult deleteSaleItemOption(long aId);
    
    CreateResult<Printer> createPrinter(PrinterType soapType);
    
    DeleteResult deletePrinter(long aId);
    
    UpdateResult<Printer> updatePrinter(PrinterType soapType);
        
    FetchResult<List<Printer>> listPrinters();

    FetchResult<List<RestaurantTable>> listTables(Long aAreaId);

    CreateResult<RestaurantTable> createRestaurantTable(TableType soapType);

    UpdateResult<RestaurantTable> updateRestaurantTable(TableType soapType);

    DeleteResult deleteTable(long aId);

    DeleteResult deleteCategoryOption(long aId);

    CreateResult<CategoryOption> createCategoryOption(CategoryOptionType soapType);

    UpdateResult<CategoryOption> updateCategoryOption(CategoryOptionType soapType);

    FetchResult<CategoryOption> fetchCategoryOption(long aId);

    CreateResult<GlobalOption> createGlobalOption(GlobalOptionType soapType);

    UpdateResult<GlobalOption> updateGlobalOption(GlobalOptionType soapType);

    FetchResult<GlobalOption> fetchGlobalOption(long aId);

    DeleteResult deleteGlobalOption(long aId);

    FetchResult<List<GlobalOption>> listGlobalOptions();
    FetchResult<List<GlobalOption>> listGlobalOptions(int begin, int maxSize);

    CreateResult<SeatingArea> createSeatingArea(SeatingAreaType soapType);

    UpdateResult<SeatingArea> updateSeatingArea(SeatingAreaType soapType);
    
    DeleteResult deleteSeatingArea(long aId);
    FetchResult<List<SeatingArea>> listSeatingAreas();
    FetchResult<SeatingArea> fetchSeatingArea(long aId);

    CreateResult<Order> createNewOrder(OrderType orderType);

    UpdateResult<Order> updateOrder(OrderType orderType);

    FetchResult<Order> fetchOrderById(long aId);

    DeleteResult deleteOrder(long orderId);
}
