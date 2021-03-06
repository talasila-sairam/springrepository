package com.bean.annotation;

public class Radio {
private int frequency;
private String stationName;
private Chip chip;
private int i;
public Chip getChip() {
	return chip;
}
public Radio(int i) {
	this.i = i;
}

@Override
public String toString() {
	return "Radio [frequency=" + frequency + ", stationName=" + stationName + ", chip=" + chip + "]";
}
public void setChip(Chip chip) {
	this.chip = chip;
}
public int getFrequency() {
	return frequency;
}
public String getStationName() {
	return stationName;
}
public void setFrequency(int frequency) {
	this.frequency = frequency;
}
 public void setStationName(String stationName) {
	this.stationName = stationName;
}

}
