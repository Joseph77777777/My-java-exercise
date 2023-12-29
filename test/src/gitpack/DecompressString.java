/*@author Joseph Nakhle 

@version: 2023-03 (4.27.0)
@since release 12/27/23 
*/

package gitpack;

public class DecompressString {
public static String Decompress(String compressed) {
	StringBuilder result=new StringBuilder();
	int i=0;
	while(i<compressed.length()) {
		char currentChar=compressed.charAt(i);
		if(Character.isDigit(currentChar)) {
			int startindex=i;
			while(Character.isDigit(compressed.charAt(i+1))) {
				i++;
			}
			int repeatCount=Integer.parseInt(compressed.substring(startindex,i+1));
			i=i+2;
			
			String nestedDecompress=Decompress(compressed);
			for(int j=0;j<repeatCount;j++) {
				result.append(nestedDecompress);
				
			}
			i++;
		}
		else if(currentChar==']') {
			return result.toString();
		}
		else {
			result.append(currentChar);
			i++;
		}
		
	}
	return result.toString();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String CompressedString="3[abc]a[ab]c";
String Decompressor=Decompress(CompressedString);
System.out.println("Before decompressing :"+ CompressedString);

System.out.println("After decompressing : " +Decompressor);

	}

}
