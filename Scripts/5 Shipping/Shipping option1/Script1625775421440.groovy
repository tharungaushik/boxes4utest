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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('4 Checkout/Exsting user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_Local Delivery_custom_panecustom_pane_a530a3'))

WebUI.click(findTestObject('Object Repository/Page_Shipping  Boxes4U/input__custom_wwexcustom_wwex_pane_field_di_70fd96'))

//WebUI.click(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_concat(A custom calculation for an Or_0b24de'))
ground = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_concat(A custom calculation for an Or_0b24de'), 
    'value')

System.out.println(ground)

south = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_Ground Delivery_commerce_shippingship_b47e64'), 
    'value')

System.out.println(south)

central = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_Southeastern Freight Lines (SEFL) 301_4487be'), 
    'value')

System.out.println(central)

estes = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_Central Freight Lines, Inc (CENF) 306_0e527f'), 
    'value')

System.out.println(estes)

old = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_Estes Express Lines (EXLA) 312.95_com_fb735d'), 
    'value')

System.out.println(old)

rl = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_Old Dominion (ODFL) 317.31_commerce_s_92740a'), 
    'value')

System.out.println(rl)

southeasteren = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_R  L Carriers Inc (RLCA) 335.04_comme_cdfc54'), 
    'value')

System.out.println(southeasteren)

xpo = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_Southeastern Freight Lines (SEFL) 362_8e2379'), 
    'value')

System.out.println(xpo)

tforce = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_XPO Logistics (CNWY) 396.50_commerce__1c6943'), 
    'value')

System.out.println(tforce)

saia = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_TForce Freight (UPGF) 396.57_commerce_900cf1'), 
    'value')

System.out.println(saia)

yrc = WebUI.getAttribute(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_SAIA (SAIA) 428.06_commerce_shippings_3a1997'), 
    'value')

System.out.println(yrc)

if (ground == 'ground_home_delivery') {
    WebUI.click(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_concat(A custom calculation for an Or_0b24de'))
} else {
    WebUI.click(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_Southeastern Freight Lines (SEFL) 301_4487be'))
}

WebUI.click(findTestObject('Object Repository/Page_Shipping  Boxes4U/input_Time_op'))

WebUI.delay(5)

reviewurl = WebUI.getUrl(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(reviewurl)

WebUI.verifyElementText(findTestObject('Page_Review order  Boxes4U/h1_Review order'), 'REVIEW ORDER')

