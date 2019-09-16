package model;

public class Blocks {

	private int tag;
	private int quantify;
	
	public Blocks(int tag, int quantify) {
		this.tag = tag;
		this.quantify = quantify;
	}
	public void addBlocks(Blocks block) {
		int temp = quantify;
		if(temp+block.getQuantify()<64) {
			quantify = quantify+block.getQuantify();
			block.setQuantify(0);
		}else if(temp+block.getQuantify()>64){
			int max = temp>block.getQuantify()?temp:block.getQuantify();
			int min = temp<block.getQuantify()?temp:block.getQuantify();
			int extraQuantity = (max-64)+min;
			int f = 64-max;
			quantify = max+f;
			block.setQuantify(extraQuantity);
		}
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public int getQuantify() {
		return quantify;
	}
	public void setQuantify(int quantify) {
		this.quantify = quantify;
	}
}
