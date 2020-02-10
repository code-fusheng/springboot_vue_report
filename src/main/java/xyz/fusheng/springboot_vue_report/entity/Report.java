/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Report
 * Author:   25610
 * Date:     2020/2/10 16:47
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_vue_report.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String user;
    private Date time;
    private String content;
    private String trouble;
    private String method;
    private String harvest;
    private String plan;
}
