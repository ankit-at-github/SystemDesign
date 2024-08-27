package com.LLDDesignPatterns.WithStrategyPattern;

import com.LLDDesignPatterns.WithStrategyPattern.Strategy.DriveStrategy;
import com.LLDDesignPatterns.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super( new SportsDriveStrategy());
    }
}
