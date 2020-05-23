package com.gestionventas.springboot.backend.apirest.auth;

/**
 * @author Sandra
 * @author Alexis
 * @author Miguel
 */

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA ="-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEogIBAAKCAQEAoEih3N3iscvudw5wE1Syju1qr8f4ulbbDgNWKCs23sqxn3ij\r\n" + 
			"yc+tP82JcitaG34uRKkoD07NQxGYGFZQ1q/+x4Fqq942oCR+o37djy1zJHCq1/RM\r\n" + 
			"X826XzTyInlIXpwMooHceHxUjFb1C1PGFv1b4CjyzIcxyRKptqyKFjg6PF0tBxL/\r\n" + 
			"UKF0b4UUXnrsIqICa8NT54SN/GHzsx5K3OTJ5ygWf1TWg7zrVBr7cyMIWpUe2nPH\r\n" + 
			"N+jWaKJWyrOsmDa7ZBi2pRYGKtS2Bg3lHrOFRgY8WBC67ni443k7iPpIW0ycikkL\r\n" + 
			"A7lV3dUYL5nCqmFm9UGevnZPploGiDyU5c0ixQIDAQABAoIBAB1FxpHw0BMKnI2P\r\n" + 
			"zHYrVMT3pTFfQxS9AhqoD1cctVOxDwmB3d/gltJ9NinssvMsc0TE4/UPvjsOfomL\r\n" + 
			"Ug4zbEOBZjrnRXCv2ZUAeXRJp6qzDPCNxFkG2I/EuqgDIG1u8HvJXbt/cW2EABLG\r\n" + 
			"hPnz4ZCpydYCptwDFY2wKzPtpu0ZCTbZWTAVsvJWQNYwsYfsVMn89iL2kTDoknJX\r\n" + 
			"4qtVRhgANYhXaY/WYdGPqj4Ga7VyisFNv3GKCoHTxA5QhACIMtMQs5NXrthK+ar0\r\n" + 
			"IptAJdXI+S/scmleiAlbFXERHUKh9ra9zQsSxjNtojIQ9L8TQdxoytd1elA2SgXN\r\n" + 
			"b6aD56ECgYEA0N/dXF+AdZCTh2nSKE2KLw4O57MP/Fv0/AwAHkipJezyxu1xgzNC\r\n" + 
			"SQoefFUnMDEOne25OulA7w8XDW3gZELSMPdiptJ1k0wribhIH4JMNp3/RXFP+qP+\r\n" + 
			"k7rnxCU1v36ooLr2qnn9z4vfKRYATMt61zd+s8aCkoZPrOALI+5r8+0CgYEAxHJF\r\n" + 
			"fBHQJWQVTwE+6zeMNQT9gTtDZKhdqr3C4ysx4NJwvQDlXAOhjBFGWwUSwdtSyBv3\r\n" + 
			"ID73uZS96nWwImOiHF/uUkwsLSS70yLkhEguOCK3W1KwBKGjCA0PV7BIwHpFCEOq\r\n" + 
			"KRSBbWtlLx9ZiLEmfkuYtnnAqu4bSPNXwosevzkCgYBthOPxelXFzv+74d2Cql2J\r\n" + 
			"HKruDDKWlLTYr4YkWt7t9ta5PWjmbSsVVwvzD0cT+rT6U9pqrEES1+uza+hbSboi\r\n" + 
			"WKROak2h5S9y78BJXS2O+bsOc0KHXhOu7DJ34zbSaJwMYtvROVO+zk09or6XhZ2s\r\n" + 
			"WPnDU5PFNk1yjKrqtSm/ZQKBgAOcqkRmu3IEjhO+zR5cDhrndZXLtiiCo/5AsPWm\r\n" + 
			"VKtykxoWiyEO/AhsROPlivu/gZ0mTnvsTHfAEWHfOhbXyCJHbUVcGy/VThLKwHLi\r\n" + 
			"NN9ZXA+0zIG5SxsZyl9tYVkQpnZJcDaDJwIRCHI+XFIUF8YYs70fLfi2mg/UUZfF\r\n" + 
			"IRKZAoGACmlWLLu2TRtg9vQ8WISdGn2BVSC9aRSoAzzbBc/LBSZXJfKfPEdYM3fk\r\n" + 
			"qyTdct+ozmuCYrhKc/eJ/xaJjJPzvqwEyS+VxxNtB9GDkHhH8bwfpJZflBbmxcCY\r\n" + 
			"okBxg9vwomHWnu0oQePir5P+XfTiadO9UiVU4+xYJ8yeBV8URNs=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoEih3N3iscvudw5wE1Sy\r\n" + 
			"ju1qr8f4ulbbDgNWKCs23sqxn3ijyc+tP82JcitaG34uRKkoD07NQxGYGFZQ1q/+\r\n" + 
			"x4Fqq942oCR+o37djy1zJHCq1/RMX826XzTyInlIXpwMooHceHxUjFb1C1PGFv1b\r\n" + 
			"4CjyzIcxyRKptqyKFjg6PF0tBxL/UKF0b4UUXnrsIqICa8NT54SN/GHzsx5K3OTJ\r\n" + 
			"5ygWf1TWg7zrVBr7cyMIWpUe2nPHN+jWaKJWyrOsmDa7ZBi2pRYGKtS2Bg3lHrOF\r\n" + 
			"RgY8WBC67ni443k7iPpIW0ycikkLA7lV3dUYL5nCqmFm9UGevnZPploGiDyU5c0i\r\n" + 
			"xQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
