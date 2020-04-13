package com.henry.cn.repository;

import com.henry.cn.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @Author henry
 * @Date 2020/4/12 7:02 下午
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() {
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("水果");
        productCategory.setCategoryType(3);
        ProductCategory result = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(result);
    }
    @Test
    @Transactional
    public void updateTest(){
        Optional<ProductCategory> productCategory = productCategoryRepository.findById(1);
        // productCategory.setCategoryName("男生最爱1");
        // System.out.printf(productCategory.toString());
        // productCategoryRepository.save(productCategory);
        // Assert.assertNotNull(productCategoryRepository.save(productCategory));
    }
    @Test
    public void getByCategoryTypeTest(){
        List<Integer> categoryType = Arrays.asList(1,2,3);
        List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(categoryType);
        Assert.assertNotNull(list);
    }
}
