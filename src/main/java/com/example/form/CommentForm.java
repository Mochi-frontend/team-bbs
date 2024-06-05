package com.example.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * コメントフォーム.
 *
 * @author mao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentForm {
    private String articleId;
    private String name;
    private String content;
}
