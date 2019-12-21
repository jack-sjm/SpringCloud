package com.sjm.common.vo;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {

    //总条数
    private Long total;

    //总页数
    private Long totalPage;

    //数据源
    private List<T> items;

    public PageResult() {
    }

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResult(Long total, Long totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }

}
