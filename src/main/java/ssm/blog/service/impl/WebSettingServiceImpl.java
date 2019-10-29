package ssm.blog.service.impl;

import org.springframework.stereotype.Service;
import ssm.blog.dao.WebSettingDao;
import ssm.blog.service.WebSettingService;

import javax.annotation.Resource;

@Service("WebSettingService")
public class WebSettingServiceImpl implements WebSettingService {

    @Resource
    private WebSettingDao webSettingDao;

    public String getBackgroundSrc() {
        return webSettingDao.getBackgroundSrc();
    }
}
