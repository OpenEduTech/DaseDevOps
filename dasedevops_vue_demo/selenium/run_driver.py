import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service

driver = webdriver.Chrome(service=Service(path))    #path为ChromeDriver的本地路径
time.sleep(2)  #强制等待2秒
driver.quit()   #关闭浏览器