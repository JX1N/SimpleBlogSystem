package ssm.blog.dao;

import ssm.blog.entity.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Description 文章Dao接口
 */
public interface BlogDao {

    // 获取文章信息，根据日期月份分组查询
    public List<Blog> getBlogData();

    // 分页查询文章
    public List<Blog> listBlog(Map<String, Object> map);

    // 获取总记录数
    public Long getTotal(Map<String, Object> map);

    // 根据id获取文章
    public Blog findById(Integer id);

    // 更新文章信息
    public Integer update(Blog blog);

    // 获取上一篇文章
    public Blog getPrevBlog(Integer id);

    // 获取下一篇一篇文章
    public Blog getNextBlog(Integer id);

    // 添加文章
    public Integer addBlog(Blog blog);

    // 删除文章信息
    public Integer deleteBlog(Integer id);

    // 根据文章类型的id查询该类型下的文章数量
    public Integer getBlogByTypeId(Integer typeId);
}
