package Testes_ProjetoAutomatizarAPIs.runners;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("Testes_ProjetoAutomatizarAPIs/tests")
@IncludeTags("todos")

public class AllApiTestsRunner {
}
