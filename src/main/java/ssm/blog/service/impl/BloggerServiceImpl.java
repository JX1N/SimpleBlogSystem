package ssm.blog.service.impl;

import org.springframework.stereotype.Service;
import ssm.blog.dao.BloggerDao;
import ssm.blog.entity.Blogger;
import ssm.blog.service.BloggerService;

import javax.annotation.Resource;

/**
 * @Description 站长Service实现类
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

    @Resource
    private BloggerDao bloggerDao;

    // 根据用户名查询站长信息，用于登陆
    public Blogger getByUsername(String username) {
        return bloggerDao.getByUsername(username);
    }

    // 获取站长信息
    public Blogger getBloggerData() {
        return bloggerDao.getBloggerData();
    }

    public Integer updateBlogger(Blogger blogger) {
        return bloggerDao.updateBlogger(blogger);
    }

}
