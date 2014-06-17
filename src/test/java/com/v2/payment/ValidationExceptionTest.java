/**
 * 
 */
package com.v2.payment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * @author rajadurai
 *
 */
public class ValidationExceptionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.v2.payment.ValidationException#ValidationException(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testValidationException() {
		ValidationException validationException = new ValidationException("100","invalid input");
		assertEquals("100", validationException.getErrorCode());
		assertEquals("invalid input", validationException.getErrorMsg());
	}

	/**
	 * Test method for {@link com.v2.payment.ValidationException#getErrorCode()}.
	 */
	@Test
	public void testGetSetErrorCode() {
		ValidationException validationException = new ValidationException("100","invalid input");
		validationException.setErrorCode("200");
		assertEquals("200", validationException.getErrorCode());
	}

	/**
	 * Test method for {@link com.v2.payment.ValidationException#setErrorCode(java.lang.String)}.
	 */
	@Test
	public void testGetSetErrorMsg() {
		ValidationException validationException = new ValidationException("100","invalid input");
		validationException.setErrorMsg("invalid input1");
		assertEquals("invalid input1", validationException.getErrorMsg());
	}

}
