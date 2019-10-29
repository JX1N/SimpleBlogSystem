package ssm.blog.dao;

import ssm.blog.entity.Blogger;

/**
 * @Description 站长dao接口
 */
public interface BloggerDao {

    // 通过用户名查询站长
    public Blogger getByUsername(String username);

    // 获取站长信息
    public Blogger getBloggerData();

    // 更新站长个人信息
    public Integer updateBlogger(Blogger blogger);
}
