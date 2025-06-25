package com.demoapp.enums;

/**
 * 知识库类型枚举
 */
public enum KnowledgeTypeEnum {
    General(0, "普通知识库"),
    QuestionsAndAnsers(1, "问答");

    private final Integer code;
    private final String description;

    KnowledgeTypeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCode() {
        return code;
    }
}