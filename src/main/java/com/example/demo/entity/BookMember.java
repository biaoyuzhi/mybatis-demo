package com.example.demo.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * zhwu @ tmindtech.com on 2021/3/4.
 */
@Data
public class BookMember {
    /**
     * 会员表自增用户id
     */
    @GeneratedValue(generator = "JDBC")
    @Id
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 用户手机号码
     */
    private String phone;

    /**
     * 用户头像
     */
    private String headPortrait;

    /**
     * 用户微信token
     */
    private String wechatToken;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 记录修改时间
     */
    private Date modifyTime;

    /**
     * 信息备注
     */
    private String remarks;

    /**
     * 状态 0->有效，1->失效
     */
    private Integer removed;

    private Integer organizationId; //机构id

    private String organizationName;//机构名

    private String idNumber;  //身份证号

    private String workNumber; //工号

    private BigDecimal vipPrice; //VIP价格

    private Integer isDeposit; //是否交了押金
}
