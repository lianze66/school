package com.lanying.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.lanying.dto.Student;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Controller
public class FreemarkerController {
	
	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;
	
	@ResponseBody
	@RequestMapping("showFreemarker")
	public ModelAndView showFreemarker() {
		ModelAndView mav = new ModelAndView("may");
		
		Student stu0 = new Student(1, "小花", "女");
		Student stu1 = new Student(2, "小张", "男");
		Student stu2 = new Student(3, "小王", "男");
		Student stu3 = new Student(4, "小丽", "女");
		
		List<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		mav.addObject("userName", "小明");
		mav.addObject("student", stu0);
		mav.addObject("stuList", list);
		mav.addObject("cur_time", new Date());
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("name", "廉泽");
		
		createStatic("test.ftl", "D:/lianze.html", data);
		
		return mav;
	}
	
	private void createStatic(String templateFileName, String createFilePath, Map<String, Object> data) {
		Writer out = null;
		try {
			Configuration configuration = freeMarkerConfigurer.getConfiguration();
			Template template = configuration.getTemplate(templateFileName);
			out = new FileWriter(new File(createFilePath));
			template.process(data, out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
