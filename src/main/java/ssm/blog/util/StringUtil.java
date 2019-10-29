package ssm.blog.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @Description �ַ���������
 */
public class StringUtil {

    /**
     * @param str
     * @return
     * @Description �ж��Ƿ��ǿ�
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
     * @Description �ж��Ƿ��ǿ�
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
     * @Description ��ʽ��ģ����ѯ
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
     * @Description ���˵�������Ŀո�
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
