
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package extramusic.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SiriusrModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("siriusr", "enemy"), new SoundEvent(new ResourceLocation("siriusr", "enemy")));
		REGISTRY.put(new ResourceLocation("siriusr", "enemyb"), new SoundEvent(new ResourceLocation("siriusr", "enemyb")));
		REGISTRY.put(new ResourceLocation("siriusr", "thecoftcking"), new SoundEvent(new ResourceLocation("siriusr", "thecoftcking")));
		REGISTRY.put(new ResourceLocation("siriusr", "ct"), new SoundEvent(new ResourceLocation("siriusr", "ct")));
		REGISTRY.put(new ResourceLocation("siriusr", "won"), new SoundEvent(new ResourceLocation("siriusr", "won")));
		REGISTRY.put(new ResourceLocation("siriusr", "giothem"), new SoundEvent(new ResourceLocation("siriusr", "giothem")));
		REGISTRY.put(new ResourceLocation("siriusr", "swewea"), new SoundEvent(new ResourceLocation("siriusr", "swewea")));
		REGISTRY.put(new ResourceLocation("siriusr", "smellliktin"), new SoundEvent(new ResourceLocation("siriusr", "smellliktin")));
		REGISTRY.put(new ResourceLocation("siriusr", "morirodare"), new SoundEvent(new ResourceLocation("siriusr", "morirodare")));
		REGISTRY.put(new ResourceLocation("siriusr", "seven_nation_army-the_withe_stripes"),
				new SoundEvent(new ResourceLocation("siriusr", "seven_nation_army-the_withe_stripes")));
		REGISTRY.put(new ResourceLocation("siriusr", "save_tonight-eagle_eye_cherry"),
				new SoundEvent(new ResourceLocation("siriusr", "save_tonight-eagle_eye_cherry")));
		REGISTRY.put(new ResourceLocation("siriusr", "sultans_of_swing-dire_straits"),
				new SoundEvent(new ResourceLocation("siriusr", "sultans_of_swing-dire_straits")));
		REGISTRY.put(new ResourceLocation("siriusr", "du_hast-ramstein"), new SoundEvent(new ResourceLocation("siriusr", "du_hast-ramstein")));
		REGISTRY.put(new ResourceLocation("siriusr", "seven_nation_army_2"), new SoundEvent(new ResourceLocation("siriusr", "seven_nation_army_2")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
