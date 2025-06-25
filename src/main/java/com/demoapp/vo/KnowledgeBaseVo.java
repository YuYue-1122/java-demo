package com.demoapp.vo;

import com.demoapp.entity.KnowledgeBaseEntity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Data注解自动生成getter和setter
 * @NoArgsConstructor 生成无参的构造方法
 */
@Data
@NoArgsConstructor
public class KnowledgeBaseVo {

    private String id;
    //知识库名称
    private String name;
    //知识库描述
    private String description;
    //知识库状态。1可用。2禁用
    private Integer enabled;
    //知识库类型。0普通知识库，1问答知识库
    private Integer type;

    /**
     * 根据知识库实体进行构建
     *
     * @param knowledgeBaseEntity
     */
    public KnowledgeBaseVo(KnowledgeBaseEntity knowledgeBaseEntity) {
        this.id = knowledgeBaseEntity.getId();
        this.name = knowledgeBaseEntity.getName();
        this.description = knowledgeBaseEntity.getDescription();
        this.enabled = knowledgeBaseEntity.getEnabled();
        this.type = knowledgeBaseEntity.getType();
    }
}
