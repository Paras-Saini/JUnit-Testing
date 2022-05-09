package com.in28minutes.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayCompareTest.class, QuickBeforeAfterTest.class, StringHelperParametrizedTest2.class,
		StringHelperTest.class })
public class AllTests {

}
