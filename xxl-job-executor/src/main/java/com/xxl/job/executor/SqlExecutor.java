package com.xxl.job.executor;

import javax.sql.DataSource;

/**
 * Created by Doaim on 16/6/8.
 * SQL执行器
 */
public class SqlExecutor implements TaskExecutor{
    /**
     * 数据源
     */
    private DataSource dataSource;
    @Override
    public TaskExecuteResult execute() {
        return null;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
