package com.LLDDesignPatterns.WithStrategyPattern;

import com.LLDDesignPatterns.WithStrategyPattern.Strategy.DriveStrategy;
import com.LLDDesignPatterns.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
