package ssm.blog.dao;

import ssm.blog.entity.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Description ����Dao�ӿ�
 */
public interface BlogDao {

    // ��ȡ������Ϣ�����������·ݷ����ѯ
    public List<Blog> getBlogData();

    // ��ҳ��ѯ����
    public List<Blog> listBlog(Map<String, Object> map);

    // ��ȡ�ܼ�¼��
    public Long getTotal(Map<String, Object> map);

    // ����id��ȡ����
    public Blog findById(Integer id);

    // ����������Ϣ
    public Integer update(Blog blog);

    // ��ȡ��һƪ����
    public Blog getPrevBlog(Integer id);

    // ��ȡ��һƪһƪ����
    public Blog getNextBlog(Integer id);

    // ��������
    public Integer addBlog(Blog blog);

    // ɾ��������Ϣ
    public Integer deleteBlog(Integer id);

    // �����������͵�id��ѯ�������µ���������
    public Integer getBlogByTypeId(Integer typeId);
}