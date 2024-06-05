package com.example.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 記事フォーム.
 *
 * @author mao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleForm {
    private String name;
    private String content;
}
