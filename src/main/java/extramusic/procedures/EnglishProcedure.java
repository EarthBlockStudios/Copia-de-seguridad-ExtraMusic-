package extramusic.procedures;

import net.minecraft.world.entity.Entity;

import extramusic.network.SiriusrModVariables;

public class EnglishProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Used for creating discs from the mod";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Mstudioen = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "They exchange a random disc or some iron";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Bard1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "for 5 emeralds";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.bard2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Used for creating discs from the mod";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.dv1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "and music studio";
			entity.getCapability(SiriusrModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.dv2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
