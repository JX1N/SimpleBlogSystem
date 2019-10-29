package ssm.blog.service;

import ssm.blog.entity.BlogType;

import java.util.List;
import java.util.Map;

/**
 * @Description �������Service�ӿ�
 */
public interface BlogTypeService {

    public List<BlogType> getBlogTypeData();

    // ��ҳ��ѯ���������Ϣ
    public List<BlogType> listBlogType(Map<String, Object> map);

    // ��ȡ�ܼ�¼��
    public Long getTotal(Map<String, Object> map);

    // �����������
    public Integer addBlogType(BlogType blogType);

    // �����������
    public Integer updateBlogType(BlogType blogType);

    // ɾ���������
    public Integer deleteBlogType(Integer id);
}