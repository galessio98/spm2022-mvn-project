package unicam.spm2022.junit;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Suite Demo")

@SelectClasses({HelloWorldTest.class , MyClassTest.class})
@IncludeTags("display")

public class JunitSuite {
}


