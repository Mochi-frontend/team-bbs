package com.example.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * コメントを表すオブジェクト.
 *
 * @author mao
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Integer id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String content;
    @ManyToOne
    @JoinColumn(name = "article_id",nullable = false)
    List<Article> articleList;
}
