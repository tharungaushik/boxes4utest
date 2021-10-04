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

WebUI.navigateToUrl('https://test-boxes4u.enterpriseapplicationdevelopers.com:2002/')

WebUI.click(findTestObject('Object Repository/Regsitration/Page_Heavy Duty Boxes  Moving Supplies for _a6466e/a_Register'))

WebUI.setText(findTestObject('Object Repository/Regsitration/Page_Create new account  Boxes4U/input__name'), 'Gaushikagram')

WebUI.setText(findTestObject('Object Repository/Regsitration/Page_Create new account  Boxes4U/input__mail'), 'gaushikagram@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Regsitration/Page_Create new account  Boxes4U/input__passpass1'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Regsitration/Page_Create new account  Boxes4U/input__passpass2'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Regsitration/Page_Create new account  Boxes4U/input_Franchise Number (Servpro only)_op'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Page_Gaushikagram  Boxes4U/h3_History'), 'History')

