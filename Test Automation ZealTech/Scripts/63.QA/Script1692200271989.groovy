import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.util.CryptoUtil as CryptoUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.referwell.com/login')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_Sign In with Auth0/input_Email_email'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_Sign In with Auth0/input_Email_email'), 
    'wilfredo.roa@zltech.io')

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_Sign In with Auth0/input_Password_password'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_Sign In with Auth0/input_Password_password'), 
    'NP0YLejkAjy3SCSyU7bgH5kOrXytFqRk')

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_Sign In with Auth0/button_Continue'))

WebUI.setText(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_2nd Factor Authentication/input_Verification code_sc-dIfARi jiGwUQ'), 
    CustomKeywords.'mfa.readMFAencrypt.GetMFAToken'())

//WebUI.setText(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_2nd Factor Authentication/input_Verification code_sc-dIfARi jiGwUQ'), 
//CustomKeywords.'mfa.readMFA.GetMFAToken'())
WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_2nd Factor Authentication/button_Continue'))

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell Administrator/span_Doctors'))

WebUI.waitForElementPresent(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell Administrator/td_Rebequita Reffering'), 
    0)

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell Administrator/a_Become'))

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/button_Find Provider for Referral'))

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/input_Originating_office'))

WebUI.setText(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/set_Originating_office - text'), 
    'Cardiology Group 123')

WebUI.sendKeys(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/set_Originating_office - text'), 
    Keys.chord(Keys.ENTER, Keys.TAB))

WebUI.setText(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/input_Patient MRN_select-mrn'), 
    '1mrn14022023')

WebUI.verifyElementPresent(findTestObject('63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/code_Helen Automated Chufe De Paredes'), 
    0)

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/input_Specialty_s2id_autogen12_search'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/set_Specialty_text'), 
    'cardiology')

WebUI.sendKeys(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/set_Specialty_text'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/button_Find Providers'))

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/button_Request Appointment'))

WebUI.scrollToElement(findTestObject('63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/input_Cancel_submit'), 
    0)

WebUI.click(findTestObject('63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/input_Cancel_submit'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/h1_Confirmation of Appointment Request'), 
    0)

WebUI.click(findTestObject('Object Repository/63.LoginUserProviderCreateReferralInPersonAppointmenSearchByInsuranceAddNote/Page_ReferWell/button_logout'))

