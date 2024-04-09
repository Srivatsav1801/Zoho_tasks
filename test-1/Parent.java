class Parent{
	public static void main(String[] args){
		int count = 0,i;
		String string = "";
		Map<String,Integer> map = new HashMap<>();
		System.out.println("Enter the string: ");
		for(i=0;i<string.length();i++){
			if(string.charAt(i) == "("){
				map.put("(",map.getOrDefault("(",0)+1);
			}
			if(string.charAt(i) == "("){
				if(count>=0){
					map.put("(",map.getOrDefault("(",0)-1);
					if(map.get("(")>=0){
						count++;
					}
				}
			}
		}
		if(count<=0){
			System.out.println("-1");
		}
		else{
			System.out.println(count);
		}
	}
}