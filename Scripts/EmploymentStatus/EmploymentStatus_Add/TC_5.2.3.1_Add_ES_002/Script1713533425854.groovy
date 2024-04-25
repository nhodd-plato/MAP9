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
import com.kms.katalon.core.util.KeywordUtil

String expectedText = "Add Employment Status"

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nhodd-trials712.orangehrmlive.com/auth/login')

WebUI.setText(findTestObject('Object Repository/EmploymentStatus/Page_OrangeHRM/input_Login_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/EmploymentStatus/Page_OrangeHRM/input_Login_txtPassword'), 'iOv+rK7xq3jhOvWTekEqcg==')

WebUI.click(findTestObject('Object Repository/EmploymentStatus/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/EmploymentStatus/Page_Employee Management/span_HR Administration'))

WebUI.click(findTestObject('Object Repository/EmploymentStatus/Page_HR Administration/span_oxd_menu_down'))

WebUI.click(findTestObject('Object Repository/EmploymentStatus/Page_HR Administration/a_Manage Employment Status'))

WebUI.click(findTestObject('Object Repository/EmploymentStatus/Page_Job/i_add'))

WebUI.verifyElementPresent(findTestObject('Object Repository/EmploymentStatus/Page_Job/h4_Add Employment Status'),0)

WebUI.closeBrowser()


