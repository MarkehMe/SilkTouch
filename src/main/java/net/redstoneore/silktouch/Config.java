package net.redstoneore.silktouch;

import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.List;

import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.block.BlockTypes;

import net.redstoneore.rson.Rson;

public class Config extends Rson<Config> {

	private static transient Config i;
	public static Config get() {
		if (i == null) {
			i = new Config();
			i.setup(Paths.get(SilkTouch.get().getConfigDirectory().toString(), "config.json"), Charset.defaultCharset());
		}
		return i;
	}
	public Config() { }
	
	public Boolean requirePermission = false;
	
	public List<BlockType> enableSilkTouchFor = Lists.toList(BlockType.class,
		BlockTypes.MOB_SPAWNER
	);
	
}