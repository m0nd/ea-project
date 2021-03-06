package edu.mum.comments.service;

import edu.mum.comments.domain.Comment;

import java.util.List;


public interface ICommentService {

    public List<Comment> getAll();

    public void addComment(Comment comment);

    public Comment get(Long id);

    public void update(Comment comment);

    public void delete(Long id);

    public List<Comment> getAllCommentsByAuthor(String author);
    public List<Comment> findCommentByPostId(Long id);
}
