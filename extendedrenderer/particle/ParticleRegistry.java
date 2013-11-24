package extendedrenderer.particle;

import net.minecraft.util.Icon;
import net.minecraftforge.client.event.TextureStitchEvent;

public class ParticleRegistry {

	public static Icon squareGrey;
	public static Icon smoke;
	public static Icon cloud;
	
	public static void init(TextureStitchEvent event) {
		if (event.map.textureType == 1) {
			squareGrey = event.map.registerIcon("ExtendedRenderer:particles/white");
			smoke = event.map.registerIcon("ExtendedRenderer:particles/smoke_00");
			cloud = event.map.registerIcon("ExtendedRenderer:particles/cloud64");
			
		}
	}
}
