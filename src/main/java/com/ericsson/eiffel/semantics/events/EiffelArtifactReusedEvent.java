
package com.ericsson.eiffel.semantics.events;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EiffelArtifactReusedEvent
    extends Event
{

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("meta")
    @Expose
    private EiffelArtifactReusedEventMeta meta;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("data")
    @Expose
    private EiffelArtifactReusedEventData data;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();

    /**
     * 
     * (Required)
     * 
     */
    public EiffelArtifactReusedEventMeta getMeta() {
        return meta;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setMeta(EiffelArtifactReusedEventMeta meta) {
        this.meta = meta;
    }

    /**
     * 
     * (Required)
     * 
     */
    public EiffelArtifactReusedEventData getData() {
        return data;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setData(EiffelArtifactReusedEventData data) {
        this.data = data;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

}