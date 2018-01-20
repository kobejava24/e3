package com.e3.service.goods.api;

import com.e3.service.goods.pojo.TbItem;
import com.e3.service.goods.pojo.TbItemDesc;
import com.e3.util.common.E3Result;
import com.e3.util.dto.EUDataGrideResult;

/**
 * Created by 91908 on 2017/12/19.
 */
public interface ItemService {
    TbItem findByItemId(long itemId);

    EUDataGrideResult getItemList(int pageNum,int pageSize);

    E3Result saveItem(TbItem tbItem,String desc,String itemParams) throws Exception;

    TbItemDesc findByItemIdDesc(long itemId);


}
