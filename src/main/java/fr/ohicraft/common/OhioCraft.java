package fr.ohicraft.common;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(OhioCraft.MODID)
@Mod.EventBusSubscriber(modid = OhioCraft.MODID,
						bus = Mod.EventBusSubscriber.Bus.MOD)
public final class OhioCraft {
	
	public static final String MODID = "ohiocraft";
	
	private static final Logger LOGGER = LogUtils.getLogger();
	
	public OhioCraft() {
		// TODO Auto-generated constructor stub
	}
	
	@SubscribeEvent
	void onCommonSetup(FMLCommonSetupEvent event) {}
	
}
