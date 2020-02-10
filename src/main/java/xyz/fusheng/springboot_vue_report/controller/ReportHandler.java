/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: ReportHandler
 * Author:   25610
 * Date:     2020/2/10 18:06
 * Description:
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.springboot_vue_report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import xyz.fusheng.springboot_vue_report.entity.Report;
import xyz.fusheng.springboot_vue_report.repository.ReportRepository;


@RestController
@RequestMapping("/report")
public class ReportHandler {
    @Autowired
    private ReportRepository reportRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Report> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page, size);
        return reportRepository.findAll(request);
    }

    @PostMapping("/save")
    public String save(@RequestBody Report report) {
        Report result = reportRepository.save(report);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Report findById(@PathVariable("id") Integer id) {
        return reportRepository.findById(id).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody Report report) {
        Report result = reportRepository.save(report);
        if (result != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteByID(@PathVariable("id") Integer id) {
        reportRepository.deleteById(id);
    }

}
