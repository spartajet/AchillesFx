package org.achillesfx.core.app.context;

import org.achillesfx.core.app.AchillesFxApplication;

import java.net.URL;

/**
 * The type Context.
 *
 * @description
 * @create 2017 -08-19 下午12:15
 * @email spartajet.guo @gmail.com
 */
public abstract class Context {
    /**
     * The Achilles fx application.
     */
    protected AchillesFxApplication achillesFxApplication;

    /**
     * Gets path.
     *
     * @return the path
     */
    public String getPath() {
        return this.getClass().getResource("/").getPath();
    }

    /**
     * Gets resource path.
     *
     * @param resourceName the resource name
     * @return the resource path
     */
    public String getResourcePath(String resourceName) {
        return this.getClass().getResource(resourceName).getPath();
    }

    /**
     * Gets resource.
     *
     * @param resourceName the resource name
     * @return the resource
     */
    public URL getResource(String resourceName) {
        return this.getClass().getResource(resourceName);
    }

    /**
     * Gets achilles fx application.
     *
     * @return the achilles fx application
     */
    public AchillesFxApplication getAchillesFxApplication() {
        return achillesFxApplication;
    }

    /**
     * Sets achilles fx application.
     *
     * @param achillesFxApplication the achilles fx application
     */
    public void setAchillesFxApplication(AchillesFxApplication achillesFxApplication) {
        this.achillesFxApplication = achillesFxApplication;
    }

}
