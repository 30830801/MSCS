package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品信息对象 goods
 * 
 * @author Wangcj
 * @date 2021-07-07
 */
public class Goods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品号 */
    private Long id;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String name;

    /** 进价 */
    @Excel(name = "进价")
    private Integer cost;

    /** 保质期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "保质期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 生产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 库存 */
    @Excel(name = "库存")
    private String stock;

    /** 售价 */
    @Excel(name = "售价")
    private Integer price;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCost(Integer cost) 
    {
        this.cost = cost;
    }

    public Integer getCost() 
    {
        return cost;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setStock(String stock) 
    {
        this.stock = stock;
    }

    public String getStock() 
    {
        return stock;
    }
    public void setPrice(Integer price) 
    {
        this.price = price;
    }

    public Integer getPrice() 
    {
        return price;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("cost", getCost())
            .append("time", getTime())
            .append("date", getDate())
            .append("stock", getStock())
            .append("price", getPrice())
            .toString();
    }
}
