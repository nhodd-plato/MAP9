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


WebUI.click(findTestObject('Object Repository/Membership/Page_Employee Management/More Menu dropdown'))

WebUI.mouseOver(findTestObject('Object Repository/Membership/Page_Employee Management/Qualifications Menu button'))

WebUI.click(findTestObject('Object Repository/Membership/Page_Employee Management/Memberships Menu Button'))

WebUI.click(findTestObject('Object Repository/Membership/Page_Qualifications/i_add'))

randomText = CustomKeywords.'text.generator.RandomString.createRandomString'()

WebUI.setText(findTestObject('Object Repository/Membership/Page_Qualifications/input_Add Membership_name'), randomText)

WebUI.click(findTestObject('Object Repository/Membership/Page_Qualifications/Save Button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Membership/Page_Qualifications/Successfully Saved Pop Up'), 0)

String actualText = WebUI.getText(findTestObject('Object Repository/Membership/Page_Qualifications/span_test'))

if (randomText != actualText) {
    KeywordUtil.markErrorAndStop('ERROR: Membership was not saved')
}

