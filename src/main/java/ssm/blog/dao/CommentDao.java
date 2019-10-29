package ssm.blog.dao;

import ssm.blog.entity.Comment;

import java.util.List;
import java.util.Map;

/**
 * @Description ����dao�ӿ�
 */
public interface CommentDao {

    // ��ȡ������Ϣ
    public List<Comment> getCommentData(Map<String, Object> map);

    // �������
    public int addComment(Comment comment);

    // ��ȡ�ܼ�¼��
    public Long getTotal(Map<String, Object> map);

    // �޸�������Ϣ
    public Integer update(Comment comment);

    // ɾ��������Ϣ
    public Integer deleteComment(Integer id);

    // ��������idɾ��������Ϣ������ɾ��ĳƪ����ǰ����ɾ�������µ����ۣ���Ϊ�����
    public Integer deleteCommentByBlogId(Integer blogId);
}
