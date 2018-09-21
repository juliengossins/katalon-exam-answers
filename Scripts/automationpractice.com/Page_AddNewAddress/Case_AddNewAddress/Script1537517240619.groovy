import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('automationpractice.com/Page_AddNewAddress/Input_Address1'), Address1)

WebUI.setText(findTestObject('automationpractice.com/Page_AddNewAddress/Input_City'), City)

WebUI.selectOptionByValue(findTestObject('automationpractice.com/Page_AddNewAddress/Dropdown_State'), State, true)

WebUI.setText(findTestObject('automationpractice.com/Page_AddNewAddress/Input_Postcode'), Postcode)

WebUI.setText(findTestObject('automationpractice.com/Page_AddNewAddress/Input_Phone'), Phone)

WebUI.setText(findTestObject('automationpractice.com/Page_AddNewAddress/Input_Alias'), Alias)

WebUI.click(findTestObject('automationpractice.com/Page_AddNewAddress/Button_Save'))

