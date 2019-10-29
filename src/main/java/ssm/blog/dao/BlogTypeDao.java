package ssm.blog.dao;

import ssm.blog.entity.BlogType;

import java.util.List;
import java.util.Map;

/**
 * @Description �������dao�ӿ�
 */
public interface BlogTypeDao {

    // ��ȡ���������Ϣ
    public List<BlogType> getBlogTypeData();

    // ����id��������������Ϣ
    public BlogType findById(Integer id);

    // ��ҳ��ѯ���������Ϣ
    public List<BlogType> listBlogType(Map<String, Object> map);

    // ��ȡ�ܼ�¼��
    public Long getTotal(Map<String, Object> map);

    // ����������
    public Integer addBlogType(BlogType blogType);

    // �����������
    public Integer updateBlogType(BlogType blogType);

    // ɾ���������
    public Integer deleteBlogType(Integer id);

}
