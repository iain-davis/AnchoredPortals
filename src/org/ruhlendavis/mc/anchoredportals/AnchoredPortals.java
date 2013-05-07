package org.ruhlendavis.mc.anchoredportals;

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;
import org.ruhlendavis.mc.utility.Log;

/**
 *
 * @author Iain E. Davis <iain@ruhlendavis.org>
 */
public final class AnchoredPortals extends JavaPlugin
{
	public static Log log;
	/**
	 * Called by Minecraft when enabling the plugin.
	 */
	@Override
	public void onEnable()
	{
		log = new Log(this.getLogger(), Level.CONFIG);
	}

	/**
	 * Called by Minecraft when disabling the plugin.
	 */
	@Override
	public void onDisable()
	{

	}
}
