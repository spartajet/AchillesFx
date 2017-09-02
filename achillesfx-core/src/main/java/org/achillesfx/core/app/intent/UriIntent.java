package org.achillesfx.core.app.intent;

import javafx.application.HostServices;
import org.achillesfx.core.app.context.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Uri intent.
 *
 * @description
 * @create 2017 -09-03 上午12:08
 * @email spartajet.guo @gmail.com
 */
public class UriIntent {
    private Logger logger = LoggerFactory.getLogger(UriIntent.class);
    /**
     * The Context.
     */
    private Context context;
    /**
     * The Uri.
     */
    private String uri;
    /**
     * The Host services.
     */
    private HostServices hostServices;

    /**
     * Instantiates a new Uri intent.
     *
     * @param context the context
     * @param uri     the uri
     */
    public UriIntent(UriType type, Context context, String uri) {
        this.context = context;
        switch (type) {
            case LINK:
                this.uri = uri;
                break;
            case FILE:
                this.uri = this.context.getResource(uri).toString();
                break;
        }
        this.hostServices = this.context.getAchillesFxApplication().getHostServices();
    }

    /**
     * Start.
     */
    public void start() {
        this.hostServices.showDocument(uri);
    }

    /**
     * Gets context.
     *
     * @return the context
     */
    public Context getContext() {
        return context;
    }

    /**
     * Sets context.
     *
     * @param context the context
     */
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * Gets uri.
     *
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets uri.
     *
     * @param uri the uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    public enum UriType {
        LINK, FILE
    }

}
