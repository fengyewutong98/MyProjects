package com.sm.utils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CommonUtil {
	
	private static String lanIp = null;

	private CommonUtil() {
	}

	/**
	 * 获得主机IP
	 *
	 * @return String
	 */
	public static boolean isWindowsOS() {
		boolean isWindowsOS = false;
		String osName = System.getProperty("os.name");
		if (osName.toLowerCase().indexOf("windows") > -1) {
			isWindowsOS = true;
		}
		return isWindowsOS;
	}

	/**
	 * 兼容Windows和linux操作系统的获取局域网ip
	 * 
	 * @return String
	 */
	public static String getLanIp() {
		if (lanIp != null)
			return lanIp;
		InetAddress ip = null;
		try {
			// 如果是Windows操作系统
			if (isWindowsOS()) {
				ip = InetAddress.getLocalHost();
			} else {
				// 如果是Linux操作系统
				boolean bFindIP = false;
				Enumeration<NetworkInterface> netInterfaces = (Enumeration<NetworkInterface>) NetworkInterface
						.getNetworkInterfaces();
				while (netInterfaces.hasMoreElements()) {
					if (bFindIP) {
						break;
					}
					NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
					// ----------特定情况，可以考虑用ni.getName判断
					// 遍历所有ip
					Enumeration<InetAddress> ips = ni.getInetAddresses();
					while (ips.hasMoreElements()) {
						ip = (InetAddress) ips.nextElement();
						if (ip.isSiteLocalAddress() && !ip.isLoopbackAddress() // 127.开头的都是lookback地址
								&& ip.getHostAddress().indexOf(":") == -1) {
							bFindIP = true;
							break;
						}
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (null != ip) {
			lanIp = ip.getHostAddress();
		}
		return lanIp;
	}

	/**
	 * 线程池
	 */
	public static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,
			Runtime.getRuntime().availableProcessors() * 2, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
	
    /**
     * 利用MD5进行加密
     * 
     * @param str
     *            待加密的字符串
     * @return 加密后的字符串
     * @throws NoSuchAlgorithmException
     *             没有这种产生消息摘要的算法
     */
    public static String encoderByMd5(String str) throws NoSuchAlgorithmException {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
        
        byte[] btInput = str.getBytes();  
        // 获得MD5摘要算法的 MessageDigest 对象  
        MessageDigest mdInst = MessageDigest.getInstance("MD5");  
        // 使用指定的字节更新摘要  
        mdInst.update(btInput);  
        // 获得密文  
        byte[] md = mdInst.digest();  
        // 把密文转换成十六进制的字符串形式  
        int j = md.length;  
        char chr[] = new char[j * 2];  
        int k = 0;  
        for (int i = 0; i < j; i++) {  
            byte byte0 = md[i];  
            chr[k++] = hexDigits[byte0 >>> 4 & 0xf];  
            chr[k++] = hexDigits[byte0 & 0xf];  
        }  
        return new String(chr);  
    }
}
