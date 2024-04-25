package text.generator
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import java.util.Random as Random


class RandomString {

	//Creates a random string of length 6 to ensure our test cases don't have duplicate values
	@Keyword
	def createRandomString() {
		//the String that our random characters are going to be added to
		StringBuilder finalString = new StringBuilder()
		
		//the list of random characters we will use in the string
		String randomChars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'

		//initializing a built in random object
		//this will be used to generate a random index from our random characters
		Random random = new Random()

		//this loops 6 times, and each time a random character gets added to our final string
		//i.e Loop 1: e 
		//    Loop 2: e1
		//    Loop 3: e1H
		for (int i = 0; i < 7; i++) {
			//this looks kind of complicated but it adds a character to the finalString variable string from the
			//randomChars list using a random position in the string.
			//randomChars.lenth() returns the length of the randomChars string which is 62
			//random.nextInt() generates a random number between 0 and 61 
			//randomChars.charAt() uses the random number to get the character at that position i.e if the number
			// is 3 then the character would be d (index starts at 0)
			//finalString.append() adds that letter to the final string
			finalString.append(randomChars.charAt(random.nextInt(randomChars.length())))
		}

		//because finalString is still a StringBuilder object, we have to cast it to a string
		//and we return it to the test case
		return finalString.toString()
	}
}