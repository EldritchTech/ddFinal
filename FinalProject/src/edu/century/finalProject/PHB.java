package edu.century.finalProject;

public interface PHB extends Constants{
	
	/* Aasimar Races - Volo's Guide to Monsters
	 * Subraces: Fallen, Protector, Scourge
	 */
	
	//Aasimar (reference)
	public final Race aasimar = new Race(AASIMAR_NAME, AASIMAR_RACIALBONUS,
			AASIMAR_RESISTANCES, AASIMAR_LANGUAGES, AASIMAR_SPEED, AASIMAR_DARKVISION,
			AASIMAR_FEATURE, AASIMAR_PROFICIENCIES);
	
	//Fallen Aasimar
	public final Race aasimarFallen = new Race(AASIMAR_NAME, AASIMAR_NAME_FALLEN,
			AASIMAR_RACIALBONUS, AASIMAR_SUBRACEBONUS_FALLEN,
			AASIMAR_RESISTANCES, AASIMAR_LANGUAGES, AASIMAR_SPEED, AASIMAR_DARKVISION,
			AASIMAR_FEATURE, AASIMAR_FEATURE_FALLEN, AASIMAR_PROFICIENCIES,
			AASIMAR_PROFICIENCIES_SUBRACE);
	
	//Protector Aasimar
	public final Race aasimarProtector = new Race(AASIMAR_NAME, AASIMAR_NAME_PROTECTOR,
			AASIMAR_RACIALBONUS, AASIMAR_SUBRACEBONUS_PROTECTOR,
			AASIMAR_RESISTANCES, AASIMAR_LANGUAGES, AASIMAR_SPEED, AASIMAR_DARKVISION,
			AASIMAR_FEATURE, AASIMAR_FEATURE_PROTECTOR, AASIMAR_PROFICIENCIES,
			AASIMAR_PROFICIENCIES_SUBRACE);
	
	//Scourge Aasimar
	public final Race aasimarScourge = new Race(AASIMAR_NAME, AASIMAR_NAME_SCOURGE,
			AASIMAR_RACIALBONUS, AASIMAR_SUBRACEBONUS_SCOURGE, 
			AASIMAR_RESISTANCES, AASIMAR_LANGUAGES, AASIMAR_SPEED, AASIMAR_DARKVISION,
			AASIMAR_FEATURE, AASIMAR_FEATURE_SCOURGE, AASIMAR_PROFICIENCIES,
			AASIMAR_PROFICIENCIES_SUBRACE);
	
	/* Dragonborn Races - Player's Handbook
	 * Subraces: Black, Blue, Brass, Bronze, Copper, Gold, Green, Red, Silver, White
	 */
	
	//Dragonborn (reference)
	public final Race dragonborn = new Race(DRAGONBORN_NAME, DRAGONBORN_RACIALBONUS,
			DRAGONBORN_RESISTANCES, DRAGONBORN_LANGUAGES, DRAGONBORN_SPEED, DRAGONBORN_DARKVISION,
			DRAGONBORN_FEATURE, DRAGONBORN_PROFICIENCIES);
	
	//Black Dragonborn
	public final Race dragonbornBlack = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_BLACK, 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_BLACK, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Blue Dragonborn
	public final Race dragonbornBlue = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_BLUE, 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_BLUE, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Brass Dragonborn
	public final Race dragonbornBrass = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_BRASS, 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_BRASS, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Bronze Dragonborn
	public final Race dragonbornBronze = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_BRONZE,
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_BRONZE, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE,
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Copper Dragonborn
	public final Race dragonbornCopper = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_COPPER, 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_COPPER, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Gold Dragonborn
	public final Race dragonbornGold = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_GOLD, 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_GOLD, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Green Dragonborn
	public final Race dragonbornGreen = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_GREEN, 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_GREEN, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Red Dragonborn
	public final Race dragonbornRed = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_RED, 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_RED, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Silver Dragonborn
	public final Race dragonbornSilver = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_SILVER, 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_SILVER, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//White Dragonborn
	public final Race dragonbornWhite = new Race(DRAGONBORN_NAME, DRAGONBORN_NAME_WHITE, 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_WHITE, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);

	
	/* Dwarf Races - Player's Handbook
	 * Subraces: Hill, Mountain
	 */
	
	//Dwarf (reference)
	public final Race dwarf = new Race(DWARF_NAME, DWARF_RACIALBONUS, DWARF_RESISTANCES,
			DWARF_LANGUAGES, DWARF_SPEED, DWARF_DARKVISION, DWARF_FEATURES, DWARF_PROFICIENCIES);
	
	//Hill Dwarf
	public final Race dwarfHill = new Race(DWARF_NAME, DWARF_NAME_HILL, 
			DWARF_RACIALBONUS, DWARF_SUBRACEBONUS_HILL, DWARF_RESISTANCES, 
			DWARF_LANGUAGES, DWARF_SPEED, DWARF_DARKVISION, DWARF_FEATURES, 
			DWARF_FEATURES_HILL, DWARF_PROFICIENCIES, DWARF_PROFICIENCIES_HILL);
	
	//Mountain Dwarf
	public final Race dwarfMountain = new Race(DWARF_NAME, DWARF_NAME_MOUNTAIN, 
			DWARF_RACIALBONUS, DWARF_SUBRACEBONUS_MOUNTAIN, DWARF_RESISTANCES, 
			DWARF_LANGUAGES, DWARF_SPEED, DWARF_DARKVISION, DWARF_FEATURES, 
			DWARF_FEATURES_MOUNTAIN, DWARF_PROFICIENCIES, DWARF_PROFICIENCIES_MOUNTAIN);
	
	/* Elf Races - Player's Handbook
	 * Subraces: High, Wood, Dark
	 */
	
	//Elf (reference)
	public final Race elf = new Race(ELF_NAME, ELF_RACIALBONUS, ELF_RESISTANCES, 
			ELF_LANGUAGES, ELF_SPEED, ELF_DARKVISION, ELF_FEATURES, ELF_PROFICIENCIES);
	
	//Dark elf (Drow)
	public final Race elfDark = new Race(ELF_NAME, ELF_NAME_DROW,
			ELF_RACIALBONUS, ELF_SUBRACEBONUS_DROW, ELF_RESISTANCES,
			ELF_LANGUAGES, ELF_SPEED, ELF_DARKVISION_DROW, ELF_FEATURES,
			ELF_FEATURES_DROW, ELF_PROFICIENCIES, ELF_PROFICIENCIES_DROW);
	
	//High Elf
	public final Race elfHigh = new Race(ELF_NAME, ELF_NAME_HIGH,
			ELF_RACIALBONUS, ELF_SUBRACEBONUS_HIGH, ELF_RESISTANCES,
			ELF_LANGUAGES, ELF_SPEED, ELF_DARKVISION, ELF_FEATURES,
			ELF_FEATURES_HIGH, ELF_PROFICIENCIES, ELF_PROFICIENCIES_HIGH);
	
	//Wood Elf
	public final Race elfWood = new Race(ELF_NAME, ELF_NAME_WOOD,
			ELF_RACIALBONUS, ELF_SUBRACEBONUS_WOOD, ELF_RESISTANCES,
			ELF_LANGUAGES, ELF_SPEED, ELF_DARKVISION, ELF_FEATURES,
			ELF_FEATURES_WOOD, ELF_PROFICIENCIES, ELF_PROFICIENCIES_WOOD);
	
	
	/* Gnome Races - Player's Handbook
	 * Subraces: Rock, Deep
	 */
	
	//Gnome (reference)
	public final Race gnome = new Race(GNOME_NAME, GNOME_RACIALBONUS, GNOME_RESISTANCES,
			GNOME_LANGUAGES, GNOME_SPEED, GNOME_DARKVISION, GNOME_FEATURES, GNOME_PROFICIENCIES);
	
	//Rock Gnome
	
	public final Race gnomeRock = new Race(GNOME_NAME, GNOME_NAME_ROCK,
			GNOME_RACIALBONUS, GNOME_SUBRACEBONUS_ROCK, GNOME_RESISTANCES,
			GNOME_LANGUAGES, GNOME_SPEED, GNOME_DARKVISION, GNOME_FEATURES,
			GNOME_FEATURES_ROCK, GNOME_PROFICIENCIES, GNOME_PROFICIENCIES_ROCK);
	
	//Deep Gnome
	
	public final Race gnomeDeep = new Race(GNOME_NAME, GNOME_NAME_DEEP,
			GNOME_RACIALBONUS, GNOME_SUBRACEBONUS_DEEP, GNOME_RESISTANCES,
			GNOME_LANGUAGES_DEEP, GNOME_SPEED, GNOME_DARKVISION_DEEP, GNOME_FEATURES,
			GNOME_FEATURES_DEEP, GNOME_PROFICIENCIES, GNOME_PROFICIENCIES_DEEP);
	
	/* Half Elf - Player's Handbook
	 * Subraces: None
	 */
	
	public final Race halfElf = new Race(HALFELF_NAME, HALFELF_RACIALBONUS,
			HALFELF_RESISTANCES, HALFELF_LANGUAGES, HALFELF_SPEED, HALFELF_DARKVISION,
			HALFELF_FEATURES, HALFELF_PROFICIENCIES);
	
	/* Half Orc - Player's Handbook
	 * Subraces: None
	 */
	
	public final Race halfOrc = new Race(HALFORC_NAME, HALFORC_RACIALBONUS,
			HALFORC_RESISTANCES, HALFORC_LANGUAGES, HALFORC_SPEED, HALFORC_DARKVISION,
			HALFORC_FEATURES, HALFORC_PROFICIENCIES);
	
	/* Halfling - Player's Handbook
	 * Subraces: Lightfoot, Stout
	 */
	
	//Halfling reference
	public final Race halfling = new Race(HALFLING_NAME, HALFLING_RACIALBONUS, HALFLING_RESISTANCES,
			HALFLING_LANGUAGES, HALFLING_SPEED, HALFLING_DARKVISION, HALFLING_FEATURES, HALFLING_PROFICIENCIES);
	
	public final Race halflingLightfoot = new Race(HALFLING_NAME, HALFLING_NAME_LIGHTFOOT,
			HALFLING_RACIALBONUS, HALFLING_SUBRACEBONUS_LIGHTFOOT, HALFLING_RESISTANCES, 
			HALFLING_LANGUAGES, HALFLING_SPEED, HALFLING_DARKVISION, HALFLING_FEATURES, 
			HALFLING_FEATURES_LIGHTFOOT, HALFLING_PROFICIENCIES, HALFLING_PROFICIENCIES_LIGHTFOOT);
	
	public final Race halflingStout = new Race(HALFLING_NAME, HALFLING_NAME_STOUT, 
			HALFLING_RACIALBONUS, HALFLING_SUBRACEBONUS_STOUT, HALFLING_RESISTANCES_STOUT,
			HALFLING_LANGUAGES, HALFLING_SPEED, HALFLING_DARKVISION, HALFLING_FEATURES,
			HALFLING_FEATURES_STOUT, HALFLING_PROFICIENCIES, HALFLING_PROFICIENCIES_STOUT);
	
	/* Human - Player's Handbook
	 * Subraces: None
	 */
	
	public final Race human = new Race(HUMAN_NAME, HUMAN_RACIALBONUS, HUMAN_RESISTANCES,
			HUMAN_LANGUAGES, HUMAN_SPEED, HUMAN_DARKVISION, HUMAN_FEATURES, HUMAN_PROFICIENCIES);
	
	/* Tiefling - Player's Handbook
	 * Subraces: None
	 */
	
	public final Race tiefling = new Race(TIEFLING_NAME, TIEFLING_RACIALBONUS,TIEFLING_RESISTANCES,
			TIEFLING_LANGUAGES, TIEFLING_SPEED, TIEFLING_DARKVISION, TIEFLING_FEATURES, TIEFLING_PROFICIENCIES);
	
	
	//CLASSES
	
	//Barbarian
	public final Barbarian Barbarian = new Barbarian(BARBARIAN_NAME, BARBARIAN_BASEHP, BARBARIAN_HITDICE, BARBARIAN_NUMHITDIE, 1);
	public final Feature rage = new Feature("Rage", "You can enter a rage as a bonus action. During your rage you have advantage on all "
			+ "Strength checks and Strength saving throws, When you make a melee weapon attack using Strength, you gain a bonus to the "
			+ "damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table, You "
			+ "have resistance to bludgeoning, piercing, and slashing damage.");
	public final Feature recklessAttack = new Feature("Reckless Attack", "Starting at 2nd level, when you make your first attack on your turn, "
			+ "you can decide to attack recklessly. Doing so gives you advantage on all melee weapon attack rolls using Strength during that "
			+ "turn, but attack rolls against you are rolled with advantage until the beginning of your next turn.");
	
	//Bard
	public final Bard Bard = new Bard("Bard", 8, d8, 1, 1);
	public final Feature songOfRest = new Feature();
	public final Feature jackOfAllTrades = new Feature("Jack of All Trades", "Starting at 2nd level, you can add half your proficiency "
			+ "bonus, rounded down, to any ability check you make that doesn't already include your proficiency bonus.");
	
	/*
	 *  SPELLS
	 */
	
	public final Spell dancingLights = new Spell("Dancing Lights", 0,  true, true, true, "A bit of Phosphorus or wychwood, or a glowworm",
			"Action", "One Minute", 120, "You create up to four torch-sized lights within range, making them appear as torches, lanterns,"
					+ " or glowing orbs that hover in the air for the duration. You can also combine the four lights into one glowing "
					+ "vaguely humanoid form of Medium size. Whichever form you choose, each light sheds dim light in a 10- foot radius.\r\n" + 
					"\r\n" + 
					"As a bonus action on your turn, you can move the lights up to 60 feet to a new spot within range. A light must be within"
					+ " 20 feet of another light created by this spell, and a light winks out if it exceeds the spell's range.", true);
	
	public final Spell light = new Spell("Light", 0,  true, false, true, "A firefly or phosphorescent moss",
			"Action", "One Hour", 0, "You touch one object that is no larger than 10 feet in any dimension. Until the spell ends, the object sheds "
					+ "bright light in a 20-foot radius and dim light for an additional 20 feet. The light can be colored as you like. Completely "
					+ "covering the object with something opaque blocks the light. The spell ends if you cast it again or dismiss it as an action.\r\n" + 
					"\r\n" + 
					"If you target an object held or worn by a hostile creature, that creature must succeed on a Dexterity saving throw to avoid "
					+ "the spell.", false);
	
	public final Spell mending = new Spell("Mending", 0, true, true, true, "Two lodestones", "Action", "Instantanous", 0, "This spell repairs a "
			+ "single break or tear in an object you touch, such as a broken chain link, two halves of a broken key, a torn cloak, or a leaking wineskin. "
			+ "As long as the break or tear is no larger than 1 foot in any dimension, you mend it, leaving no trace of the former damage. This spell "
			+ "can physically repair a magic item or construct, but the spell can't restore magic to such an object.", false);
	
	public final Spell message = new Spell("Message", 0, true, true, true, "A short piece of copper wire", "Action", "1 round", 120, "You point your finger "
			+ "toward a creature within range and whisper a message. The target (and only the target) hears the message and can reply in a whisper that only "
			+ "you can hear.\r\n" + 
			"\r\n" + 
			"", false);
	
	public final Spell viciousMockery = new Spell("Vicious Mockery", 0, true, false, false, "" , "Action", "Instantanous", 60, "You unleash a string of "
			+ "insults laced with subtle enchantments at a creature you can see within range. If the target can hear you (though it need not understand you), "
			+ "it must succeed on a Wisdom saving throw or take 1d4 psychic damage and have disadvantage on the next attack roll it makes before the end of its "
			+ "next turn.\r\n", false, VICIOUSMOCKERY);
	
	//Lvl one 
	public final Spell charmPerson = new Spell("Charm Person", 1, true, true, false, "", "Action", "One hour", 30, "You attempt to charm a humanoid you can see "
			+ "within range. It must make a Wisdom saving throw, and does so with advantage if you or your companions are fighting it. If it fails the saving throw,"
			+ " it is charmed by you until the spell ends or until you or your companions do anything harmful to it. The charmed creature regards you as a friendly "
			+ "acquaintance. When the spell ends, the creature knows it was charmed by you.", false);
	
	public final Spell comprehendLanguages = new Spell("Comprehend Languages", 1, true, true, true, "Soot or Salt", "Action", "One hour", 0, "You understand any spoken "
			+ "language that you hear while the spell lasts. While touching the surface where words are written, you can also understand any written language you see. "
			+ "One page of text can be read in approximately 1 minute.", false);
	
	public final Spell cureWounds = new Spell("Cure Wounds", 1, true, true, false, "", "Action", "Instananous", 0, "A creature you touch regains a number of hit points "
			+ "equal to 1d8 + your spellcasting ability modifier. This spell has no effect on undead or constructs.\r\n", false, CUREWOUNDS);
	
	public final Spell disguiseSelf = new Spell("Disguise Self", 1, true, true, false, "", "Action", "Instananous", 0, "You make yourself--including your clothing, armor, "
			+ "weapons, and other belongings on your person--look different until the spell ends or until you use your action to dismiss it. You can seem 1 foot shorter "
			+ "or taller and can appear thin, fat, or in between. You can't change your body type, so you must adopt a form that has the same basic arrangement of limbs."
			+ " Otherwise, the extent of the illusion is up to you.", false);
	

}
