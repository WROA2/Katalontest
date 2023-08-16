package mfa

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.jboss.aerogear.security.otp.Totp
import com.kms.katalon.util.CryptoUtil

public class readMFAencrypt {

	//AES-256 and RSA 2048
	def encryptedText = 'eOPJ1o6gjLQyKS9zOwgVPE6pacWzfbnsiUES9g7rfRoeZvR+fhKu8Q=='
	def decryptedText = (CryptoUtil.decode(CryptoUtil.getDefault(encryptedText)))

	def GetMFAToken () {
		Totp totp = new Totp(decryptedText)
		return totp.now()
	}
}


