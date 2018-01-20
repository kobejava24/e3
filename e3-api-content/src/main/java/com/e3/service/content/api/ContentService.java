package com.e3.service.content.api;

import com.e3.service.content.pojo.TbContent;
import com.e3.util.dto.TreeResult;

import java.util.List;

/**
 * Created by 91908 on 2017/12/26.
 */
public interface ContentService {
    /**
     * 查询节点列表
     * @param parentId
     * @return
     */
    List<TreeResult> getContentCategoryList(long parentId);

    /**
     * 新增节点
     * @param parentId
     * @param name
     */
    void saveContentCatory(long parentId ,String name);

    /**
     * 新增(广告位)内容
     * @param tbContent
     */
    void saveContent(TbContent tbContent);

    /**
     * 查询大广告位的商品展示
     * @param categoryId
     * @return
     */
    List<TbContent> getContentList(long categoryId);
}
