package com.example.travel_blog_java.services;

import com.example.travel_blog_java.entities.Comment;

public interface CommentServices {
    Comment insertComment(CommentDTO comment);

    void deleteComment(Long commentId);
    void updateComment(Long id, CommentDTO commentDTO) throws DataNotFoundException;

    List<CommentResponse> getCommentsByUserAndProduct(Long userId, Long productId);
    List<CommentResponse> getCommentsByProduct(Long productId);
    void generateFakeComments() throws Exception;
}
