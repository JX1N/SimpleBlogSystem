package ssm.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/setting")
public class WebSettingController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest request)
            throws IOException {
        String path = request.getSession().getServletContext()
                .getRealPath("background");
        String fileName = "back.jpg";
        File dir = new File(path, fileName);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        // MultipartFile�Դ��Ľ�������
        file.transferTo(dir);
        return "SUCCESS";
    }

}