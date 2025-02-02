package cz.despektprg.sweettownmod;

import cz.despektprg.sweettownmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//very important pokus
public class SweetTownMod implements ModInitializer {
	public static final String MOD_ID = "sweettownmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
		LOGGER.info("Hello Fabric world!");
	}
}