package com.simple.service;

import com.github.pagehelper.PageInfo;
import com.simple.common.ServerResponse;
import com.simple.pojo.Order;

/**
 * Create by S I M P L E on 2018/01/05
 *                       _oo0oo_
 #                      o8888888o
 #                      88" . "88
 #                      (| -_- |)
 #                      0\  =  /0
 #                    ___/`---'\___
 #                  .' \\|     |# '.
 #                 / \\|||  :  |||# \
 #                / _||||| -:- |||||- \
 #               |   | \\\  -  #/ |   |
 #               | \_|  ''\---/''  |_/ |
 #               \  .-\__  '-'  ___/-. /
 #             ___'. .'  /--.--\  `. .'___
 #          ."" '<  `.___\_<|>_/___.' >' "".
 #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 #         \  \ `_.   \_ __\ /__ _/   .-` /  /
 #     =====`-.____`.___ \_____/___.-`___.-'=====
 #                       `=---='
 #
 #
 #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 #
 #               佛祖保佑         永无BUG
 */
public interface IOrderService {

    ServerResponse<Order> createOrder(int userId, String shippingId);

    ServerResponse<PageInfo> getOrderList(String userId, int pageNum, int pageSize);
}
