package ssm.blog.service;

import ssm.blog.entity.Blogger;

/**
 * @Description վ��Service�ӿ�
 */
public interface BloggerService {

    public Blogger getByUsername(String username);

    public Blogger getBloggerData();

    // ����վ��������Ϣ
    public Integer updateBlogger(Blogger blogger);
}
