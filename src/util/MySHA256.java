package util;

import java.security.MessageDigest;

public class MySHA256 {
	 public static String encrypt(String planText) {//encrypt:암호화하다
	        try{
	            MessageDigest md = MessageDigest.getInstance("SHA-256");//메세지다이제스트 객체 생성
	            md.update(planText.getBytes());
	            byte byteData[] = md.digest();
	            StringBuffer hexString = new StringBuffer();
	            for (int i=0;i<byteData.length;i++) {
	                String hex=Integer.toHexString(0xff & byteData[i]);
	                if(hex.length()==1){
	                    hexString.append('0');
	                }
	                hexString.append(hex);
	            }
	            return hexString.toString();
	        }catch(Exception e){
	            e.printStackTrace();
	            throw new RuntimeException();
	        }
	    }
}
