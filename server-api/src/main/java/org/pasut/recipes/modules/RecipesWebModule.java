package org.pasut.recipes.modules;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.google.inject.name.Names;
import com.google.inject.servlet.ServletModule;

public class RecipesWebModule extends ServletModule {
	@Override
	protected void configureServlets() {
		Properties properties = loadProperties("/settings.properties");
		Names.bindProperties(binder(), properties);
		
		install(new ServletModule());
		install(new ServiceModule());
		install(new ResourcesModule());
	}
	
	private static Properties loadProperties(String name){
		Properties props = new Properties();
		InputStream is = new Object(){}
							.getClass()
							.getEnclosingClass()
							.getResourceAsStream(name);
		try{
			props.load(is);
		}catch(IOException e){
			throw new RuntimeException(e);
		} finally {
			if(is != null){
				try{
					is.close();
				}catch(IOException e){}
			}
		}
		return props;
	}
}
