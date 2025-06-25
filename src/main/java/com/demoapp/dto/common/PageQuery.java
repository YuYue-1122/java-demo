package com.demoapp.dto.common;

import lombok.Data;

@Data
public class PageQuery {
    /**
     * 页码
     */
    private Integer pageNum = 1;
    /**
     * 展示行数
     */
    private Integer pageSize = 10;
}
