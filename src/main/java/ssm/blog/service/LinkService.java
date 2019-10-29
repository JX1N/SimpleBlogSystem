package ssm.blog.service;

import ssm.blog.entity.Link;

import java.util.List;
import java.util.Map;

/**
 * @Description ��������Service�ӿ�
 */
public interface LinkService {

    // ��ȡ��������
    public List<Link> getLinkData();

    public List<Link> listLinkData(Map<String, Object> map);

    // ��ȡ�ܼ�¼��
    public Long getTotal(Map<String, Object> map);

    // �����������
    public Integer addLink(Link link);

    // ������������
    public Integer updateLink(Link link);

    // ɾ����������
    public Integer deleteLink(Integer id);
}
