package com.example.controller;

import com.example.domain.Article;
import com.example.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author mao
 */
@Controller
@RequestMapping("/show")
public class ShowBbsController {
    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("")
    public String index(){
        List<Article> articleList = articleRepository.findAll();
        System.out.println(articleList.size());
        return "article";
    }
}
