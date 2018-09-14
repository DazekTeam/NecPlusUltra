/*
 * Copyright (C) 2018 Dazek Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dazek.necplusultra;

import dazek.necplusultra.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

/**
 *
 * @author zekromaster
 */
public class NecPlusConfig {
    private static final String CATEGORY_GENERAL = "general";
    private static final String CATEGORY_PICKAXES = "pickaxes";
    private static final String CATEGORY_RF_ITEMS = "rf_items";
    
    // Properties
    public static int pickStrength = 10; 
    
    public static int rfBatteryMaxRF = 10000;
    public static int energyDrinkMaxRF = 1000;
    public static int energyDrinkMaxHunger = 12;
    
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
            initPickaxeConfig(cfg);
            initRFItems(cfg);
        } catch (Exception e1) {
            NecPlusUltra.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
    
    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
    }
    
    private static void initPickaxeConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_PICKAXES, "Pickaxes configuration -- For futureproofing");
        pickStrength = cfg.getInt("pickStrength", CATEGORY_PICKAXES, pickStrength, 2, 99, "A compressed pickaxe's durability is basepick * pickStrength");
    }
    
    private static void initRFItems(Configuration cfg){
        cfg.addCustomCategoryComment(CATEGORY_RF_ITEMS, "RF Items Configuration");
        rfBatteryMaxRF = cfg.getInt("rfBatteryMaxRF", CATEGORY_RF_ITEMS, rfBatteryMaxRF, 1, Integer.MAX_VALUE, "The maximum amount of rf that can be stored in a rf battery");        
        energyDrinkMaxRF = cfg.getInt("energyDrinkMaxRF", CATEGORY_RF_ITEMS, energyDrinkMaxRF, 1, Integer.MAX_VALUE, "The maximum amount of rf that can be stored in an energy drink");        
        energyDrinkMaxHunger = cfg.getInt("energyDrinkMaxRF", CATEGORY_RF_ITEMS, energyDrinkMaxHunger, 2, 20, "The maximum amount of hunger tha can be restored by an energy drink. Actual hunger restored is this multiplied by the ratio of RF stored to max RF.");        
    }
}
