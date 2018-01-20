package com.e3.service.order.api;

import com.e3.service.order.pojo.OrderInfo;
import com.e3.util.common.E3Result;

/**
 * Created by Administrator on 2018/1/10 0010.
 */
public interface OrderService {

    public E3Result createOrder(OrderInfo orderInfo);
}
