package com.e3.service.goods.api;

import com.e3.service.goods.pojo.TbItemCat;

import java.util.List;

/**
 * Created by 91908 on 2017/12/23.
 */
public interface TbItemCatService {
    List<TbItemCat> queryByParentId(long parentId);
}
