package task.dev2.config;

import net.minecraftforge.common.config.Config;
import task.dev2.Dev2;

public class CfgAdvanced {

	@Config.Comment("The list of the items that are expected to appear in the creative tab called Dev2")
	@Config.RequiresMcRestart
	public String[] itemsInTab = new String[] {
		"minecraft:command_block",
		"minecraft:chain_command_block",
		"minecraft:repeating_command_block",
		"minecraft:barrier",
		"minecraft:dragon_egg"
	};
	
	@Config.Comment("The list of the skulls that are expected to appear in the creative tab called Dev2-Skull")
	@Config.RequiresMcRestart
	public String[] skullsInTab = new String[] {
		"534c47c4-d04d-416a-bf99-c3efd621d668|eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjkxMzY1MTRmMzQyZTdjNTIwOGExNDIyNTA2YTg2NjE1OGVmODRkMmIyNDkyMjAxMzllOGJmNjAzMmUxOTMifX19|Cake",
		"82f740c9-af74-4620-9c76-f6012a8c0af8|eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmYyY2RmZjYyZjA1ZGJlN2RiN2ZkMTkxOTQ5MTgzZTI3NjRkNjhmMzc3MjZkYjM1NmFhNDYxYTU4YzU0YSJ9fX0=|Blue Bucket of Milk",
		"a75e3f60-2242-4429-8ece-bcde7753b064|eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjM0ODdkNDU3ZjkwNjJkNzg3YTNlNmNlMWM0NjY0YmY3NDAyZWM2N2RkMTExMjU2ZjE5YjM4Y2U0ZjY3MCJ9fX0=|Bread",
		"0718ac7f-0e1e-4a6b-b361-3e20f5768376|eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTAzZDY1OTdjYTQ0Y2JiYmRlZTdhMTM1NzRhNGNiNzkyYTc1YmU2ZWQ1OWE4OGY5OTUyMTYyZmQ5M2EyNTY3ZSJ9fX0=|Bowl of Soup",
		"f597e06f-e01a-492d-b63f-c23b9809ce01|eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzVlMjc5ODhhNjUzODAxMGVmYzBlMjQ3NTZiYzNlM2VlYTI0ZDc1MzZiMjA5MzJjMTdlMDQwNGU1Y2M1NWYifX19|Hamburger",
		"d1375075-c727-40ad-bcce-7e4277099e30|eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTZlZjFjMjVmNTE2ZjJlN2Q2Zjc2Njc0MjBlMzNhZGNmM2NkZjkzOGNiMzdmOWE0MWE4YjM1ODY5ZjU2OWIifX19|Hamburger",
		"bf871b6c-92c7-454c-aa05-174e6cf98c45|eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjA2NTU1NzA2YjY0MWZkYWY0MzZjMDc2NjNmOTIzYWZjNWVlNzIxNDZmOTAxOTVmYjMzN2I5ZGU3NjY1ODhkIn19fQ==|Turkey",
		"9ede6328-599d-422d-aea0-394d2d8ba39b|eyJ0aW1lc3RhbXAiOjE1NjEyNzczNDAxODYsInByb2ZpbGVJZCI6IjllZGU2MzI4NTk5ZDQyMmRhZWEwMzk0ZDJkOGJhMzliIiwicHJvZmlsZU5hbWUiOiJUYXNrZXJlbiIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDg2YmJmY2RhMTFkZDU4YmY1NTc2YmI4ZTJjMDRiMjkwODkzZTY5MGNmNTE1ODRkMDhlNjM1MjVjYWFiMmFmNyJ9fX0=|Skull of Taskeren"
	};
	
}
