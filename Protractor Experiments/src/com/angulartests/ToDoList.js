describe('ToDo Demo App', function() {
  it('This Application will add tasks', function() {
	  browser.get('http://todomvc.com/examples/angularjs/#/');
	  browser.manage().window().maximize();
	  
	  //Adding Tasks
	var TaskBar = element(by.model("newTodo2"));
	TaskBar.sendKeys("Task1");
	TaskBar.submit();
	TaskBar.sendKeys("Task2");
	TaskBar.submit();
	TaskBar.sendKeys("Task3");
	TaskBar.submit();
	
	//Complete Task1
	var Task1 = element(by.model("todo.completed"));
	Task1.click();
	
	//Check items left text
	var PendingCount = element(by.xpath("//span[@class='todo-count']"));
	expect(PendingCount.getText()).toEqual('2 items left');
	var Count = PendingCount.getText();
	console.log(Count);
	
	//Mouse Hover and Close Task2
	browser.manage().timeouts().implicitlyWait(3000);
	var Task2 = element(by.xpath("(//label[@class='ng-binding'])[2]"));
	browser.actions().mouseMove(Task2).perform();
	var Close = element(by.xpath("(//button[@class='destroy'])[2]"));
	Close.click();
	
	//Clear Completed Tasks
	var Complete = element(by.xpath("//button[@class='clear-completed']"));
	Complete.click();
	console.log("Script emd");
  });
});