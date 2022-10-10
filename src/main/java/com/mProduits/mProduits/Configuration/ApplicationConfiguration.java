package com.mProduits.mProduits.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
public class ApplicationConfiguration {

    private int limitDesProduits;

    public int getLimitDesProduits() {
        return limitDesProduits;
    }

    public void setLimitDesProduits(int limitDesProduits) {
        this.limitDesProduits = limitDesProduits;
    }
}
