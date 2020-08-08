package com.clean.resources;

import com.clean.core.domain.services.Resource;
import com.clean.core.domain.services.ResourceBundleUtils;
import com.clean.core.domain.services.DefaultResourceBundleService;
import java.io.File;
import java.net.MalformedURLException;
import org.junit.Test;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class TestResources {

    @Test
    public void testExternalResource() throws MalformedURLException {
        Resource.registerResourceService(new DefaultResourceBundleService(ResourceBundleUtils.fromExternalFile(new File("C:\\Users\\Yo\\Documents\\NetBeansProjects\\TestNB\\res\\abc"), ResourceBundleUtils.SPANISH))
        );
        Resource.getString("perro");
    }

    @Test
    public void testExternalResourceApart() throws MalformedURLException {
        Resource.registerResourceService(new DefaultResourceBundleService(ResourceBundleUtils.fromExternalFile("C:\\Users\\Yo\\Documents\\NetBeansProjects\\TestNB\\res", "abc", ResourceBundleUtils.SPANISH))
        );
        Resource.getString("perro");
    }
}