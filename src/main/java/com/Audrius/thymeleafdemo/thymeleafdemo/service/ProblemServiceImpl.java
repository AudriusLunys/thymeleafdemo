package com.Audrius.thymeleafdemo.thymeleafdemo.service;

import com.Audrius.thymeleafdemo.thymeleafdemo.model.Problem;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProblemServiceImpl implements ProblemService {
    @Override
    public List<Problem> createProblems() {
        List<Problem> problems = Arrays.asList(
                new Problem("Noriu valgyt"),
                new Problem("noriu miegot"),
                new Problem("noriu namo"),
                new Problem("viskas")
        );
        return problems;
    }
}
