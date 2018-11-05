package edu.century.finalProject;

public interface PHB extends Constants{
	
	/* Dragonborn Races - Player's Handbook
	 * Subraces = Colors
	 */
	
	//Black Dragonborn
	public final Race dragonbornBlack = new Race(DRAGONBORN_NAME, "Black", 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_BLACK, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Blue Dragonborn
	public final Race dragonbornBlue = new Race(DRAGONBORN_NAME, "Blue", 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_BLUE, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Brass Dragonborn
	public final Race dragonbornBrass = new Race(DRAGONBORN_NAME, "Brass", 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_BRASS, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Bronze Dragonborn
	public final Race dragonbornBronze = new Race(DRAGONBORN_NAME, "Bronze",
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_BRONZE, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE,
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Copper Dragonborn
	public final Race dragonbornCopper = new Race(DRAGONBORN_NAME, "Copper", 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_COPPER, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Gold Dragonborn
	public final Race dragonbornGold = new Race(DRAGONBORN_NAME, "Gold", 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_GOLD, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Green Dragonborn
	public final Race dragonbornGreen = new Race(DRAGONBORN_NAME, "Green", 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_GREEN, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Red Dragonborn
	public final Race dragonbornRed = new Race(DRAGONBORN_NAME, "Red", 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_RED, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//Silver Dragonborn
	public final Race dragonbornSilver = new Race(DRAGONBORN_NAME, "Silver", 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_SILVER, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);
	
	//White Dragonborn
	public final Race dragonbornWhite = new Race(DRAGONBORN_NAME, "White", 
			DRAGONBORN_RACIALBONUS, DRAGONBORN_SUBRACEBONUS, 
			DRAGONBORN_RESISTANCES_WHITE, DRAGONBORN_LANGUAGES, 
			DRAGONBORN_SPEED, DRAGONBORN_DARKVISION, DRAGONBORN_FEATURE, 
			DRAGONBORN_SUBRACE_FEATURE, 
			DRAGONBORN_PROFICIENCIES, DRAGONBORN_PROFICIENCIES_SUBRACE);

	
	/* Dwarf Races - Player's Handbook
	 * Subraces: Hill, Mountain
	 */
	
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
			
}
