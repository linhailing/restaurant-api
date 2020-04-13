package com.henry.cn.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author henry
 * @Date 2020/4/12 2:54 下午
 * @Version 1.0
 */
@Data
@Entity
public class ProductInfo {

    @Id
    private String productId;
    private String productName;  // 商品名称
    private BigDecimal productPrice; // 单价
    private Integer productStock; // 库存
    private String productDescription; // 描述
    private String productIcon; // 小图
    private Integer productStatus; // 商品状态,0正常1下架
    private Integer categoryType; // 类目编号

}
