package com.lizhenjun.client.example.domin;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 测试实体类
 */
@Data
@Table(name = "user")
public class User implements Serializable {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "name")
    private String name;

    /**
     * 用户性别
     */
    @Column(name = "sex")
    private String sex;

    @JSONField(name = "create_time", format = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_time")
    private Date createTime;
}