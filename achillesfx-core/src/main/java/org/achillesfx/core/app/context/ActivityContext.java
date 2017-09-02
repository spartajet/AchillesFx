package org.achillesfx.core.app.context;

import org.achillesfx.core.app.AchillesFxApplication;
import org.achillesfx.core.app.base.AchillesFxStage;

/**
 * The type Activity context.
 *
 * @description
 * @create 2017 -09-02 下午1:07
 * @email spartajet.guo @gmail.com
 */
public class ActivityContext extends Context {
    /**
     * The Primary stage.
     */
    private AchillesFxStage primaryStage;


    /**
     * Instantiates a new Activity context.
     *
     * @param primaryStage          the primary stage
     * @param achillesFxApplication the achilles fx application
     */
    public ActivityContext(AchillesFxStage primaryStage, AchillesFxApplication achillesFxApplication) {
        this.primaryStage = primaryStage;
        this.achillesFxApplication = achillesFxApplication;
    }

    /**
     * Gets primary stage.
     *
     * @return the primary stage
     */
    public AchillesFxStage getPrimaryStage() {
        return primaryStage;
    }

    /**
     * Sets primary stage.
     *
     * @param primaryStage the primary stage
     */
    public void setPrimaryStage(AchillesFxStage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
