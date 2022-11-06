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

WebUI.openBrowser('https://kitabisa.com/')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Test/Dik Asta'), 0)

WebUI.click(findTestObject('Test/Dik Asta'))

WebUI.click(findTestObject('Test/Donasi Sekarang'))

WebUI.setText(findTestObject('Test/Fill'), '10000')

WebUI.click(findTestObject('Test/Lanjutkan'))

WebUI.scrollToElement(findTestObject('Test/Transfer BCA'), 0)

WebUI.click(findTestObject('Test/Transfer BCA'))

WebUI.setText(findTestObject('Test/Nama'), 'Fadhil')

WebUI.setText(findTestObject('Test/Email'), 'fadsyahad@gmail.com')

WebUI.click(findTestObject('Test/Lanjutkan 2'))

WebUI.click(findTestObject('Test/Back'))

