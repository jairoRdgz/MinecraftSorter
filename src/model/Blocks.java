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
		if (temp + block.getQuantify() < 64) {
			quantify = quantify + block.getQuantify();
			System.out.println("monto:" + quantify);
			block.setQuantify(0);
		} else {
			int diference = quantify - 64;
			quantify += diference;
			block.setQuantify(block.getQuantify() - diference);
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