package com.Audrius.thymeleafdemo.thymeleafdemo.controller;

import com.Audrius.thymeleafdemo.thymeleafdemo.model.Problem;
import com.Audrius.thymeleafdemo.thymeleafdemo.service.ProblemService;
import com.Audrius.thymeleafdemo.thymeleafdemo.service.ProblemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProblemController {
    @Resource
    private ProblemService problemService;


    @RequestMapping("/myproblems")
    public String myproblems(Model model) {
      List<Problem> problems =problemService.createProblems();
        model.addAttribute("problems", problems);
        return "problems";
    }
}
