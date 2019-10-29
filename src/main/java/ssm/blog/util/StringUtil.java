package ssm.blog.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @Description 字符串工具类
 */
public class StringUtil {

    /**
     * @param str
     * @return
     * @Description 判断是否是空
     */
    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param str
     * @return
     * @Description 判断是否不是空
     */
    public static boolean isNotEmpty(String str) {
        if ((str != null) && !"".equals(str.trim())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param str
     * @return
     * @Description 格式化模糊查询
     */
    public static String formatLike(String str) {
        if (isNotEmpty(str)) {
            return "%" + str + "%";
        } else {
            return null;
        }
    }

    /**
     * @param list
     * @return
     * @Description 过滤掉集合里的空格
     */
    public static List<String> filterWhite(List<String> list) {
        List<String> resultList = new ArrayList<String>();
        for (String l : list) {
            if (isNotEmpty(l)) {
                resultList.add(l);
            }
        }
        return resultList;
    }

}
