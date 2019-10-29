package ssm.blog.service.impl;

import org.springframework.stereotype.Service;
import ssm.blog.dao.BlogTypeDao;
import ssm.blog.entity.BlogType;
import ssm.blog.service.BlogTypeService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description �������Serviceʵ����
 */
@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {

    @Resource
    private BlogTypeDao blogTypeDao;

    // ��ȡ���������Ϣ
    public List<BlogType> getBlogTypeData() {

        return blogTypeDao.getBlogTypeData();
    }

    public List<BlogType> listBlogType(Map<String, Object> map) {
        return blogTypeDao.listBlogType(map);
    }

    public Long getTotal(Map<String, Object> map) {
        return blogTypeDao.getTotal(map);
    }

    public Integer addBlogType(BlogType blogType) {
        return blogTypeDao.addBlogType(blogType);
    }

    public Integer updateBlogType(BlogType blogType) {
        return blogTypeDao.updateBlogType(blogType);
    }

    public Integer deleteBlogType(Integer id) {
        return blogTypeDao.deleteBlogType(id);
    }

}
