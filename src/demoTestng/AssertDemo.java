package demoTestng;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	@Test
	public void tc()
	{
		String ac="Ankur";
		String ex="Ankur";
		Assert.assertEquals(ac,ex);
		System.out.println("Hello");
		List<Object> lst1=new ArrayList<Object>();
		lst1.add("Alia");
		lst1.add(122);
		lst1.add(65.5);
		lst1.add(true);
		List<Object> lst2=new ArrayList<Object>();
		lst1.add("Alia");
		lst1.add(122);
		lst1.add(65.5);
		lst1.add(false);
		Assert.assertEquals(lst1,lst2);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("ank", "unk");
		System.out.println("matched");
		sa.assertAll();
		
	}

}
