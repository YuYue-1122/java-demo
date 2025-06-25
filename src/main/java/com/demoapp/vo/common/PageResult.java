package com.demoapp.vo.common;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {

    /**
     * 当前页码
     */
    private  long currentPage;

    /**
     * 总记录数
     */
    private  long total;

    /**
     * 结果集
     */
    private List<T> data;
}
