package com.example.controller;

import com.example.domain.Article;
import com.example.form.ArticleForm;
import com.example.form.CommentForm;
import com.example.repository.ArticleRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class InsertArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @PostMapping("/insert-article")
    public String insertArticle(@Validated ArticleForm articleForm, BindingResult bindingResult, Model model, CommentForm commentForm){
        if(bindingResult.hasErrors()){
            return "forward:/show";
        }
        Article article = new Article();
        BeanUtils.copyProperties(articleForm,article);
        articleRepository.save(article);
        return "redirect:/article";
    }
}
