describe('angularjs homepage todo list', function() {
  it('should add a todo', function() {

    browser.get('http://www.way2automation.com/angularjs-protractor/banking/#/login');
    browser.waitForAngularEnabled(true);
    
    
    //WelcomeScreen
    var CustLogin = element(by.css('[ng-click="customer()"]'));
    CustLogin.click();

    var dropDown = element(by.model('custId'));
    dropDown.click();

    var selectDropDown = element.all(by.repeater('cust in Customers'));
    selectDropDown.get(3).click();

    var login = element(by.css('.btn.btn-default'))
    login.click();
    
    var accountNo = element(by.cssContainingText('option', '1012'));
    accountNo.click();

    var deposit = element(by.cssContainingText('.btn.btn-lg.tab', 'Deposit'))
    deposit.click();

    var amount = element(by.model('amount'));
    amount.sendKeys('1000');

    // var depositAmount = element(by.cssContainingText('.btn.btn-default', 'Deposit'));
    // depositAmount.click();

    // browser.sleep(2000);
    
    // var transactions = element(by.cssContainingText('.btn.btn-lg.tab', 'Transactions'))
    // transactions.click();

    browser.sleep(10000);

  });
  // it('second test',function(){
  //   browser.get('https://www.facebook.com');
  //   browser.sleep(10000);
  // })
});

