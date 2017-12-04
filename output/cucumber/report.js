$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4386607283,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Clerk logging in",
  "description": "",
  "id": "login;clerk-logging-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@RunThis"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "the clerk visits login page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enters \"clerk\" and \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "the clerk sees clerk\u0027s home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_clerk_visits_login_page()"
});
formatter.result({
  "duration": 461949094,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "clerk",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 20
    }
  ],
  "location": "StepDefinitions.enter_and(String,String)"
});
formatter.result({
  "duration": 558753582,
  "error_message": "org.openqa.selenium.NoSuchElementException: {\"errorMessage\":\"Unable to find element with id \u0027loginSb\u0027\",\"request\":{\"headers\":{\"Accept-Encoding\":\"gzip,deflate\",\"Connection\":\"Keep-Alive\",\"Content-Length\":\"32\",\"Content-Type\":\"application/json; charset\u003dutf-8\",\"Host\":\"localhost:44701\",\"User-Agent\":\"Apache-HttpClient/4.5.2 (Java/1.8.0_111)\"},\"httpVersion\":\"1.1\",\"method\":\"POST\",\"post\":\"{\\\"using\\\":\\\"id\\\",\\\"value\\\":\\\"loginSb\\\"}\",\"url\":\"/element\",\"urlParsed\":{\"anchor\":\"\",\"query\":\"\",\"file\":\"element\",\"directory\":\"/\",\"path\":\"/element\",\"relative\":\"/element\",\"port\":\"\",\"host\":\"\",\"password\":\"\",\"user\":\"\",\"userInfo\":\"\",\"authority\":\"\",\"protocol\":\"\",\"source\":\"/element\",\"queryKey\":{},\"chunks\":[\"element\"]},\"urlOriginal\":\"/session/b1a0e5c0-d912-11e7-8997-f93dcb9b50ff/element\"}}\nCommand duration or timeout: 288 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-NQH07IS\u0027, ip: \u0027172.17.58.32\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.phantomjs.PhantomJSDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, handlesAlerts\u003dfalse, databaseEnabled\u003dfalse, version\u003d2.1.1, platform\u003dXP, browserConnectionEnabled\u003dfalse, proxy\u003d{proxyType\u003ddirect}, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, driverVersion\u003d1.2.0, locationContextEnabled\u003dfalse, webStorageEnabled\u003dfalse, browserName\u003dphantomjs, takesScreenshot\u003dtrue, driverName\u003dghostdriver, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: b1a0e5c0-d912-11e7-8997-f93dcb9b50ff\n*** Element info: {Using\u003did, value\u003dloginSb}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.com5104.seleniumcucumber.StepDefinitions.enter_and(StepDefinitions.java:31)\r\n\tat ✽.And enters \"clerk\" and \"password\"(features/login/login.feature:5)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-NQH07IS\u0027, ip: \u0027172.17.58.32\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:138)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.com5104.seleniumcucumber.StepDefinitions.enter_and(StepDefinitions.java:31)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:539)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:761)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:461)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:207)\r\nCaused by: org.openqa.selenium.NoSuchElementException: {\"errorMessage\":\"Unable to find element with id \u0027loginSb\u0027\",\"request\":{\"headers\":{\"Accept-Encoding\":\"gzip,deflate\",\"Connection\":\"Keep-Alive\",\"Content-Length\":\"32\",\"Content-Type\":\"application/json; charset\u003dutf-8\",\"Host\":\"localhost:44701\",\"User-Agent\":\"Apache-HttpClient/4.5.2 (Java/1.8.0_111)\"},\"httpVersion\":\"1.1\",\"method\":\"POST\",\"post\":\"{\\\"using\\\":\\\"id\\\",\\\"value\\\":\\\"loginSb\\\"}\",\"url\":\"/element\",\"urlParsed\":{\"anchor\":\"\",\"query\":\"\",\"file\":\"element\",\"directory\":\"/\",\"path\":\"/element\",\"relative\":\"/element\",\"port\":\"\",\"host\":\"\",\"password\":\"\",\"user\":\"\",\"userInfo\":\"\",\"authority\":\"\",\"protocol\":\"\",\"source\":\"/element\",\"queryKey\":{},\"chunks\":[\"element\"]},\"urlOriginal\":\"/session/b1a0e5c0-d912-11e7-8997-f93dcb9b50ff/element\"}}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-NQH07IS\u0027, ip: \u0027172.17.58.32\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: driver.version: unknown\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.the_clerk_sees_clerk_s_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 83315592,
  "status": "passed"
});
formatter.before({
  "duration": 2848004377,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Student logging in",
  "description": "",
  "id": "login;student-logging-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "the student visits login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "enters username and password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the student sees student\u0027s home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.the_student_visits_login_page()"
});
formatter.result({
  "duration": 233083659,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.enters_username_and_password()"
});
formatter.result({
  "duration": 504291335,
  "error_message": "org.openqa.selenium.NoSuchElementException: {\"errorMessage\":\"Unable to find element with id \u0027loginSb\u0027\",\"request\":{\"headers\":{\"Accept-Encoding\":\"gzip,deflate\",\"Connection\":\"Keep-Alive\",\"Content-Length\":\"32\",\"Content-Type\":\"application/json; charset\u003dutf-8\",\"Host\":\"localhost:48980\",\"User-Agent\":\"Apache-HttpClient/4.5.2 (Java/1.8.0_111)\"},\"httpVersion\":\"1.1\",\"method\":\"POST\",\"post\":\"{\\\"using\\\":\\\"id\\\",\\\"value\\\":\\\"loginSb\\\"}\",\"url\":\"/element\",\"urlParsed\":{\"anchor\":\"\",\"query\":\"\",\"file\":\"element\",\"directory\":\"/\",\"path\":\"/element\",\"relative\":\"/element\",\"port\":\"\",\"host\":\"\",\"password\":\"\",\"user\":\"\",\"userInfo\":\"\",\"authority\":\"\",\"protocol\":\"\",\"source\":\"/element\",\"queryKey\":{},\"chunks\":[\"element\"]},\"urlOriginal\":\"/session/b404ed70-d912-11e7-969b-49956153252f/element\"}}\nCommand duration or timeout: 302 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-NQH07IS\u0027, ip: \u0027172.17.58.32\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.phantomjs.PhantomJSDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, handlesAlerts\u003dfalse, databaseEnabled\u003dfalse, version\u003d2.1.1, platform\u003dXP, browserConnectionEnabled\u003dfalse, proxy\u003d{proxyType\u003ddirect}, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, driverVersion\u003d1.2.0, locationContextEnabled\u003dfalse, webStorageEnabled\u003dfalse, browserName\u003dphantomjs, takesScreenshot\u003dtrue, driverName\u003dghostdriver, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: b404ed70-d912-11e7-969b-49956153252f\n*** Element info: {Using\u003did, value\u003dloginSb}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.com5104.seleniumcucumber.StepDefinitions.enters_username_and_password(StepDefinitions.java:54)\r\n\tat ✽.And enters username and password(features/login/login.feature:9)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-NQH07IS\u0027, ip: \u0027172.17.58.32\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:138)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:413)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.com5104.seleniumcucumber.StepDefinitions.enters_username_and_password(StepDefinitions.java:54)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:539)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:761)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:461)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:207)\r\nCaused by: org.openqa.selenium.NoSuchElementException: {\"errorMessage\":\"Unable to find element with id \u0027loginSb\u0027\",\"request\":{\"headers\":{\"Accept-Encoding\":\"gzip,deflate\",\"Connection\":\"Keep-Alive\",\"Content-Length\":\"32\",\"Content-Type\":\"application/json; charset\u003dutf-8\",\"Host\":\"localhost:48980\",\"User-Agent\":\"Apache-HttpClient/4.5.2 (Java/1.8.0_111)\"},\"httpVersion\":\"1.1\",\"method\":\"POST\",\"post\":\"{\\\"using\\\":\\\"id\\\",\\\"value\\\":\\\"loginSb\\\"}\",\"url\":\"/element\",\"urlParsed\":{\"anchor\":\"\",\"query\":\"\",\"file\":\"element\",\"directory\":\"/\",\"path\":\"/element\",\"relative\":\"/element\",\"port\":\"\",\"host\":\"\",\"password\":\"\",\"user\":\"\",\"userInfo\":\"\",\"authority\":\"\",\"protocol\":\"\",\"source\":\"/element\",\"queryKey\":{},\"chunks\":[\"element\"]},\"urlOriginal\":\"/session/b404ed70-d912-11e7-969b-49956153252f/element\"}}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027DESKTOP-NQH07IS\u0027, ip: \u0027172.17.58.32\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: driver.version: unknown\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.the_student_sees_student_s_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 115691162,
  "status": "passed"
});
});