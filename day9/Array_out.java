class Array_out{
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7};
		try{
			for(int i = 0;i<= array.length;i++){
			System.out.print(array[i] + " ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception thrown: " + e.toString());
		}
		
	}
}