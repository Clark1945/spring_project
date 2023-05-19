package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.*;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
//		HashMap<String ,String> body = new HashMap<>();
//		body.put("Hi","John");
//		byte[] body_str = body.toString().getBytes();
//
//		String private_acpay = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiDl13guk3MUnnENBSEGB5mJ2LIoYUlf78eAAI/CWf8KxtPKkXXBVbmMaiSrg7/TsiQFUwKdmMlJyecSy5y0ULAMBi/iohIUy2dE92voj1rfy6b+zaRNf509D3bG4us7O6i46FyOiKGhZ4OnnYqq54YgWcmAPlD3U5b9lPysBIXnCB4Fs7aiqpnhWuVtaokcqf8as0bk6N1YzRmGlYbirmGfgl201FcVsKUrk1wClSJpTC+mm3wovBbXGr4CJoAaY2RZMUgrgqKGujUKddPTZ7jPoqrZG2fWdR46gRdNRTvTv+oajlo/BrNeFCZG9o6DC9sZGte9hWowcN3NkRgE7QwIDAQAB";
//		String public_acpay = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQClhEPVNY70TYcgoFtbcKLM7XnP\n" +
//				"WCIdURKVPO5wx6428RUehml5Ojgd5Bf6xYmmUKFi1HlCVMt+YwaBGuJMbDTEPaOH\n" +
//				"iGycNBaKM4EIx45v+n/GFrXvXHK8Ea/nj05n2PPpXRFpF2XOED2+RAp920qu87Vb\n" +
//				"Xck65nDfAJjQvcZWVQIDAQAB";
//		byte[] private_acpay_byte = Base64.getEncoder().encode(private_acpay.getBytes());
//		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(private_acpay_byte);
//		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//		PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
//
//		Signature signature = Signature.getInstance("SHA256RSA");
//		signature.initSign(privateKey);
//		signature.update(body_str);
//		byte[] encodeSign = signature.sign();
//		System.out.print(encodeSign);
		//generatePrivate(pkcs8EncodedKeySpec);
	}

}
