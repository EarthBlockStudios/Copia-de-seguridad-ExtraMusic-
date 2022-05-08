package extramusic.procedures;

import net.minecraft.world.entity.Entity;

import extramusic.network.SiriusrModVariables;

public class EspanolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Es utilizado para crear discos del mod";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Mstudioen = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Te intercambiar\uFFFDn un disco aleatorio o 5 de hierro";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Bard1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "a cambio de 5 esmeraldas";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.bard2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Es utilizado para crear los discos del mod";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.dv1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "y el estudio de m\uFFFDsica";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.dv2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
