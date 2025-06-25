package com.demoapp.dto;


import com.demoapp.dto.common.PageQuery;
import lombok.Data;

/**
 * 知识库查询类
 */
@Data
public class KnowledgeBaseQuery extends PageQuery {
    /**
     * 知识库类型。0:普通知识库;1:问答库；
     */
    private Integer type;
    /**
     * 知识库名称
     */
    private String name;
    /**
     * 知识库描述
     */
    private String description;
}
