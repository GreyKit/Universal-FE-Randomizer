package fedata.gcnwii.fe9;

import java.util.Arrays;

import fedata.general.FEModifiableData;
import util.WhyDoesJavaNotHaveThese;

public class FE9ChapterUnit implements FEModifiableData {
	
	public static final int CharacterIDOffset = 0x0;
	public static final int ClassIDOffset = 0x4;
	public static final int Weapon1Offset = 0xC;
	public static final int Weapon2Offset = 0x10;
	public static final int Weapon3Offset = 0x14;
	public static final int Weapon4Offset = 0x18;
	
	public static final int Item1Offset = 0x1C;
	public static final int Item2Offset = 0x20;
	public static final int Item3Offset = 0x24;
	public static final int Item4Offset = 0x28;
	
	public static final int Skill1Offset = 0x2C;
	public static final int Skill2Offset = 0x30;
	public static final int Skill3Offset = 0x34;
	public static final int Skill4Offset = 0x38;
	
	private byte[] originalData;
	private byte[] data;
	
	private long originalOffset;
	
	private Boolean wasModified = false;
	private Boolean hasChanges = false;
	
	private Long cachedCharacterIDPointer;
	private Long cachedClassIDPointer;
	
	private Long cachedWeapon1Pointer;
	private Long cachedWeapon2Pointer;
	private Long cachedWeapon3Pointer;
	private Long cachedWeapon4Pointer;
	
	private Long cachedItem1Pointer;
	private Long cachedItem2Pointer;
	private Long cachedItem3Pointer;
	private Long cachedItem4Pointer;
	
	private Long cachedSkill1Pointer;
	private Long cachedSkill2Pointer;
	private Long cachedSkill3Pointer;
	private Long cachedSkill4Pointer;
	
	public FE9ChapterUnit(byte[] data, long originalOffset) {
		super();
		this.originalData = data;
		this.data = data;
		this.originalOffset = originalOffset;
	}
	
	public long getCharacterIDPointer() {
		if (cachedCharacterIDPointer == null) { cachedCharacterIDPointer = readPointerAtOffset(CharacterIDOffset); }
		return cachedCharacterIDPointer;
	}
	
	public void setCharacterIDPointer(long pidPtr) {
		cachedCharacterIDPointer = pidPtr;
		writePointerToOffset(pidPtr, CharacterIDOffset);
		wasModified = true;
	}
	
	public long getClassIDPointer() {
		if (cachedClassIDPointer == null) { cachedClassIDPointer = readPointerAtOffset(ClassIDOffset); }
		return cachedClassIDPointer;
	}
	
	public void setClassIDPointer(long jidPtr) {
		cachedClassIDPointer = jidPtr;
		writePointerToOffset(jidPtr, 0x4);
		wasModified = true;
	}
	
	public long getWeapon1Pointer() {
		if (cachedWeapon1Pointer == null) { cachedWeapon1Pointer = readPointerAtOffset(Weapon1Offset); }
		return cachedWeapon1Pointer;
	}
	
	public void setWeapon1Pointer(long iidPtr) {
		cachedWeapon1Pointer = iidPtr;
		writePointerToOffset(iidPtr, Weapon1Offset);
		wasModified = true;
	}
	
	public long getWeapon2Pointer() {
		if (cachedWeapon2Pointer == null) { cachedWeapon2Pointer = readPointerAtOffset(Weapon2Offset); }
		return cachedWeapon2Pointer;
	}
	
	public void setWeapon2Pointer(long iidPtr) {
		cachedWeapon2Pointer = iidPtr;
		writePointerToOffset(iidPtr, Weapon2Offset);
		wasModified = true;
	}
	
	public long getWeapon3Pointer() {
		if (cachedWeapon3Pointer == null) { cachedWeapon3Pointer = readPointerAtOffset(Weapon3Offset); }
		return cachedWeapon3Pointer;
	}
	
	public void setWeapon3Pointer(long iidPtr) {
		cachedWeapon3Pointer = iidPtr;
		writePointerToOffset(iidPtr, Weapon3Offset);
		wasModified = true;
	}
	
	public long getWeapon4Pointer() {
		if (cachedWeapon4Pointer == null) { cachedWeapon4Pointer = readPointerAtOffset(Weapon4Offset); }
		return cachedWeapon4Pointer;
	}
	
	public void setWeapon4Pointer(long iidPtr) {
		cachedWeapon4Pointer = iidPtr;
		writePointerToOffset(iidPtr, Weapon4Offset);
		wasModified = true;
	}
	
	public long getItem1Pointer() {
		if (cachedItem1Pointer == null) { cachedItem1Pointer = readPointerAtOffset(Item1Offset); }
		return cachedItem1Pointer;
	}
	
	public void setItem1Pointer(long iidPtr) {
		cachedItem1Pointer = iidPtr;
		writePointerToOffset(iidPtr, Item1Offset);
		wasModified = true;
	}
	
	public long getItem2Pointer() {
		if (cachedItem2Pointer == null) { cachedItem2Pointer = readPointerAtOffset(Item2Offset); }
		return cachedItem2Pointer;
	}
	
	public void setItem2Pointer(long iidPtr) {
		cachedItem2Pointer = iidPtr;
		writePointerToOffset(iidPtr, Item2Offset);
		wasModified = true;
	}
	
	public long getItem3Pointer() {
		if (cachedItem3Pointer == null) { cachedItem3Pointer = readPointerAtOffset(Item3Offset); }
		return cachedItem3Pointer;
	}
	
	public void setItem3Pointer(long iidPtr) {
		cachedItem3Pointer = iidPtr;
		writePointerToOffset(iidPtr, Item3Offset);
		wasModified = true;
	}
	
	public long getItem4Pointer() {
		if (cachedItem4Pointer == null) { cachedItem4Pointer = readPointerAtOffset(Item4Offset); }
		return cachedItem4Pointer;
	}
	
	public void setItem4Pointer(long iidPtr) {
		cachedItem4Pointer = iidPtr;
		writePointerToOffset(iidPtr, Item4Offset);
		wasModified = true;
	}
	
	public long getSkill1Pointer() {
		if (cachedSkill1Pointer == null) { cachedSkill1Pointer = readPointerAtOffset(Skill1Offset); }
		return cachedSkill1Pointer;
	}
	
	public void setSkill1Pointer(long sidPtr) {
		cachedSkill1Pointer = sidPtr;
		writePointerToOffset(sidPtr, Skill1Offset);
		wasModified = true;
	}
	
	public long getSkill2Pointer() {
		if (cachedSkill2Pointer == null) { cachedSkill2Pointer = readPointerAtOffset(Skill2Offset); }
		return cachedSkill2Pointer;
	}
	
	public void setSkill2Pointer(long sidPtr) {
		cachedSkill2Pointer = sidPtr;
		writePointerToOffset(sidPtr, Skill2Offset);
		wasModified = true;
	}
	
	public long getSkill3Pointer() {
		if (cachedSkill3Pointer == null) { cachedSkill3Pointer = readPointerAtOffset(Skill3Offset); }
		return cachedSkill3Pointer;
	}
	
	public void setSkill3Pointer(long sidPtr) {
		cachedSkill3Pointer = sidPtr;
		writePointerToOffset(sidPtr, Skill3Offset);
		wasModified = true;
	}
	
	public int getStartingX() {
		return data[0x5C];
	}
	
	public int getStartingY() {
		return data[0x5D];
	}
	
	public int getEndingX() {
		return data[0x5E];
	}
	
	public int getEndingY() {
		return data[0x5F];
	}
	
	public int getStartingLevel() {
		return data[0x60];
	}
	
	public void setStartingLevel(int level) {
		data[0x60] = (byte)(level & 0xFF);
		wasModified = true;
	}
	
	private long readPointerAtOffset(int offset) {
		byte[] ptr = Arrays.copyOfRange(data, offset, offset + 4);
		if (WhyDoesJavaNotHaveThese.byteArraysAreEqual(ptr, new byte[] {0, 0, 0, 0})) { return 0; }
		
		return WhyDoesJavaNotHaveThese.longValueFromByteArray(ptr, false) + 0x20;
	}
	
	private void writePointerToOffset(long pointer, int offset) {
		byte[] ptr = pointer == 0 ? new byte[] {0, 0, 0, 0} : WhyDoesJavaNotHaveThese.bytesFromPointer(pointer - 0x20);
		WhyDoesJavaNotHaveThese.copyBytesIntoByteArrayAtIndex(ptr, data, offset, 4);
	}
	
	public void resetData() {
		data = originalData;
		wasModified = false;
	}
	
	public void commitChanges() {
		if (wasModified) {
			hasChanges = true;
		}
		wasModified = false;
	}
	
	public Boolean hasCommittedChanges() {
		return hasChanges;
	}
	
	public byte[] getData() {
		return data;
	}
	
	public void setData(byte[] newData) {
		data = Arrays.copyOf(newData, newData.length);
		wasModified = true;
	}
	
	public Boolean wasModified() {
		return wasModified;
	}
	
	public long getAddressOffset() {
		return originalOffset;
	}
}
