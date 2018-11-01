package edu.century.finalProject;

//Array order {Charisma, Constitution, Dexterity, Intelligence, Strength, Wisdom}

public interface Constants {
		//Aasimar
			public final String AASIMAR_NAME = "Aasimar";
			public final int [] AASIMAR_RACIALBONUS = {2, 0, 0, 0, 0, 0};
			public final String AASIMAR_NAME_FALLEN = "Fallen";
			public final int [] AASIMAR_SUBRACEBONUS_FALLEN = {0, 0, 0, 0, 1, 0};
			public final String AASIMAR_NAME_PROTECTOR = "Protector";
			public final int [] AASIMAR_SUBRACEBONUS_PROTECTOR = {0, 0, 0, 0, 0, 1};
			public final String AASIMAR_NAME_SCOURGE = "Scourge";
			public final int [] AASIMAR_SUBRACEBONUS_SCOURGE = {0, 1, 0, 0, 0, 0};
			public final int AASIMAR_SPEED = 30;
			public final int AASIMAR_DARKVISION = 60;
			public final String [] AASIMAR_RESISTANCES = {"Necrotic", "Radiant"};
			public final String [] AASIMAR_LANGUAGES = {"Celestial", "Common"};
			public final Feature [] AASIMAR_FEATURE = {new Feature("Light", "You know the light cantrip, charisma is spellcasting ability"), 
					new Feature ("Healing hands", "You can heal a creature you can touch hit points to your level once per long rest")};
			public final Feature AASIMAR_FEATURE_FALLEN = new Feature("Necrotic Shroud", "Starting at 3rd level, you can use your action to unleash the divine energy within yourself, "
					+ "causing your eyes to turn into pools of darkness and two skeletal, ghostly, flightless wings to sprout from your back. The instant you transform, other creatures "
					+ "within 10 feet of you that can see you must each succeed on a Charisma saving throw (DC 8 + prof + mod) or become frightened of you until the end of your next "
					+ "turn. Your transformation lasts for 1 minute or until you end it as a bonus action. During it, once on each of your turns, you can "
					+ "eal extra necrotic damage equal to your level to one target when you deal damage to it with an attack.", 1, false, true, 3);
			public final Feature AASIMAR_FEATURE_PROTECTOR = new Feature("Radiant Consumption", "You unleash the divine energy within yourself, causing a searing light to radiate from you,"
					+ " pour out of your eyes and mouth, and threaten to char you. Your transformation lasts for 1 minute or until you end it as a bonus action. During it, you shed "
					+ "bright light in a 10-foot radius and dim light for an additional 10 feet, and at the end of each of your turns, you and each creature within 10 feet of you take "
					+ "radiant damage equal to half your level (rounded up). In addition, once on each of your turns, you can deal extra radiant damage to one target when you deal damage "
					+ "to it with an attack or a spell. The extra radiant damage equals your level.", 1, false, true, 3);
			public final Feature AASIMAR_FEATURE_SCOURGE = new Feature("Radiant Soul", "Unleash the divine energy within yourself, causing your eyes to glimmer and two luminous, incorporeal "
					+ "wings to sprout from your back. Your transformation lasts for 1 minute or until you end it as a bonus action. During it, you have a flying speed of 30 feet, and once on "
					+ "each of your turns, you can deal extra radiant damage to one target when you deal damage to it with an attack or a spell. The extra radiant damage equals your level.", 
					1, false, true, 3);
			
			//Dragonborn
			public final String DRAGONBORN_NAME = "Dragonborn";
			public final int [] DRAGONBORN_RACIALBONUS = {1, 0, 0, 0, 1, 0};
			public final int [] DRAGONBORN_SUBRACEBONUS = {0, 0, 0, 0, 0, 0};
			public final int DRAGONBORN_SPEED = 30;
			public final int DRAGONBORN_DARKVISION = 0;
			public final String DRAGONBORN_NAME_BLACK = "Black";
			public final String [] DRAGONBORN_RESISTANCES_BLACK = {"Acid"};
			public final String DRAGONBORN_NAME_BLUE = "Blue";
			public final String [] DRAGONBORN_RESISTANCES_BLUE = {"Lightning"};
			public final String DRAGONBORN_NAME_BRASS = "Brass";
			public final String [] DRAGONBORN_RESISTANCES_BRASS = {"Fire"};
			public final String DRAGONBORN_NAME_BRONZE = "Bronze";
			public final String [] DRAGONBORN_RESISTANCES_BRONZE = {"Lightning"};
			public final String DRAGONBORN_NAME_COPPER = "Copper";
			public final String [] DRAGONBORN_RESISTANCES_COPPER = {"Acid"};
			public final String DRAGONBORN_NAME_GOLD = "Gold";
			public final String [] DRAGONBORN_RESISTANCES_GOLD = {"Fire"};
			public final String DRAGONBORN_NAME_GREEN = "Green";
			public final String [] DRAGONBORN_RESISTANCES_GREEN = {"Poison"};
			public final String DRAGONBORN_NAME_RED = "Red";
			public final String [] DRAGONBORN_RESISTANCES_RED = {"Fire"};
			public final String DRAGONBORN_NAME_SILVER = "Silver";
			public final String [] DRAGONBORN_RESISTANCES_SILVER = {"Cold"};
			public final String DRAGONBORN_NAME_WHITE = "White";
			public final String [] DRAGONBORN_RESISTANCES_WHITE = {"Cold"};
			public final String [] DRAGONBORN_LANGUAGES = {"Draconic", "Common"};
			public final Feature [] DRAGONBORN_FEATURE = {new Feature("Breath weapon", "Once per long rest, you can unleash a breath of energy determined by your color. Creatures in the area"
					+ "must roll a dexterity saving throw. DC for this saving throw is 8 + Con mod + Prof mod. A creature takes 2d6 on failed, half on a successful save. The damage increases "
					+ "to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. Black, Blue, Brass, Bronze, Copper dragons breath is 5 by 30 ft. line (Dex. save). Gold and Red breaths"
					+ "are a 15ft cone (Dex save). Green, Silver, White dragons breath are a 15ft cone (Con save)", 1, false, true, 1)};
			public final Feature [] DRAGONBORN_SUBRACE_FEATURE = null;
			
			
			//Dwarf
			public final String DWARF_NAME = "Dwarf";
			public final int [] DWARF_RACIALBONUS = {0, 2, 0, 0, 0, 0};
			public final String DWARF_NAME_HILL = "Hill";
			public final int [] DWARF_SUBRACEBONUS_HILL = {0, 0, 0, 0, 0, 1};
			public final String DWARF_NAME_MOUNTAIN = "Mountain";
			public final int [] DWARF_SUBRACEBONUS_MOUNTAIN = {0, 0, 0, 0, 2, 0};
			public final int DWARF_SPEED = 25;
			public final int DWARF_DARKVISION = 60;
			public final String [] DWARF_RESISTANCES = {"Poision"};
			public final String [] DWARF_LANGUAGES = {"Dwarvish", "Common"};
			public final Feature [] DWARF_FEATURES = {new Feature("Dwarven Combat Training", "You have proficiency with the battleaxe, handaxe, light hammer, and warhammer."), 
					new Feature("Tool Proficency", "You gain proficiency with one of smith's tools, brewer's supplies, or mason's tools."), new Feature("Stonecutting", "Whenever you make a"
							+ " History check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.")};
			public final Feature [] DWARF_FEATURES_HILL = {new Feature("Dwarven Toughness", "Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.")};
			public final Feature [] DWARF_FEATURES_MOUNTAIN = {new Feature("Dwarven Armor Training", "You have proficiency with light and medium armor.")};
			
			
			//Elf
			public final String ELF_NAME = "Elf";
			public final int [] ELF_RACIALBONUS = {0, 0, 2, 0, 0, 0};
			public final String ELF_NAME_DROW = "Dark";
			public final int [] ELF_SUBRACEBONUS_DROW = {1, 0, 0, 0, 0, 0};
			public final int ELF_DARKVISION_DROW = 120;
			public final String ELF_NAME_HIGH = "High";
			public final int [] ELF_SUBRACEBONUS_HIGH = {0, 0, 1, 0, 0, 0};
			public final String ELF_NAME_WOOD = "Wood";
			public final int [] ELF_SUBRACEBONUS_WOOD = {0, 0, 0, 0, 0, 1};
			public final int ELF_SPEED_WOOD = 35;
			public final String [] ELF_RESISTANCES = {};
			public final String [] ELF_LANGUAGES = {"Common", "Elvish"};
			public final Feature [] ELF_FEATURES = {};
			
			public final int ELF_SPEED = 30;
			public final int ELF_DARKVISION = 60;
			
			//Gnome
			
			//Half-elf
			
			//Half-Orc
			
			//Halfling
			
			//Human
			
			//Lizardfolk
			
			//Tiefling
			
			/*
			 * DICE
			 */
			
			public final Dice d4 = new Dice(4);
			public final Dice d6 = new Dice(6);
			public final Dice d8 = new Dice(8);
			public final Dice d10 = new Dice(10);
			public final Dice d12 = new Dice(12);
			public final Dice d20 = new Dice(20);
			public final Dice d100 = new Dice(100);
			
			
			/* Skill points
			 * 
			 */
			
			
}
