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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = NecPlusUltra.MODID, name = NecPlusUltra.NAME, version = NecPlusUltra.VERSION, useMetadata=true)
public class NecPlusUltra
{
  public static final String MODID = "necplusultra";
  public static final String NAME = "Nec Plus Ultra";
  public static final String VERSION = "v1#19";


  public static Logger logger;

  public static CreativeTabs necTab = new CreativeTab();

  @SidedProxy (clientSide = "dazek.necplusultra.proxy.ClientProxy", serverSide = "dazek.necplusultra.proxy.CommonProxy")
  public static CommonProxy proxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event){
  	logger = event.getModLog();
  	proxy.preInit(event);
  }

  @EventHandler
  public void init(FMLInitializationEvent e){
  	proxy.init(e);
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent e){
  	proxy.postInit(e);
  }
}
