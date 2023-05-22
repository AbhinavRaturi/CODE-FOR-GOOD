class program118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangleList = new ArrayList<>();
		for(int i = 1; i<=numRows; i++){
			List<Integer> tempList = new ArrayList<>();
			for(int j = 1; j<=i;j++){
				tempList.add(generateValue(i-1, j-1));
			}
			pascalTriangleList.add(tempList);
		}
		return pascalTriangleList;
    }
	public int generateValue(int row, int col){
		int ans = 1;
		for(int i = 0;i< col;i++){
			ans = ans*(row-i);
			ans = ans/(i+1);
		}
		return ans;
	}
}