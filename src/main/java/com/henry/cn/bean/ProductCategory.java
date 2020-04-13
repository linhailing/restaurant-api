package com.henry.cn.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author henry
 * @Date 2020/4/12 2:47 下午
 * @Version 1.0
 * 餐饮类目
 */
@Data
@Entity
// 用这个注解才能实现动态更新（update_time的更新）
@DynamicUpdate
public class ProductCategory {
    @Id
    @GeneratedValue
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
//    private BigDecimal createTime;
//    private BigDecimal updateTime;
    public ProductCategory(){}

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType=" + categoryType +
                '}';
    }
    public ProductCategory(String name, Integer type){
        this.categoryType = type;
        this.categoryName = name;
    }
}
