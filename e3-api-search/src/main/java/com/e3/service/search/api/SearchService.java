package com.e3.service.search.api;

import com.e3.service.search.dao.pojo.SearchResult;
import com.e3.util.common.E3Result;

/**
 * Created by Administrator on 2017/12/29 0029.
 */
public interface SearchService {

    //数据导入索引库功能
    public E3Result importItemIndex();

    //搜索功能
    SearchResult searchItem(String queryName, Integer page, Integer pageSize);

    E3Result sysnIndex(long itemId);
}
