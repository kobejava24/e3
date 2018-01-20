package com.e3.util.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 91908 on 2017/12/20.
 */
public class EUDataGrideResult implements Serializable{
    private long total;
    private List<?> rows;

    public EUDataGrideResult(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public EUDataGrideResult() {
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
