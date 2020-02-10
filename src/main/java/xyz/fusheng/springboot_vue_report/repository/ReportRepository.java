/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: ReportReposttory
 * Author:   25610
 * Date:     2020/2/10 18:04
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_vue_report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import xyz.fusheng.springboot_vue_report.entity.Report;

public interface ReportRepository extends JpaRepository<Report,Integer> {

}
