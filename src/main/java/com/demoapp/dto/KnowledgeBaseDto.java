package com.demoapp.dto;

import com.demoapp.enums.KnowledgeTypeEnum;
import lombok.Data;

@Data
public class KnowledgeBaseDto {
    /**
     * 主键
     */
    public String id;
    /**
     * 知识库类型。0:普通知识库;1:问答库；
     */
    public int type;
    /**
     * 知识库名称
     */
    private String name;
    /**
     * 知识库描述
     */
    private String description;
}
