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


WebUI.click(findTestObject('Object Repository/PayGrade/Page_Employee Management/HR Administration Tab'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_HR Administration/span_oxd_menu_down'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_HR Administration/Manage Pay Grades Menu Button'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/i_add'))

randomText = CustomKeywords.'text.generator.RandomString.createRandomString'()

WebUI.setText(findTestObject('Object Repository/PayGrade/Page_Job/input_Add Pay Grade_name'), randomText)

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/Save Button'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/i_ohrm_edit'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/Assign currency Button'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/currencyDropDown'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/currency_CAD'))

WebUI.setText(findTestObject('Object Repository/PayGrade/Page_Job/input__minSalary'), '40000')

WebUI.setText(findTestObject('Object Repository/PayGrade/Page_Job/input_Minimum Salary_maxSalary'), '60000')

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/Save Button'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/Assign currency Button'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/currencyDropDown'))

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/currency_CAD'))

WebUI.setText(findTestObject('Object Repository/PayGrade/Page_Job/input__minSalary'), '70000')

WebUI.setText(findTestObject('Object Repository/PayGrade/Page_Job/input_Minimum Salary_maxSalary'), '90000')

WebUI.click(findTestObject('Object Repository/PayGrade/Page_Job/Save Button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PayGrade/Page_Job/Assign currency Button'), 0)

