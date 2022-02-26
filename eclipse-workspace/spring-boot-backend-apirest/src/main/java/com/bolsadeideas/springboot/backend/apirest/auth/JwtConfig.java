package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEogIBAAKCAQEAnC92CTQEGWUwR3jNCpg35/ndnviDe9PLfJbMcfUVjlfD3Edy\r\n"
			+ "GWp3e3zpn3LvN1S9I8OlLYY2y4ltnh6eBQSEYoQ/mLRBVK3Rr4KSo+kdxy7+h/uD\r\n"
			+ "PWbb++qlfg1SKPgx7EIvOr0hBUI8egGUbzjzFbRDBwJcZXXveP8Yyu+17dSsWl3c\r\n"
			+ "V37fi4ImHQn99uWAxb9mBxcKC6pvTbFeZh06H+XIExNWIka2trR2HbYP/Q0jDyBs\r\n"
			+ "YtjO5qlS2qdM1Lo5bDb3dHA4itGmTtid7wH43O82f/8kld0R7+4ahsSZRHQkzfPJ\r\n"
			+ "OkrBw27Ons1s7iiv2UKj6a+Ud/Me24jUTcm9twIDAQABAoIBAEd4mIUhnnaYjX1H\r\n"
			+ "VFzyxzKKbtYeVtzFUKrUvv2u74xRsTkOILJsu/xwbuAeUkV5q4vALcglUNHXM6hV\r\n"
			+ "zm3xYTtL1WZlpje/yuKL19rWBGBvqt5DRA1HEoe3GsASDHTfDslUiBRTE9c6Nj6G\r\n"
			+ "loxG/UYDVWDRvcJYM5uk8I19ID2Si7q21ljapXiFzK9o4g33xGexA8dFDPtqO/sa\r\n"
			+ "wGPL6hviQVkPxOsDCBkRXxxdVOm6ooeIys6l57640+y5ZyKR29UkY5S0MzOif2o7\r\n"
			+ "8sitf7lKYL4UHbGVJB2mtYcfUZyY0Kr3gn2aIU6ySlg8Q4gxQS4PfNtPYdJfBrUI\r\n"
			+ "oBD2y/ECgYEAy6xq5yJeKcJ/GZcgnAWM216hQsaTjiiJtoPm9FhF361JbcsRHbPa\r\n"
			+ "m4LZ2jkOQ8gAzv/nlkQQgqQSDeh/x0JJdZWIIC4gqm4RZHojCgbGfO9ljtOeBqeG\r\n"
			+ "kqd46CP9IISrpbZS7Lxboebd0eYhhn1+5niLRlT/z67/kEMS/gHUuAsCgYEAxE/B\r\n"
			+ "ipfiBINPy8Hfms2zYeufCdzsaJMMTvZcQCu/2HGD1+NxZVMxOzZePD0wXZp6mLS6\r\n"
			+ "LHW+MA0dibM7PdWPfebU3ziWIhARnXO1p4j3WEqHrJ7Vam9P+mbxJi45JnYLRdD/\r\n"
			+ "nhU9t8OtpI4jmLBNYRsOK7BGA0n6HuP+fe8GYIUCgYBLs7c8V7rWHLOvKEv3kdyM\r\n"
			+ "AP1BW5umoAynqRkjwtedzsPXKj4fYyUi3hzpDoHt0Z3zUoyafowAcsk/ICa2Qj4Z\r\n"
			+ "lU22YE7F6glO5lK1vFT0ROrjjmZTJNtRESxQZGgGOSmvezgRQ+VvJOdXyAi3+1c6\r\n"
			+ "hJ2Hs7otUGcvEK8zeCy/hwKBgBN9w76qA+Pk0chuUHBDWjsvtNO63rInX4J7jX9F\r\n"
			+ "mL+5zZhi2cBwuSOi60pZ3PJ+QwvkbdO6QQ7uTm98nzYtfRjIEXy0Vpu9MrKKaY/f\r\n"
			+ "1ocqpzvpbVErCirXi7v5vOznrYjaDnc4rq8PO69p+XjQkG5CzG5kCx+Kec4VXxBL\r\n"
			+ "6jstAoGAE8k4FufLqcRmEGelRvD9WPP5EHHewu2szCUKPPBZklOqN5bgVqo4jarC\r\n"
			+ "4cuGWhypTQqabWDlmK8SrqBpETsSXHVWLp6nnT5rshDTGygCb16kdCHdR7AZT/ss\r\n"
			+ "W1rRJLGua0kd6t6b9wKifFwOHqARAOu7Yyv/qs4I+2Qbikr9uoU=\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnC92CTQEGWUwR3jNCpg3\r\n"
			+ "5/ndnviDe9PLfJbMcfUVjlfD3EdyGWp3e3zpn3LvN1S9I8OlLYY2y4ltnh6eBQSE\r\n"
			+ "YoQ/mLRBVK3Rr4KSo+kdxy7+h/uDPWbb++qlfg1SKPgx7EIvOr0hBUI8egGUbzjz\r\n"
			+ "FbRDBwJcZXXveP8Yyu+17dSsWl3cV37fi4ImHQn99uWAxb9mBxcKC6pvTbFeZh06\r\n"
			+ "H+XIExNWIka2trR2HbYP/Q0jDyBsYtjO5qlS2qdM1Lo5bDb3dHA4itGmTtid7wH4\r\n"
			+ "3O82f/8kld0R7+4ahsSZRHQkzfPJOkrBw27Ons1s7iiv2UKj6a+Ud/Me24jUTcm9\r\n"
			+ "twIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
