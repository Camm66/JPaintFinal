package controller;

import viewInterfaces.IDialogChoice;

import java.util.Arrays;

public class ShadingSettings implements IDialogChoice {
    private ShadingType currentShadingType;

    void setCurrentShadingType(ShadingType currentShade) {
    	if(currentShade == null)
    		return;
    	else
    		this.currentShadingType = currentShade;
    }

    public ShadingType getCurrentShadingType(
    		) {
        return currentShadingType;
    }

    @Override
    public String getDialogTitle() {
        return "Select a Shading Type";
    }

    @Override
    public String getDialogText() {
        return "Select a Type:";
    }

    @Override
    public Object[] getDialogOptions() {
        return ShadingType.values();
    }

    @Override
    public ShadingType getDefaultChoice() {
        return currentShadingType;
    }
}
