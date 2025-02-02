package com.bksuns.mybatis.generator.convert;

/**   
 * Copyright: Copyright (c) 2019 
 * 
 * <p>说明： 数据库时间类型 到 实体类时间类型 对应策略</P>
 * @version: v1.0.0
 * @author: wujp
 */
public enum DateType {
    /**
     * 
     * <p>只使用 java.util.date 代替</p>
     */
    ONLY_DATE,
    /**
     * <p>使用 java.sql 包下的</p>
     */
    SQL_PACK,
    /**
     * <p>使用 java.time 包下的</p>
     * <p>java8 新的时间类型</p>
     */
    TIME_PACK
}

