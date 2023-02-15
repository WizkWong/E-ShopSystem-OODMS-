package com.mycompany.oodms.order;

import com.mycompany.oodms.Dao.FileService;
import com.mycompany.oodms.Dao.ObjectDao;
import com.mycompany.oodms.OODMS;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrderDao implements ObjectDao<CustomerOrder> {
    // columns order in file: CustomerOrder ID, Customer ID, Datetime
    public static final String FILENAME = "customer order";

    private final CustomerOrderPaymentDao customerOrderPaymentDao;
    private final OrderDetailDao orderDetailDao;

    public CustomerOrderDao() {
        customerOrderPaymentDao = OODMS.getCustomerOrderPaymentDao();
        orderDetailDao = OODMS.getOrderDetailDao();
    }

    @Override
    public List<String> toList(CustomerOrder customerOrder) {
        return new ArrayList<>(List.of(
                String.valueOf(customerOrder.getId()),
                String.valueOf(customerOrder.getCustomer().getId()),
                customerOrder.getStringOrderDateTime()
        ));
    }

    @Override
    public boolean fileAddNewRow(CustomerOrder customerOrder) {
        List<String> customerOrderData = toList(customerOrder);
        // save customer order
        if (!FileService.insertData(FILENAME, customerOrderData)) {
            return false;
        }
        // save customer order payment
        if (!customerOrderPaymentDao.fileAddNewRow(customerOrder.getCustomerOrderPayment())) {
            return false;
        }
        // save order detail
        return orderDetailDao.fileSaveOrderDetail(customerOrder.getOrderDetail(), customerOrder.getId());
    }

    @Override
    public boolean fileUpdate(CustomerOrder customerOrder) {
        System.out.println("Customer Order Class does not allow to update the file");
        return false;
    }
}