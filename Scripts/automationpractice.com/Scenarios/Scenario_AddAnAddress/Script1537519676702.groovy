import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('automationpractice.com/Page_Home/Case_OpenBrowserHere'), [('url') : 'http://automationpractice.com/index.php'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('automationpractice.com/Page_Home/Case_GoToSignIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('automationpractice.com/Page_Authentication/Case_SignIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('automationpractice.com/Page_MyAccount/Case_GoToMyAddresses'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.callTestCase(findTestCase('automationpractice.com/Page_MyAddresses/Case_FindAddress'), [('Alias') : Data_Alias], 
    null) == null) {
    WebUI.callTestCase(findTestCase('automationpractice.com/Page_MyAddresses/Case_GoToAddNewAddress'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('automationpractice.com/Page_AddNewAddress/Case_AddNewAddress'), [('Address1') : Data_Address1
            , ('City') : Data_City, ('State') : Data_State, ('Postcode') : Data_Postcode, ('Phone') : Data_Phone, ('Alias') : Data_Alias], 
        FailureHandling.STOP_ON_FAILURE)
}

