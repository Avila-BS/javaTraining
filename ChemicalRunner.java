class ChemicalRunner
{
public static void main(String[] chemicals)
{
	int size=chemicals.length;
	System.out.println(size);
	for(int chemicalIndex=0;chemicalIndex<size;chemicalIndex++)
	{
		System.out.println(chemicals[chemicalIndex]);
	}
}
}