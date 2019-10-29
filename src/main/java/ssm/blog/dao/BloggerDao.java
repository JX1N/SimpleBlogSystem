package ssm.blog.dao;

import ssm.blog.entity.Blogger;

/**
 * @Description վ��dao�ӿ�
 */
public interface BloggerDao {

    // ͨ���û�����ѯվ��
    public Blogger getByUsername(String username);

    // ��ȡվ����Ϣ
    public Blogger getBloggerData();

    // ����վ��������Ϣ
    public Integer updateBlogger(Blogger blogger);
}
