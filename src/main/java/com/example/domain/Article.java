package com.example.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 記事を表すオブジェクト.
 *
 * @author mao
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String content;
    @OneToMany(mappedBy = "article",cascade = CascadeType.ALL,orphanRemoval = true)
    @OrderBy("id DESC")
    List<Comment> commentList;
}
