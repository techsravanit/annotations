package com.annon.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Robot {
	private Chip chip;

	@Autowired
	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}
}
