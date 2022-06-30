import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import unittest

driver = webdriver.Chrome(service=Service(path))    #path为ChromeDriver本地路径
class LoginCase(unittest.TestCase):
    def login(self):
        driver.get("http://localhost:8082/")
        driver.find_element(By.XPATH,'//*[@id="app"]/div/div/div/div/div[2]/label[1]').send_keys('admin')   #输入账号
        driver.find_element(By.XPATH,'//*[@id="app"]/div/div/div/div/div[2]/label[2]').send_keys('123456789')   #输入密码
        driver.find_element(By.XPATH,'//*[@id="app"]/div/div/div/div/div[2]/button').click()     #登录
        time.sleep(0.5)
        text = driver.find_element(By.XPATH,'//*[@id="app"]/div/div/div/div').text    #获取该元素的文本内容
        print(text)    #将会在终端中输出获取的文本内容
        driver.quit()   #关闭浏览器

if __name__ == '__main__':
    testsuite = unittest.TestSuite()
    testsuite.addTest(LoginCase("login"))
    runner = unittest.TextTestRunner()
    runner.run(testsuite)