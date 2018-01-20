package com.e3.service.goods.api;

import com.e3.service.goods.pojo.TbItemParam;
import com.e3.util.common.E3Result;
import com.e3.util.dto.EUDataGrideResult;

/**
 * Created by 91908 on 2017/12/25.
 */
public interface ItemParamService {
    public EUDataGrideResult getItemParamList(int pageNum,int pageSize);

    public E3Result getItemParamByCid(long cid);

    public E3Result saveItemParam(TbItemParam itemParam);

    String  showItemParamItem(long itemId);
}
