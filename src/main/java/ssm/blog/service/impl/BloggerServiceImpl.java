package ssm.blog.service.impl;

import org.springframework.stereotype.Service;
import ssm.blog.dao.BloggerDao;
import ssm.blog.entity.Blogger;
import ssm.blog.service.BloggerService;

import javax.annotation.Resource;

/**
 * @Description վ��Serviceʵ����
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

    @Resource
    private BloggerDao bloggerDao;

    // �����û�����ѯվ����Ϣ�����ڵ�½
    public Blogger getByUsername(String username) {
        return bloggerDao.getByUsername(username);
    }

    // ��ȡվ����Ϣ
    public Blogger getBloggerData() {
        return bloggerDao.getBloggerData();
    }

    public Integer updateBlogger(Blogger blogger) {
        return bloggerDao.updateBlogger(blogger);
    }

}
