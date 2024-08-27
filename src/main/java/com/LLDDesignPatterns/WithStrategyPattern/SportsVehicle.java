package com.LLDDesignPatterns.WithStrategyPattern;

import com.LLDDesignPatterns.WithStrategyPattern.Strategy.DriveStrategy;
import com.LLDDesignPatterns.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
