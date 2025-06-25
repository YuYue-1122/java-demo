package com.demoapp.service;

import com.demoapp.dto.KnowledgeBaseDto;
import com.demoapp.dto.KnowledgeBaseQuery;
import com.demoapp.dto.common.PageQuery;
import com.demoapp.entity.KnowledgeBaseEntity;
import com.demoapp.vo.KnowledgeBaseVo;
import com.demoapp.vo.common.PageResult;
import com.github.pagehelper.PageInfo;

public interface KnowledgeBaseService {

    /**
     * 分页查询
     * @param knowledgeBaseQuery
     * @return
     */
    public PageInfo<KnowledgeBaseVo> page(KnowledgeBaseQuery knowledgeBaseQuery);

    /**
     * 根据Id查询知识库
     * @param id
     * @return
     */
    public KnowledgeBaseVo findById(String id);

    /**
     * 创建
     * @param knowledgeBaseDto
     * @return
     */
    public  KnowledgeBaseVo insert(KnowledgeBaseDto knowledgeBaseDto);


    /**
     * 修改
     * @param knowledgeBaseDto
     * @return
     */
    public  KnowledgeBaseVo update(KnowledgeBaseDto knowledgeBaseDto);

    /**
     * 根据Id删除知识库
     * @param id
     */
    public boolean deleteById(String id);
}
