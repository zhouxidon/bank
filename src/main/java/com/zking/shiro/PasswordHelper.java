package com.zking.shiro;


import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 用于shiro权限认证的密码工具类
 */
public class PasswordHelper {

    /**
     * 随机数生成器
     */
    private static RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    /**
     * 指定hash算法为MD5
     */
    private static final String hashAlgorithmName = "md5";

    /**
     * 指定散列次数为1024次，即加密1024次
     */
    private static final int hashIterations = 1024;

    /**
     * true指定Hash散列值使用Hex加密存. false表明hash散列值用用Base64-encoded存储
     */
    private static final boolean storedCredentialsHexEncoded = true;

    /**
     * 获得加密用的盐
     *
     * @return
     */
    public static String createSalt() {
        return randomNumberGenerator.nextBytes().toHex();
    }

    /**
     * 获得加密后的凭证
     *
     * @param credentials 凭证(即密码)
     * @param salt        盐
     * @return
     */
    public static String createCredentials(String credentials, String salt) {
        SimpleHash simpleHash = new SimpleHash(hashAlgorithmName, credentials,
                salt, hashIterations);
        return storedCredentialsHexEncoded ? simpleHash.toHex() : simpleHash.toBase64();
    }


    /**
     * 进行密码验证
     *
     * @param credentials        未加密的密码
     * @param salt               盐
     * @param encryptCredentials 加密后的密码
     * @return
     */
    public static boolean checkCredentials(String credentials, String salt, String encryptCredentials) {
        return encryptCredentials.equals(createCredentials(credentials, salt));
    }

    public static void main(String[] args) {
      //cc4b149d7554df94d589baec76a651b0 盐
        //3ddfdea7e38e974d46263ea7bfe94efb 密码

        //0dc77049317a5c3a8de9a708d80e3900 盐
        //2332753cfa487eeb9a1dca10a0ff3e01 密码
        //盐
        String salt = createSalt();
        System.out.println(salt);
        System.out.println(salt.length());
        //凭证+盐加密后得到的密码
        String credentials = createCredentials("123456", salt);
        System.out.println(credentials);
        System.out.println(credentials.length());
        boolean b = checkCredentials("123456", salt, credentials);
        System.out.println(b);
    }
}
