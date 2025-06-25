package com.demoapp.entity;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
//知识库实体
public class KnowledgeBaseEntity {

    /**
     * 主键
     */
    private String id;

    /**
     * 知识库名称
     */
    private String name;

    /**
     * 知识库描述
     */
    private String description;

    /**
     * 知识库类型。0:普通知识库;1:问答库；
     */
    private Integer type;

    /**
     * 创建者Id
     */
    private String creator_id;

    /**
     * 是否启用。0:禁用;1:启用
     */
    private Integer enabled;

    /**
     * 是否删除。0:正常;1:删除
     */
    private Integer deleted;

    /**
     * 创建时间
     */
    private LocalDateTime create_time;

    /**
     * 更新时间
     */
    private LocalDateTime update_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getCreator_id() {
        return creator_id;
    }
    public void setCreator_id(String creator_id) {
        this.creator_id = creator_id;
    }
    public Integer getEnabled() {
        return enabled;
    }
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
    public  Integer getDeleted() {
        return deleted;
    }
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    public LocalDateTime getCreate_time() {
        return create_time;
    }
    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }
    public LocalDateTime getUpdate_time() {
        return update_time;
    }
    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }
}
