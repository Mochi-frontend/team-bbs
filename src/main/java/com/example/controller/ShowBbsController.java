package com.example.controller;

import com.example.domain.Article;
import com.example.form.ArticleForm;
import com.example.form.CommentForm;
import com.example.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String index(ArticleForm articleForm, CommentForm commentForm, Model model){
        List<Article> articleList = articleRepository.findAll();
        model.addAttribute("articleList",articleList);
        return "article";
    }
}
