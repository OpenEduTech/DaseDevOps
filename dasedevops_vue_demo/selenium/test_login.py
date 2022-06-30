from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import unittest
import time
from BSTestRunner import BSTestRunner

driver = webdriver.Chrome(service=Service(path))    #path为ChromeDriver本地路径
class LoginCase(unittest.TestCase):
    def login(self):
        driver.get("http://localhost:8082/")
        driver.find_element(By.XPATH,'//*[@id="app"]/div/div/div/div/div[2]/label[1]').send_keys('admin')   #输入账号
        driver.find_element(By.XPATH,'//*[@id="app"]/div/div/div/div/div[2]/label[2]').send_keys('123456789')   #输入密码
        driver.find_element(By.XPATH,'//*[@id="app"]/div/div/div/div/div[2]/button').click()     #登录
        # time.sleep(0.5)    #强制等待0.5s
        text = driver.find_element(By.XPATH,'//*[@id="app"]/div/div/div/div').text    #获取该元素的文本内容
        print(text)  #将会在测试报告中输出获取的文本内容
        driver.quit()  #关闭浏览器

if __name__ == '__main__':
    report_title = u'vue-demo登录测试报告'
    desc = u'测试报告详情：'
    date=time.strftime("%Y%m%d")
    time_=time.strftime("%Y%m%d%H%M%S")
    testsuite = unittest.TestSuite()
    testsuite.addTest(LoginCase("login"))
    with open('report.html', 'wb') as report:
        runner = BSTestRunner(stream=report, title=report_title, description=desc)
        runner.run(testsuite)
    report.close()
