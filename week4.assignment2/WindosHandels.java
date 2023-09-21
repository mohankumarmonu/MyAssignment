package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindosHandels {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(string);
			
		}
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String string1 : windowHandles2) {
			System.out.println(string1);
			
		}
		List<String> list1 =new ArrayList<>(windowHandles2);
		driver.switchTo().window(list1.get(1));
		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		for (String string2 : windowHandles3) {
			System.out.println(string2);
			
		}
		List<String> list2 = new ArrayList<>(windowHandles3);
		driver.switchTo().window(list2.get(1));
		driver.switchTo().window(list2.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		for (String string3 : windowHandles4) {
			System.out.println(string3);
			
		}
		List<String> list3 = new ArrayList<>(windowHandles4);
		driver.switchTo().window(list3.get(1));
		driver.switchTo().window(list3.get(0));
		String pWindowHandles = driver.getTitle();
		System.out.println(pWindowHandles);
		
		

	}

}
