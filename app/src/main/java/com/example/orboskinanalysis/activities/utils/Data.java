package com.example.orboskinanalysis.activities.utils;

public class Data
{
    private String featureImage;
    private String featureName;

    public Data(String featureImage, String featureName) {
        this.featureImage = featureImage;
        this.featureName = featureName;
    }

    public String getFeatureImage()
    {
        return featureImage;
    }

    public void setFeatureImage(String featureImage)
    {
        this.featureImage = featureImage;
    }

    public String getFeatureName()
    {
        return featureName;
    }

    public void setFeatureName(String featureName)
    {
        this.featureName = featureName;
    }
}
