package ssm.blog.service;

import ssm.blog.entity.Blogger;

/**
 * @Description 站长Service接口
 */
public interface BloggerService {

    public Blogger getByUsername(String username);

    public Blogger getBloggerData();

    // 更新站长个人信息
    public Integer updateBlogger(Blogger blogger);
}
