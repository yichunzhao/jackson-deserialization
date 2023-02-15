package com.ynz.demo.jackson.serializeobject.dataobject;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Provider data model presents attributes that required by AutoRemind central.
 */
public final class Provider implements Serializable {
    @JsonProperty("remoteProviderId")
    private String remoteProviderId;

    @JsonProperty("providerName")
    private String providerName;

    @JsonProperty("providerState")
    private String providerState;

    @JsonProperty("remoteModified")
    private String remoteModified;

    public String getRemoteProviderId() {
        return remoteProviderId;
    }

    public void setRemoteProviderId(final String remoteProviderId) {
        this.remoteProviderId = remoteProviderId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(final String providerName) {
        this.providerName = providerName;
    }

    public String getProviderState() {
        return providerState;
    }

    public void setProviderState(final String providerState) {
        this.providerState = providerState;
    }

    public String getRemoteModified() {
        return remoteModified;
    }

    public void setRemoteModified(final String remoteModified) {
        this.remoteModified = remoteModified;
    }
}
