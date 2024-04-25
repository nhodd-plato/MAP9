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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String expected1 = "Test3"

String expected2 = "Test4"

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nhodd-trials712.orangehrmlive.com/auth/login')

WebUI.setText(findTestObject('Object Repository/PayGrade/Page_OrangeHRM/input_Login_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PayGrade/Page_OrangeHRM/input_Login_txtPassword'), 'iOv+rK7xq3jhOvWTekEqcg==')

WebUI.click(findTestObject('Object Repository/PayGrade/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Employee Management/span_HR Administration'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_HR Administration/a_Job oxd_menu_down'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_HR Administration/a_Manage Pay Grades'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/PayGrade/Page_Job/input_Add Pay Grade_name'), 'Test3')

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/a_Save'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/PayGrade/Page_Job/input_Add Pay Grade_name'), 'Test4')

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/a_Save'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/label_1'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/label_2'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/i_more_horiz'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/a_Delete Selected'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/a_No, Cancel'))

String actual1 = WebUI.getText(findTestObject('Object Repository/PayGrade/Page_Job/span_Test3'))

String actual2 = WebUI.getText(findTestObject('Object Repository/PayGrade/Page_Job/span_Test4'))

if (expected1 != actual1 && expected2 != actual2) {
	KeywordUtil.markFailed("Pay Grades have been deleted")
}

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/i_more_horiz'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/a_Delete Selected'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/a_Yes, Delete'))

WebUI.closeBrowser()
