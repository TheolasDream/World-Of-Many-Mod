package com.TheolasDream.WorldsMany;

import com.TheolasDream.WorldsMany.proxy.CommonProxy;
import com.TheolasDream.WorldsMany.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID,name=Reference.NAME,version=Reference.VERSION,acceptedMinecraftVersions=Reference.ACCEPTED_VERSIONS)

public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide=Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	}

