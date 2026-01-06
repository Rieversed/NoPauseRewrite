package dev.rieversed.nopause;
/*? if fabric {*/
import net.fabricmc.api.ModInitializer;
/*?}*/

/*? if forge {*/
/*import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
*/
/*?}*/

/*? if neoforge {*/
/*import net.neoforged.fml.ModContainer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
*/
/*?}*/

/*? if forgeLike {*/
/*@Mod("nopause")
public class Nopause {*/
/*?}*/

/*? if fabric {*/
public class Nopause implements ModInitializer {
/*?}*/

    /*? if forge {*/
    /*public Nopause(final FMLJavaModLoadingContext context) {}*/
    /*?}*/

    /*? if neoforge {*/
    /*public Nopause(IEventBus modEventBus, ModContainer modContainer) {}*/
    /*?}*/

    /*? if fabric {*/
    @Override
    public void onInitialize() {}
    /*?}*/
}
