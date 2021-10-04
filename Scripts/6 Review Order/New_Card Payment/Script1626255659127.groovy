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

WebUI.callTestCase(findTestCase('5 Shipping/New_Shipping option1'), [('reviewurl') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Review order  Boxes4U/input_Freight_commerce_paymentpayment_method'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Review order  Boxes4U/select_VisaMasterCardAmerican ExpressDiscover Card'), 
    'mastercard', true)

WebUI.setText(findTestObject('Object Repository/Page_Review order  Boxes4U/input__commerce_paymentpayment_detailscredi_dd4843'), 
    '4111111111111111')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Review order  Boxes4U/select_010203040506070809101112'), 
    '08', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Review order  Boxes4U/select_2122232425262728293031323334353637383940'), 
    '2028', true)

WebUI.setText(findTestObject('Object Repository/Page_Review order  Boxes4U/input__commerce_paymentpayment_detailscredi_0f0743'), 
    '123')

WebUI.click(findTestObject('Object Repository/Page_Review order  Boxes4U/input__op'))

WebUI.delay(5)

completeurl = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(completeurl)

WebUI.verifyElementText(findTestObject('Page_Checkout complete  Boxes4U/h1_Checkout complete'), 'CHECKOUT COMPLETE')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Checkout complete  Boxes4U/span_'))

orderidtxt = WebUI.getText(findTestObject('Object Repository/Page_Checkout complete  Boxes4U/p_Your order number is 37695. You can view _ea5c43'))

System.out.println(orderidtxt)

WebUI.closeBrowser()

