package ssm.blog.service;

import ssm.blog.entity.Comment;

import java.util.List;
import java.util.Map;

/**
 * @Description 用户评论service接口
 */
public interface CommentService {

    // 获取评论信息
    public List<Comment> getCommentData(Map<String, Object> map);

    // 添加评论
    public int addComment(Comment comment);

    // 获取总记录数
    public Long getTotal(Map<String, Object> map);

    // 修改评论信息
    public Integer update(Comment comment);

    // 删除文章信息
    public Integer deleteComment(Integer id);

    // 根据文章id删除评论信息，用于删除某篇文章前，先删掉该文章的评论，因为有外键
    public Integer deleteCommentByBlogId(Integer blogId);
}
