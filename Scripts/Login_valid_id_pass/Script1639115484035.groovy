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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.opencart.com/')

WebUI.click(findTestObject('Object Repository/Login_or/Page_Your Store/span_My Account_caret_1'))

WebUI.click(findTestObject('Object Repository/Login_or/Page_Your Store/a_Login'))

WebUI.setText(findTestObject('Object Repository/Login_or/Page_Account Login/input_E-Mail Address_email'), 'xyz@arman.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login_or/Page_Account Login/input_Password_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Login_or/Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.verifyElementText(findTestObject('Login_or/Page_My Account/h2_My Account'), 'My Account', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

