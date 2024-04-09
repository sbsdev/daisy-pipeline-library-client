package ch.sbs.pipeline;

import java.util.ServiceLoader;

import org.daisy.pipeline.script.ScriptRegistry;
import org.daisy.pipeline.script.ScriptService;

public class App 
{
    private static ServiceLoader<ScriptRegistry> scriptRegistryLoader = ServiceLoader.load(ScriptRegistry.class);

    public static void main( String[] args )
    {
	System.out.println( "Hello World!" );
	String scriptName = "dtbook-to-html";
	for (ScriptRegistry registry: scriptRegistryLoader) {
	    ScriptService script = registry.getScript(scriptName);
	    if (script != null) {
		System.out.println("Found script");
	    }
	}
    }
}
