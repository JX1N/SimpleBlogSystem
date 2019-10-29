package ssm.blog.service;

import ssm.blog.entity.Comment;

import java.util.List;
import java.util.Map;

/**
 * @Description �û�����service�ӿ�
 */
public interface CommentService {

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
