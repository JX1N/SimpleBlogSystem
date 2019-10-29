package ssm.blog.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * md5���ܹ�����
 *
 * @author Administrator
 */
public class CryptographyUtil {

    /**
     * @param str
     * @param salt
     * @return
     * @Description ʹ��Shiro�е�md5����
     */
    public static String md5(String str, String salt) {
        // Md5Hash��Shiro�е�һ������
        return new Md5Hash(str, salt).toString();
    }

    // ���Լ�����һ�²����õ�
    public static void main(String[] args) {
        String password = "123456";

        System.out.println("Md5���ܣ�"
                + CryptographyUtil.md5(password, "javacoder"));
    }
}