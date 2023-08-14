$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testpage.feature");
formatter.feature({
  "line": 1,
  "name": "Booking a Holiday",
  "description": "",
  "id": "booking-a-holiday",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17593340900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to navigate through the website and make booking successfully",
  "description": "",
  "id": "booking-a-holiday;user-should-be-able-to-navigate-through-the-website-and-make-booking-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on Accept button for Cookies",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User selects Top Menu Bar \"Holiday Inspiration\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Tab Menu Item \"Simpson Secrets\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verify the page by Header Title \"Simpson Secrets\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User scrolls down the page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Simpson Secret – Corfu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User verify the Corfu page by Header Title \"Simpson Secret – Corfu\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User scrolls down the page for booking",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User selects the date for booking",
  "keyword": "And "
});
formatter.match({
  "location": "TestStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 225864000,
  "status": "passed"
});
formatter.match({
  "location": "TestStepdefs.userClicksOnAcceptButtonForCookies()"
});
formatter.result({
  "duration": 267130800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Holiday Inspiration",
      "offset": 27
    }
  ],
  "location": "TestStepdefs.userSelectsTopMenuBar(String)"
});
formatter.result({
  "duration": 214625600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Simpson Secrets",
      "offset": 30
    }
  ],
  "location": "TestStepdefs.userClicksOnTabMenuItem(String)"
});
formatter.result({
  "duration": 8028752200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Simpson Secrets",
      "offset": 38
    }
  ],
  "location": "TestStepdefs.userVerifyThePageByHeaderTitle(String)"
});
formatter.result({
  "duration": 67166600,
  "status": "passed"
});
formatter.match({
  "location": "TestStepdefs.userScrollsDownThePage()"
});
formatter.result({
  "duration": 26617600,
  "status": "passed"
});
formatter.match({
  "location": "TestStepdefs.userClicksOnSimpsonSecretCorfu()"
});
formatter.result({
  "duration": 6048839500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Simpson Secret – Corfu",
      "offset": 44
    }
  ],
  "location": "TestStepdefs.userVerifyTheCorfuPageByHeaderTitle(String)"
});
formatter.result({
  "duration": 47326100,
  "status": "passed"
});
formatter.match({
  "location": "TestStepdefs.userScrollsDownThePageForBooking()"
});
formatter.result({
  "duration": 96506300,
  "status": "passed"
});
formatter.match({
  "location": "TestStepdefs.userSelectsTheDateForBooking()"
});
formatter.result({
  "duration": 5226513100,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d115.0.5790.171)\nBuild info: version: \u00274.9.0\u0027, revision: \u0027d7057100a6\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [20a52aee49be87ddc53dc51649d8524f, clickElement {id\u003d840A1623F5CC13F95D781DE64C609E1F_element_159}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 115.0.5790.171, chrome: {chromedriverVersion: 114.0.5735.90 (386bc09e8f4f..., userDataDir: C:\\Users\\LAPTOP~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:56590}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:56590/devtoo..., se:cdpVersion: 115.0.5790.171, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on WINDOWS (20a52aee49be87ddc53dc51649d8524f)] -\u003e xpath: //a[@class\u003d\u0027m-property__availability__booking-widget__nav__link m-property__availability__booking-widget__nav__link--next active js-booking-cal-next\u0027]//i]\nSession ID: 20a52aee49be87ddc53dc51649d8524f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:257)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:78)\r\n\tat TravelSimpson.utility.Utility.clickOnElement(Utility.java:47)\r\n\tat TravelSimpson.pages.SimpsonSecretCorfuPage.selectDate(SimpsonSecretCorfuPage.java:65)\r\n\tat TravelSimpson.steps.TestStepdefs.userSelectsTheDateForBooking(TestStepdefs.java:61)\r\n\tat ✽.And User selects the date for booking(testpage.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 297733500,
  "status": "passed"
});
});