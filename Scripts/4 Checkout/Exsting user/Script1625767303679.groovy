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

WebUI.callTestCase(findTestCase('3 Shopping cart/Cart Page'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout  Boxes4U/select_-- Choose --7000 Central Pkwy1000 Ce_4a0287_1'), 
//    '27648', true)

//WebUI.uncheck(findTestObject('Object Repository/Checkbox/Page_Checkout  Boxes4U/input_Store Address1401 E Plano Pkwy,Plano, TX 75074, US_customer_profile_shippingcommerce_customer_profile_copy'))

WebUI.check(findTestObject('Object Repository/Checkbox/Page_Checkout  Boxes4U/input_Store Address1401 E Plano Pkwy,Plano, TX 75074, US_customer_profile_shippingcommerce_customer_profile_copy'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Boxes4U/input_Special notes_op'))

WebUI.delay(5)

checkouturl = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(checkouturl)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Shipping  Boxes4U/h1_Shipping'), 'SHIPPING')

